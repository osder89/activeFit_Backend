package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USUARIO_PROGRAMACION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioProgramacion implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_USUARIO_PROGRAMACION_ID_GENERATOR", sequenceName = "SEQ_USUARIO_PROGRAMACION_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO_PROGRAMACION_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programacion", referencedColumnName = "id", nullable = false)
    private Programacion idProgramacion;

}
