package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.model.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {

    List<Ejercicio> findAll();
    Ejercicio save(Ejercicio ejercicio);
    void delete(Ejercicio ejercicio);
    Optional<Ejercicio> findById(Long id);

}
