package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgramacionRepository extends JpaRepository<Programacion, Long> {

    List<Programacion> findAll();
    Programacion save(Programacion programacion);
    void delete(Programacion programacion);
    Optional<Programacion> findById(Long id);

}
