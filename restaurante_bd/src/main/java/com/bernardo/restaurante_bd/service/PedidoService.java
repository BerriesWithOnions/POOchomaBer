package com.bernardo.restaurante_bd.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bernardo.restaurante_bd.repository.PedidoRepository;

public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
}
