package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.RutinaEjercicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RutinaEjercicioRepository extends JpaRepository<RutinaEjercicio, Long> {

    List<RutinaEjercicio> findAll();
    RutinaEjercicio save(RutinaEjercicio rutinaEjercicio);
    void delete(RutinaEjercicio rutinaEjercicio);
    Optional<RutinaEjercicio> findById(Long id);

}
