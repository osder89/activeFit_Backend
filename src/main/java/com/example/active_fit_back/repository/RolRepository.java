package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {

    List<Rol> findAll();
    Rol save(Rol rol);
    void delete(Rol rol);
    Optional<Rol> findById(Long id);

}
