package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PROGRAMACION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Programacion implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_PROGRAMACION_ID_GENERATOR", sequenceName = "SEQ_PROGRAMACION_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROGRAMACION_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70, unique = true)
    private String nombre;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

}
