package com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.service;

import com.cibertec.edu.pe.T2_SW_YanezCarlos_OmarJesus.model.bd.ProgramTv;

import java.util.List;

public interface IProgramTVService {
    List<ProgramTv> findAll();
    ProgramTv findById(Integer id);
    ProgramTv save(ProgramTv programaTv);
    void deleteById(Integer id);
}
