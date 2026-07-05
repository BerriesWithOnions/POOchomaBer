package com.example.crudproject.service;

import com.example.crudproject.exception.RecursoNaoEncontradoException;
import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public List<Orcamento> listar() {
        return orcamentoRepository.findAll();
    }

    public Orcamento buscarPorId(Long id) {
        return orcamentoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Orçamento não encontrado com id " + id));
    }

    // Exercício 12: consulta por status
    public List<Orcamento> buscarPorStatus(StatusOrcamento status) {
        return orcamentoRepository.findByStatus(status);
    }

    public Orcamento salvar(Orcamento orcamento) {
        // Exercício 11: o valor NUNCA é digitado — é sempre recalculado aqui
        orcamento.setValorTotal(orcamento.calcularValorTotal());
        return orcamentoRepository.save(orcamento);
    }

    public Orcamento atualizar(Long id, Orcamento dadosAtualizados) {
        Orcamento existente = buscarPorId(id);

        existente.setCliente(dadosAtualizados.getCliente());
        existente.setProdutos(dadosAtualizados.getProdutos());
        existente.setValorTotal(existente.calcularValorTotal());

        return orcamentoRepository.save(existente);
    }

    // Exercício 7 e 8: ações de negócio, não é só um "setStatus" genérico
    public Orcamento aprovar(Long id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.aprovar(); // comportamento de domínio, vive na própria entidade
        return orcamentoRepository.save(orcamento);
    }

    public Orcamento rejeitar(Long id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.rejeitar();
        return orcamentoRepository.save(orcamento);
    }

    public void deletar(Long id) {
        Orcamento existente = buscarPorId(id);
        orcamentoRepository.delete(existente);
    }
}
