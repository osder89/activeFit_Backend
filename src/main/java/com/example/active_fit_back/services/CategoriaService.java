package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoriaService {


    List<Categoria> findAll();


    Long save(Categoria categoria);

    void delete(Long id);

    void update(Long id, Categoria categoria);

}
