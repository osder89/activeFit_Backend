package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROL")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Rol implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_ROL_ID_GENERATOR", sequenceName = "SEQ_ROL_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROL_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

}
