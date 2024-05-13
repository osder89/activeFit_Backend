package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_USUARIO_ID_GENERATOR", sequenceName = "SEQ_USUARIO_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 70)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 70)
    private String apellido;

    @Column(name = "email", nullable = false, length = 150, unique = true)
    @Email(message = "Por favor, proporciona un correo electrónico válido")
    private String email;

    @Column(name = "contrasena", nullable = false, length = 500)
    private String contrasena;

    @Column(name = "url_imagen", nullable = false, length = 500)
    private String urlImagen;

    @Column(name = "numero_de_telefono", nullable = false, length = 80)
    private String numeroDeTelefono;

    @Column(name = "altura", nullable = false)
    private Double altura;


    @Column(name = "peso", nullable = false, length = 150)
    private Double peso;

    @Column(name = "imc", nullable = false)
    private Double imc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rol", referencedColumnName = "id", nullable = false)
    private Rol idRol;

}
