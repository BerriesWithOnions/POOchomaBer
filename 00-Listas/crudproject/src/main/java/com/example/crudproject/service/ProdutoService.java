package com.example.crudproject.service;

import com.example.crudproject.exception.RecursoNaoEncontradoException;
import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Produto não encontrado com id " + id));
    }

    public Produto salvar(Produto produto) {
        validarPreco(produto);
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto dadosAtualizados) {
        // Exercício 2: buscar o produto existente ANTES de salvar
        Produto existente = buscarPorId(id);
        validarPreco(dadosAtualizados);

        existente.setNome(dadosAtualizados.getNome());
        existente.setPreco(dadosAtualizados.getPreco());

        return produtoRepository.save(existente);
    }

    public void deletar(Long id) {
        Produto existente = buscarPorId(id);
        produtoRepository.delete(existente);
    }

    // Exercício 2: regra de negócio — preço não pode ser <= 0
    private void validarPreco(Produto produto) {
        if (produto.getPreco() == null || produto.getPreco() <= 0) {
            throw new ValidacaoException("O preço do produto deve ser maior que zero.");
        }
    }
}
