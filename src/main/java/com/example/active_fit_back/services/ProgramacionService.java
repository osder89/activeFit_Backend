package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Programacion;

import java.util.List;


public interface ProgramacionService {


    List<Programacion> findAll();


    Long save(Programacion programacion);

    void delete(Long id);

    void update(Long id, Programacion programacion);

}
