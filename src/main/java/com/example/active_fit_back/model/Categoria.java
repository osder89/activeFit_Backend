package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "CATEGORIA")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Categoria implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_CATEGORIA_ID_GENERATOR", sequenceName = "SEQ_CATEGORIA_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORIA_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

}
