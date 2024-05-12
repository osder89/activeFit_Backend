package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.UsuarioProgramacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioProgramacionRepository extends JpaRepository<UsuarioProgramacion, Long> {

    List<UsuarioProgramacion> findAll();
    UsuarioProgramacion save(UsuarioProgramacion usuarioProgramacion);
    void delete(UsuarioProgramacion usuarioProgramacion);
    Optional<UsuarioProgramacion> findById(Long id);

}
