package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RUTINA")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Rutina implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_RUTINA_ID_GENERATOR", sequenceName = "SEQ_RUTINA_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RUTINA_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70, unique = true)
    private String nombre;

}
