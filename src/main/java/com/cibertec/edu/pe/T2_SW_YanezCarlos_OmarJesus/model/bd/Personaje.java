package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonaje;
    private String nomPersonaje;
    private String apePersonaje;
    private LocalDate fechNacPersonaje;
}
