package br.com.cetam.ultimatofinal.repository;

import br.com.cetam.ultimatofinal.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}