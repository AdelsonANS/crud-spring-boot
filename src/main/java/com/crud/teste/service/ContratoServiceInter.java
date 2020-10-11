package com.crud.teste.service;

import com.crud.teste.model.Contrato;

public interface ContratoServiceInter {
    Contrato findById(long id);
    Contrato create(Contrato contrato);
}
