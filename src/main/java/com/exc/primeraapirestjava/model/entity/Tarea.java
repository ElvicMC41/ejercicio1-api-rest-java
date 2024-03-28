package com.exc.primeraapirestjava.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tareas")
@Data

public class Tarea implements Serializable {

    @Id
    @Column(name = "nombre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tarea;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

}
