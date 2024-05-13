package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RUTINA_EJERCICIO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RutinaEjercicio implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_RUTINA_EJERCICIO_ID_GENERATOR", sequenceName = "SEQ_RUTINA_EJERCICIO_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RUTINA_EJERCICIO_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "repeticiones", nullable = false)
    private Integer repeticiones;

    @Column(name = "comentarios",  length = 200, nullable = false)
    private String comentarios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ejercicio", referencedColumnName = "id", nullable = false)
    private Ejercicio idEjercicio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rutina", referencedColumnName = "id", nullable = false)
    private Rutina idRutina;

}
