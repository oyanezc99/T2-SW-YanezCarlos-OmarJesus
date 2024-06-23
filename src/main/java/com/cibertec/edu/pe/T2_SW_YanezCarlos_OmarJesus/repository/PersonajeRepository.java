package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.repository;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.Personaje;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {
}
