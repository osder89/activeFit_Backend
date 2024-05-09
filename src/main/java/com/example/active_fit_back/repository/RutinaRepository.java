package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.model.Rutina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RutinaRepository extends JpaRepository<Rutina, Long> {

    List<Rutina> findAll();
    Rutina save(Rutina rutina);
    void delete(Rutina rutina);
    Optional<Rutina> findById(Long id);

}
