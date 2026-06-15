package com.bernardo.restaurante_bd.repository;
import com.bernardo.restaurante_bd.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository <Pedido, Integer>{
    
}
