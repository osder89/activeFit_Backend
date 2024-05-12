package com.example.active_fit_back.services;


import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.UsuarioProgramacion;

import java.util.List;


public interface UsuarioProgramacionService {


    List<UsuarioProgramacion> findAll();

    Long save(UsuarioProgramacion usuarioProgramacion);

    void delete(Long id);

    void update(Long id, UsuarioProgramacion usuarioProgramacion);

}
