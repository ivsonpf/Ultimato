package br.com.cetam.ultimatofinal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    // Relacionamento N:1 (Vários pedidos para um Cliente)
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @CreationTimestamp
    @Column(name = "data_pedido", updatable = false)
    private LocalDateTime dataPedido;

    @Column(length = 20)
    private String status = "PENDENTE"; // Valor padrão

    @Column(precision = 10, scale = 2)
    private BigDecimal total;
}