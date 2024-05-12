package com.example.active_fit_back.rest;


import com.example.active_fit_back.model.Usuario;
import com.example.active_fit_back.rest.common.ApiUtil;
import com.example.active_fit_back.rest.common.ResponseGeneric;
import com.example.active_fit_back.rest.exceptions.DataNotFoundException;
import com.example.active_fit_back.rest.exceptions.OperationException;

import com.example.active_fit_back.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@Slf4j
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("")
    public ResponseEntity<ResponseGeneric<List<Usuario>>> list() {
        log.info("get all");
        try {
            return ok(ApiUtil.responseOk(usuarioService.findAll()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.internalServerError().body(ApiUtil.responseError500());
        }
    }


    @PostMapping("")
    public ResponseEntity<ResponseGeneric<Long>> create(@RequestBody Usuario usuario) {
        log.info("create");
        try {
            Long id = usuarioService.save(usuario);
            return ok(ApiUtil.responseOk(id));
        } catch (OperationException | DataNotFoundException e) {
            log.error("Error message: {}", e.getMessage());
            return ResponseEntity.badRequest().body(ApiUtil.responseError(e.getMessage()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.badRequest().body(ApiUtil.responseError500());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseGeneric<Boolean>> login(@RequestParam String email, @RequestParam String contrasena) {
        log.info("login");
        try {
            Boolean resultado = usuarioService.login(email, contrasena);
            ResponseGeneric<Boolean> response = new ResponseGeneric<>("true", "Inicio de sesión exitoso", resultado);
            return ResponseEntity.ok(response);
        } catch (OperationException | DataNotFoundException e) {
            log.error("Error message: {}", e.getMessage());
            return ResponseEntity.badRequest().body(ApiUtil.responseError(e.getMessage()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.badRequest().body(ApiUtil.responseError500());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseGeneric> update(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
        log.info("update");
        try {
            usuario.setId(id);
            usuarioService.save(usuario);
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
            usuarioService.delete(id);
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
