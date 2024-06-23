package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPersonaje;
    private String NomPersonaje;
    private String ApePersonaje;
    private LocalDate FechNacPersonaje;
}
