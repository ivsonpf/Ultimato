package br.com.cetam.ultimatofinal.repository;

import br.com.cetam.ultimatofinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marca a interface como um componente de acesso a dados
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Só com essa herança, você já ganha métodos como save(), findAll(), findById(), deleteById()
}