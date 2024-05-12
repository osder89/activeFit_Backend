package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.RutinaEjercicio;
import com.example.active_fit_back.repository.ProgramacionRutinaRepository;
import com.example.active_fit_back.services.ProgramacionRutinaService;
import com.example.active_fit_back.services.RutinaEjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramacionRutinaServiceImpl implements ProgramacionRutinaService {

    @Autowired
    private ProgramacionRutinaRepository programacionRutinaRepository;

    @Override
    public List<ProgramacionRutina> findAll() {
        List<ProgramacionRutina> programacionRutinas = programacionRutinaRepository.findAll();
        return programacionRutinas;
    }

    @Override
    public Long save(ProgramacionRutina programacionRutinas) {
        programacionRutinaRepository.save(programacionRutinas);
        return  programacionRutinas.getId();
    }

    @Override
    public void delete(Long id) {
        if (programacionRutinaRepository.existsById(id)) {
            programacionRutinaRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, ProgramacionRutina programacionRutina) {
        if (programacionRutinaRepository.existsById(id)) {
            programacionRutinaRepository.save(programacionRutina);
        } else {
            throw new RuntimeException("No se encontro ");
        }
    }
}
