package com.example.crudproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Exercício 6: status como enum, nunca como texto livre
    @Enumerated(EnumType.STRING)
    private StatusOrcamento status = StatusOrcamento.PENDENTE;

    // Exercício 11: valor sempre calculado, nunca digitado manualmente
    private Double valorTotal = 0.0;

    // Exercício 9: um orçamento pertence a um único cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Exercício 10 (versão final): um orçamento pode ter vários produtos,
    // e um produto pode aparecer em vários orçamentos.
    @ManyToMany
    @JoinTable(
        name = "orcamento_produto",
        joinColumns = @JoinColumn(name = "orcamento_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos = new ArrayList<>();

    public Orcamento() {
    }

    // Exercício 7: comportamentos de domínio.
    // A entidade sabe mudar o próprio estado — em vez do
    // service fazer "orcamento.setStatus(...)" na mão,
    // ele chama um método que representa uma AÇÃO de negócio.

    public void aprovar() {
        this.status = StatusOrcamento.APROVADO;
    }

    public void rejeitar() {
        this.status = StatusOrcamento.REJEITADO;
    }

    // Exercício 11: cálculo do valor total.
    // Soma o preço de todos os produtos vinculados ao orçamento.

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            if (produto.getPreco() != null) {
                total += produto.getPreco();
            }
        }
        return total;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusOrcamento getStatus() {
        return status;
    }

    public void setStatus(StatusOrcamento status) {
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
