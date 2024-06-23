package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.Personaje;
import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.repository.PersonajeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonajeServiceImpl implements IPersonajeService{

    private PersonajeRepository personajeRepository;

    @Override
    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    @Override
    public Personaje findById(Integer id) {
        return personajeRepository.findById(id).orElse(null);
    }

    @Override
    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @Override
    public void deleteById(Integer id) {
        personajeRepository.deleteById(id);
    }
}
