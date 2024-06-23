package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.controller;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.ProgramTv;
import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service.IProgramTVService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/programatv")
public class ProgramTvController {
    private IProgramTVService programaTvService;

    @GetMapping
    public List<ProgramTv> getAllProgramasTv() {
        return programaTvService.findAll();
    }

    @GetMapping("/{id}")
    public ProgramTv getProgramaTvById(@PathVariable Integer id) {
        return programaTvService.findById(id);
    }

    @PostMapping
    public ProgramTv createProgramaTv(@RequestBody ProgramTv programaTv) {
        return programaTvService.save(programaTv);
    }

    @PutMapping("/{id}")
    public ProgramTv updateProgramaTv(@PathVariable Integer id, @RequestBody ProgramTv programaTvDetails) {
        ProgramTv programaTv = programaTvService.findById(id);
        if (programaTv != null) {
            programaTv.setTitulo(programaTvDetails.getTitulo());
            programaTv.setResumen(programaTvDetails.getResumen());
            programaTv.setFechaInicio(programaTvDetails.getFechaInicio());
            // No se actualiza el IdPersonaje en este método de actualización
            return programaTvService.save(programaTv);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProgramaTv(@PathVariable Integer id) {
        programaTvService.deleteById(id);
    }
}
