package com.example.active_fit_back.services;


import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.RutinaEjercicio;

import java.util.List;


public interface ProgramacionRutinaService {


    List<ProgramacionRutina> findAll();

    Long save(ProgramacionRutina programacionRutina);

    void delete(Long id);

    void update(Long id, ProgramacionRutina programacionRutina);

}
