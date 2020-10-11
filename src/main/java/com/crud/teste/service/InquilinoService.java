package com.crud.teste.service;

import com.crud.teste.model.Inquilino;
import com.crud.teste.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InquilinoService implements InquilinoServiceIter{
    @Autowired
    InquilinoRepository inquilinoRepository;

    @Override
    public Inquilino findById(long id) {
        return inquilinoRepository.findById(id).get();
    }

    @Override
    public Inquilino create(Inquilino inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    @Override
    public void atualizar(Inquilino inquilino, long id) {
        inquilinoRepository.findById(id)
                .map(record ->{
                    record.setNome(inquilino.getNome());
                    record.setEmail(inquilino.getEmail());
                    inquilinoRepository.save(record);
                    return ResponseEntity.ok().body(record);
                }).orElse(ResponseEntity.notFound().build());
    }
}
