package com.example.active_fit_back.rest;


import com.example.active_fit_back.model.Pago;
import com.example.active_fit_back.model.Rol;
import com.example.active_fit_back.rest.common.ApiUtil;
import com.example.active_fit_back.rest.common.ResponseGeneric;
import com.example.active_fit_back.rest.exceptions.DataNotFoundException;
import com.example.active_fit_back.rest.exceptions.OperationException;
import com.example.active_fit_back.services.PagoService;
import com.example.active_fit_back.services.RolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@Slf4j
@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @PostMapping
    public Long createPago(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }

    @GetMapping("/postgres")
    public List<Pago> getPagosFromPostgres() {
        return pagoService.findAllFromPostgres();
    }

    @GetMapping("/redis")
    public List<Pago> getPagosFromRedis() {
        return pagoService.findAllFromRedis();
    }
}
