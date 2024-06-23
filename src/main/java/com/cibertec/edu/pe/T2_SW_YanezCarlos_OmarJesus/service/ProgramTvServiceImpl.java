package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.ProgramTv;
import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.repository.ProgramaTvRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProgramTvServiceImpl implements IProgramTVService{

    private ProgramaTvRepository programaTvRepository;

    @Override
    public List<ProgramTv> findAll() {
        return programaTvRepository.findAll();
    }

    @Override
    public ProgramTv findById(Integer id) {
        return programaTvRepository.findById(id).orElse(null);
    }

    @Override
    public ProgramTv save(ProgramTv programaTv) {
        return programaTvRepository.save(programaTv);
    }

    @Override
    public void deleteById(Integer id) {
        programaTvRepository.deleteById(id);
    }
}
