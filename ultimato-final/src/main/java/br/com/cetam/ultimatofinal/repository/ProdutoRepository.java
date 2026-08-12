package br.com.cetam.ultimatofinal.repository;

import br.com.cetam.ultimatofinal.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}