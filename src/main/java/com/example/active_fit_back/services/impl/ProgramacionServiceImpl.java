package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Programacion;
import com.example.active_fit_back.repository.ProgramacionRepository;
import com.example.active_fit_back.services.ProgramacionService;
import com.example.active_fit_back.services.ProgramacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramacionServiceImpl implements ProgramacionService {

    @Autowired
    private ProgramacionRepository programacionRepository;

    @Override
    public List<Programacion> findAll() {
        List<Programacion> programacion = programacionRepository.findAll();
        return programacion;
    }

    @Override
    public Long save(Programacion programacion) {
        programacionRepository.save(programacion);
        return  programacion.getId();
    }

    @Override
    public void delete(Long id) {
        if (programacionRepository.existsById(id)) {
            programacionRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Programacion programacion) {
        if (programacionRepository.existsById(id)) {
            programacionRepository.save(programacion);
        } else {
            throw new RuntimeException("No se encontro la Programacion");
        }
    }
}
