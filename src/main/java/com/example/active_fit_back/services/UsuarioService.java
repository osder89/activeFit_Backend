package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Usuario;

import java.util.List;


public interface UsuarioService {


    List<Usuario> findAll();


    Long save(Usuario Usuario);

    void delete(Long id);

    void update(Long id, Usuario usuario);

    Boolean login (String email, String password);

}
