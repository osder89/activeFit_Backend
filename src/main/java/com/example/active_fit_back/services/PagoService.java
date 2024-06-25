package com.example.active_fit_back.services;


import com.example.active_fit_back.model.Pago;
import com.example.active_fit_back.model.Rol;

import java.util.List;


public interface PagoService {


    Long save(Pago pago);

    List<Pago> findAllFromPostgres();

    List<Pago> findAllFromRedis();




}
