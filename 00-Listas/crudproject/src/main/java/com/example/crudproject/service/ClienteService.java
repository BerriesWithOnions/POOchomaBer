package com.example.crudproject.service;

import com.example.crudproject.exception.RecursoNaoEncontradoException;
import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Cliente;
import com.example.crudproject.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Cliente não encontrado com id " + id));
    }

    // Exercício 5: busca personalizada por email
    public Cliente buscarPorEmail(String email) {
        return clienteRepository.findByEmail(email)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Cliente não encontrado com email " + email));
    }

    public Cliente salvar(Cliente cliente) {
        validar(cliente);
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Long id, Cliente dadosAtualizados) {
        Cliente existente = buscarPorId(id);
        validar(dadosAtualizados);

        existente.setNome(dadosAtualizados.getNome());
        existente.setEmail(dadosAtualizados.getEmail());
        existente.setTelefone(dadosAtualizados.getTelefone());

        return clienteRepository.save(existente);
    }

    public void deletar(Long id) {
        Cliente existente = buscarPorId(id);
        clienteRepository.delete(existente);
    }

    // Exercício 4: nome e email obrigatórios, telefone opcional
    private void validar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new ValidacaoException("O nome do cliente não pode ser vazio.");
        }
        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            throw new ValidacaoException("O email do cliente não pode ser vazio.");
        }
        // telefone é opcional — nenhuma validação necessária aqui
    }
}
