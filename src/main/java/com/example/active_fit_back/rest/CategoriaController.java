package com.example.active_fit_back.rest;


import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.rest.common.ApiUtil;
import com.example.active_fit_back.rest.common.ResponseGeneric;
import com.example.active_fit_back.rest.exceptions.DataNotFoundException;
import com.example.active_fit_back.rest.exceptions.OperationException;
import com.example.active_fit_back.services.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@Slf4j
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;


    @GetMapping("")
    public ResponseEntity<ResponseGeneric<List<Categoria>>> list() {
        log.info("Todas las categorias");
        try {
            return ok(ApiUtil.responseOk(categoriaService.findAll()));
        } catch (Exception e) {
            log.error("Error inesperado", e);
            return ResponseEntity.internalServerError().body(ApiUtil.responseError500());
        }
    }


    @PostMapping("")
    public ResponseEntity<ResponseGeneric<Long>> create(@RequestBody Categoria dto) {
        log.info("create");
        try {
            Long id = categoriaService.save(dto);
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
    public ResponseEntity<ResponseGeneric> update(@PathVariable("id") Long id, @RequestBody Categoria categoria) {
        log.info("update");
        try {
            categoria.setId(id);
            categoriaService.save(categoria);
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
            categoriaService.delete(id);
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
