package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Ejercicio;
import com.example.active_fit_back.model.Ejercicio;
import com.example.active_fit_back.repository.EjercicioRepository;
import com.example.active_fit_back.services.EjercicioService;
import com.example.active_fit_back.services.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioServiceImpl implements EjercicioService {

    @Autowired
    private EjercicioRepository ejercicioRepository;

    @Override
    public List<Ejercicio> findAll() {
        List<Ejercicio> ejercicios = ejercicioRepository.findAll();
        return ejercicios;
    }

    @Override
    public Long save(Ejercicio ejercicio) {
        ejercicioRepository.save(ejercicio);
        return  ejercicio.getId();
    }

    @Override
    public void delete(Long id) {
        if (ejercicioRepository.existsById(id)) {
            ejercicioRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Ejercicio ejercicio) {
        if (ejercicioRepository.existsById(id)) {
            ejercicioRepository.save(ejercicio);
        } else {
            throw new RuntimeException("No se encontro la Ejercicio");
        }

    }
}
