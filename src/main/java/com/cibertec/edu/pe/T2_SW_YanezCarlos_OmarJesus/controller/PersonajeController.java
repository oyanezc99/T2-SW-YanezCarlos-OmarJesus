package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.controller;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.Personaje;
import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service.IPersonajeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {

    private IPersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.findAll();
    }

    @GetMapping("/{id}")
    public Personaje getPersonajeById(@PathVariable Integer id) {
        return personajeService.findById(id);
    }

    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
        return personajeService.save(personaje);
    }

    @PutMapping("/{id}")
    public Personaje updatePersonaje(@PathVariable Integer id, @RequestBody Personaje personajeDetails) {
       Personaje personaje = personajeService.findById(id);
        if (personaje != null) {
            personaje.setNomPersonaje(personajeDetails.getNomPersonaje());
            personaje.setApePersonaje(personajeDetails.getApePersonaje());
            personaje.setFechNacPersonaje(personajeDetails.getFechNacPersonaje());
            return personajeService.save(personaje);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePersonaje(@PathVariable Integer id) {
        personajeService.deleteById(id);
    }
}
