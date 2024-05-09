package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAll();
    Categoria save(Categoria categoria);
    void delete(Categoria categoria);
    Optional<Categoria> findById(Long id);

}
