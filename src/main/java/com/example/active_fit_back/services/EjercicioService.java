package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.model.Ejercicio;

import java.util.List;


public interface EjercicioService {


    List<Ejercicio> findAll();


    Long save(Ejercicio ejercicio);

    void delete(Long id);

    void update(Long id, Ejercicio ejercicio);

}
