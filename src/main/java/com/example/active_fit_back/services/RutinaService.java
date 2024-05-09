package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Rutina;

import java.util.List;


public interface RutinaService {


    List<Rutina> findAll();


    Long save(Rutina rutina);

    void delete(Long id);

    void update(Long id, Rutina rutina);

}
