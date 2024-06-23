package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.Personaje;

import java.util.List;

public interface IPersonajeService {
    List<Personaje> findAll();
    Personaje findById(Integer id);
    Personaje save(Personaje personaje);
    void deleteById(Integer id);
}
