package br.com.cetam.ultimatofinal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity // Marca a classe como uma entidade persistente do banco de dados
@Table(name = "cliente") // Diz exatamente qual é o nome da tabela no MySQL
@Data // Anotação do Lombok que cria Getters, Setters, toString, equals e hashCode automaticamente
@NoArgsConstructor // Cria um construtor vazio (exigência do JPA)
@AllArgsConstructor // Cria um construtor com todos os atributos
public class Cliente {

    @Id // Define que este campo é a Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Equivale ao AUTO_INCREMENT do MySQL
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 20)
    private String telefone;

    @Column(length = 255)
    private String endereco;

    @CreationTimestamp // Preenche a data automaticamente quando o cliente for salvo
    @Column(name = "data_cadastro", updatable = false)
    private LocalDateTime dataCadastro;
}