package com.example.active_fit_back.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PAGO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pago implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_PAGO_ID_GENERATOR", sequenceName = "SEQ_PAGO_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PAGO_ID_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

}
