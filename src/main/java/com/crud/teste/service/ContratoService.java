package com.crud.teste.service;

import com.crud.teste.model.Contrato;
import com.crud.teste.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoService implements ContratoServiceInter {
    @Autowired
    ContratoRepository contratoRepository;

    @Override
    public Contrato findById(long id) {
        return contratoRepository.findById(id).get();
    }

    @Override
    public Contrato create(Contrato contrato) {
        return contratoRepository.save(contrato);
    }
}
