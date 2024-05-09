package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Rol;

import java.util.List;


public interface RolService {


    List<Rol> findAll();

    Long save(Rol rol);

    void delete(Long id);

    void update(Long id, Rol Rol);

}
