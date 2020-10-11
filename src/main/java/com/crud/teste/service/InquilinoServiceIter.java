package com.crud.teste.service;

import com.crud.teste.model.Contrato;
import com.crud.teste.model.Inquilino;

public interface InquilinoServiceIter {
    Inquilino findById(long id);
    Inquilino create(Inquilino inquilino);
    void atualizar(Inquilino inquilino, long id);
}
