package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PROGRAMACION_RUTINA")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProgramacionRutina implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_PROGRAMACION_RUTINA_ID_GENERATOR", sequenceName = "SEQ_PROGRAMACION_RUTINA_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROGRAMACION_RUTINA_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "dias", nullable = false, length = 100)
    private Integer dias;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programacion", referencedColumnName = "id", nullable = false)
    private Programacion idProgramacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rutina", referencedColumnName = "id", nullable = false)
    private Rutina idRutina;

}
