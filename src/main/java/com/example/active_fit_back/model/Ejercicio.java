package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EJERCICIO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ejercicio implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_EJERCICIO_ID_GENERATOR", sequenceName = "SEQ_EJERCICIO_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EJERCICIO_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

    @Column(name = "url_video", nullable = false, length = 200)
    private String url_video;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", referencedColumnName = "id", nullable = false)
    private Categoria idCategoria;

}
