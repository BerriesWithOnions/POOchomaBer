package com.bernas.gekko.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernas.gekko.Model.Pedido;

@Service
public class PedidoService {
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> lerLista(){
        return this.pedidos;
    }
}