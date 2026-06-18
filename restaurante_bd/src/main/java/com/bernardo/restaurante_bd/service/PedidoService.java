package com.bernardo.restaurante_bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernardo.restaurante_bd.model.Pedido;
import com.bernardo.restaurante_bd.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> lerPedidos(){
        return pedidoRepository.findAll();
    }
 
    public Pedido inserirPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
