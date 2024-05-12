package com.example.active_fit_back.rest;


import com.example.active_fit_back.model.ProgramacionRutina;
import com.example.active_fit_back.model.UsuarioProgramacion;
import com.example.active_fit_back.rest.common.ApiUtil;
import com.example.active_fit_back.rest.common.ResponseGeneric;
import com.example.active_fit_back.rest.exceptions.DataNotFoundException;
import com.example.active_fit_back.rest.exceptions.OperationException;
import com.example.active_fit_back.services.UsuarioProgramacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@Slf4j
@RestController
@RequestMapping("/usuario_programacion")
public class UsuarioProgramacionController {

    @Autowired
    private UsuarioProgramacionService usuarioProgramacionService;


    @GetMapping("")
    public ResponseEntity<ResponseGeneric<List<UsuarioProgramacion>>> list() {
        log.info("get all");
        try {
            return ok(ApiUtil.responseOk(usuarioProgramacionService.findAll()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.internalServerError().body(ApiUtil.responseError500());
        }
    }


    @PostMapping("")
    public ResponseEntity<ResponseGeneric<Long>> create(@RequestBody UsuarioProgramacion usuarioProgramacion) {
        log.info("create");
        try {
            Long id = usuarioProgramacionService.save(usuarioProgramacion);
            return ok(ApiUtil.responseOk(id));
        } catch (OperationException | DataNotFoundException e) {
            log.error("Error message: {}", e.getMessage());
            return ResponseEntity.badRequest().body(ApiUtil.responseError(e.getMessage()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.badRequest().body(ApiUtil.responseError500());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseGeneric> update(@PathVariable("id") Long id, @RequestBody UsuarioProgramacion usuarioProgramacion) {
        log.info("update");
        try {
            usuarioProgramacion.setId(id);
            usuarioProgramacionService.save(usuarioProgramacion);
            return ok(ApiUtil.responseOk());
        } catch (DataNotFoundException | OperationException e) {
            log.error("{} message: {}", e.getClass().getSimpleName(), e.getMessage());
            return ResponseEntity.badRequest().body(ApiUtil.responseError(e.getMessage()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.badRequest().body(ApiUtil.responseError500());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        log.info("delete");
        try {
            usuarioProgramacionService.delete(id);
            return ok().build();
        } catch (DataNotFoundException e) {
            log.error("DataNotFoundException message: {}", e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.badRequest().build();
        }
    }
}
