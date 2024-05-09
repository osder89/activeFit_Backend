package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Rutina;
import com.example.active_fit_back.repository.RutinaRepository;
import com.example.active_fit_back.services.RutinaService;
import com.example.active_fit_back.services.RutinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaServiceImpl implements RutinaService {

    @Autowired
    private RutinaRepository rutinaRepository;

    @Override
    public List<Rutina> findAll() {
        List<Rutina> rutinas = rutinaRepository.findAll();
        return rutinas;
    }

    @Override
    public Long save(Rutina rutina) {
        rutinaRepository.save(rutina);
        return  rutina.getId();
    }

    @Override
    public void delete(Long id) {
        if (rutinaRepository.existsById(id)) {
            rutinaRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Rutina rutina) {
        if (rutinaRepository.existsById(id)) {
            rutinaRepository.save(rutina);
        } else {
            throw new RuntimeException("No se encontro la Rutina");
        }
    }
}
