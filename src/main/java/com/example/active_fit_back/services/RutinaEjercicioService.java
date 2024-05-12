package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Rutina;
import com.example.active_fit_back.model.RutinaEjercicio;

import java.util.List;


public interface RutinaEjercicioService {


    List<RutinaEjercicio> findAll();


    Long save(RutinaEjercicio rutinaEjercicio);

    void delete(Long id);

    void update(Long id, RutinaEjercicio rutinaEjercicio);

}
