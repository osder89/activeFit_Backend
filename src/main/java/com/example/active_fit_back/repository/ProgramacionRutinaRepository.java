package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.RutinaEjercicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgramacionRutinaRepository extends JpaRepository<ProgramacionRutina, Long> {

    List<ProgramacionRutina> findAll();
    ProgramacionRutina save(ProgramacionRutina programacionRutina);
    void delete(ProgramacionRutina programacionRutina);
    Optional<ProgramacionRutina> findById(Long id);

}
