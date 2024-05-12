package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Ejercicio;
import com.example.active_fit_back.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findAll();
    Usuario save(Usuario usuario);
    void delete(Usuario usuario);
    Optional<Usuario> findById(Long id);
    Optional<Usuario> findByEmail(String email);


}
