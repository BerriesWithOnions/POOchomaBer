package com.example.crudproject.repository;

import com.example.crudproject.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Exercício 5: método declarativo — o Spring Data JPA lê o NOME do método
    // e monta a query "SELECT * FROM cliente WHERE email = ?" sozinho.
    // Optional evita NullPointerException quando não encontra ninguém.
    Optional<Cliente> findByEmail(String email);
}
