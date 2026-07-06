package com.exemplo.jogovelha.service;

import com.exemplo.jogovelha.exception.DadosInvalidosException;
import com.exemplo.jogovelha.exception.JogadaInvalidaException;
import com.exemplo.jogovelha.exception.PartidaEncerradaException;
import com.exemplo.jogovelha.exception.PartidaNaoEncontradaException;
import com.exemplo.jogovelha.model.Jogador;
import com.exemplo.jogovelha.model.Partida;
import com.exemplo.jogovelha.model.Simbolo;
import com.exemplo.jogovelha.model.StatusPartida;
import com.exemplo.jogovelha.repository.PartidaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public Partida criar(String nomeJogadorX, String nomeJogadorO) {
        validarNome(nomeJogadorX);
        validarNome(nomeJogadorO);

        Jogador jogadorX = new Jogador(nomeJogadorX, Simbolo.X);
        Jogador jogadorO = new Jogador(nomeJogadorO, Simbolo.O);

        Partida partida = new Partida(jogadorX, jogadorO);
        return partidaRepository.save(partida);
    }

    public List<Partida> listar() {
        return partidaRepository.findAll();
    }

    public Partida buscarPorId(Long id) {
        return partidaRepository.findById(id)
                .orElseThrow(() -> new PartidaNaoEncontradaException("Partida não encontrada com id " + id));
    }

    public Partida jogar(Long id, Simbolo simbolo, int linha, int coluna) {
        Partida partida = buscarPorId(id); // 1 e 2

        if (partida.getStatus() != StatusPartida.EM_ANDAMENTO) { // 3
            throw new PartidaEncerradaException("A partida #" + id + " já foi encerrada.");
        }

        if (simbolo != partida.getTurnoAtual()) { // 4
            throw new JogadaInvalidaException(
                    "Não é o turno do símbolo " + simbolo + ". Turno atual: " + partida.getTurnoAtual() + ".",
                    HttpStatus.CONFLICT);
        }

        if (!partida.posicaoValida(linha, coluna)) { // 5
            throw new JogadaInvalidaException(
                    "Linha e coluna devem estar entre 0 e 2.",
                    HttpStatus.BAD_REQUEST);
        }

        if (!partida.posicaoLivre(linha, coluna)) { // 6
            throw new JogadaInvalidaException(
                    "A posição informada já está ocupada.",
                    HttpStatus.CONFLICT);
        }

        partida.marcarPosicao(linha, coluna, simbolo); // 7

        if (partida.verificarVitoria(simbolo)) { // 8
            partida.setStatus(StatusPartida.VITORIA);
            Jogador vencedor = (simbolo == Simbolo.X) ? partida.getJogadorX() : partida.getJogadorO();
            partida.setVencedor(vencedor);
        } else if (partida.tabuleiroCompleto()) { // 9
            partida.setStatus(StatusPartida.EMPATE);
        } else {
            partida.alternarTurno(); // 10
        }

        return partidaRepository.save(partida); // 11
    }

    public void excluir(Long id) {
        Partida partida = buscarPorId(id);
        partidaRepository.delete(partida);
    }

    private void validarNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new DadosInvalidosException("O nome do jogador não pode estar em branco.");
        }
    }
}
