package com.example.active_fit_back.repository;

import com.example.active_fit_back.model.Categoria;
import com.example.active_fit_back.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PagoRepository extends JpaRepository<Pago, Long> {


}
