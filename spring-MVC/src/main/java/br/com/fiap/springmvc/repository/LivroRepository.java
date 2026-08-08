package br.com.fiap.springmvc.repository;

import br.com.fiap.springmvc.model.Livro;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
