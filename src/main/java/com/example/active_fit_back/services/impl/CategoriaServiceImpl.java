package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.repository.CategoriaRepository;
import com.example.active_fit_back.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }

    @Override
    public Long save(Categoria categoria) {
        categoriaRepository.save(categoria);
        return  categoria.getId();
    }

    @Override
    public void delete(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Categoria categoria) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.save(categoria);
        } else {
            throw new RuntimeException("No se encontro la categoria");
        }

    }
}
