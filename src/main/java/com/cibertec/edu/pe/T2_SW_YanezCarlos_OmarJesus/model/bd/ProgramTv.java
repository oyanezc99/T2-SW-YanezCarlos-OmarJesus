package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProgramTv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdProgramaTv;

    private String Titulo;

    private String Resumen;

    private LocalDate FechaInicio;

    @ManyToOne
    @JoinColumn(name = "IdPersonaje", nullable = false)
    private Personaje personaje;
}
