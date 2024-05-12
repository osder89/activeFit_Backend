package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Rutina;
import com.example.active_fit_back.model.RutinaEjercicio;
import com.example.active_fit_back.repository.RutinaEjercicioRepository;

import com.example.active_fit_back.services.RutinaEjercicioService;
import com.example.active_fit_back.services.RutinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaEjercicioServiceImpl implements RutinaEjercicioService {

    @Autowired
    private RutinaEjercicioRepository rutinaEjercicioRepository;

    @Override
    public List<RutinaEjercicio> findAll() {
        List<RutinaEjercicio> rutinaEjercicios = rutinaEjercicioRepository.findAll();
        return rutinaEjercicios;
    }

    @Override
    public Long save(RutinaEjercicio rutinaEjercicio) {
        rutinaEjercicioRepository.save(rutinaEjercicio);
        return  rutinaEjercicio.getId();
    }

    @Override
    public void delete(Long id) {
        if (rutinaEjercicioRepository.existsById(id)) {
            rutinaEjercicioRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, RutinaEjercicio rutinaEjercicio) {
        if (rutinaEjercicioRepository.existsById(id)) {
            rutinaEjercicioRepository.save(rutinaEjercicio);
        } else {
            throw new RuntimeException("No se encontro la Rutina");
        }
    }
}
