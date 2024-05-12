 package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.UsuarioProgramacion;
import com.example.active_fit_back.repository.UsuarioProgramacionRepository;
import com.example.active_fit_back.repository.UsuarioProgramacionRepository;
import com.example.active_fit_back.services.ProgramacionRutinaService;
import com.example.active_fit_back.services.UsuarioProgramacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioProgramacionServiceImpl implements UsuarioProgramacionService {

    @Autowired
    private UsuarioProgramacionRepository UsuarioProgramacionRepository;

    @Override
    public List<UsuarioProgramacion> findAll() {
        List<UsuarioProgramacion> usuarioProgramaciones = UsuarioProgramacionRepository.findAll();
        return usuarioProgramaciones;
    }

    @Override
    public Long save(UsuarioProgramacion usuarioProgramacion) {
        UsuarioProgramacionRepository.save(usuarioProgramacion);
        return  usuarioProgramacion.getId();
    }

    @Override
    public void delete(Long id) {
        if (UsuarioProgramacionRepository.existsById(id)) {
            UsuarioProgramacionRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, UsuarioProgramacion usuarioProgramacion) {
        if (UsuarioProgramacionRepository.existsById(id)) {
            UsuarioProgramacionRepository.save(usuarioProgramacion);
        } else {
            throw new RuntimeException("No se encontro ");
        }
    }
}
