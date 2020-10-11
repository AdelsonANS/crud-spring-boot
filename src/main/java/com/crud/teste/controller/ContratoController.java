package com.crud.teste.controller;


import com.crud.teste.model.Contrato;
import com.crud.teste.model.User;
import com.crud.teste.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping({"/contrato"})
public class ContratoController {

    @Autowired
    ContratoService contratoService;

    @GetMapping(path = {"/{id}"})
    public Contrato findById(@PathVariable long id){
        Contrato result = contratoService.findById(id);
        return result;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Contrato contrato){
        Contrato result = contratoService.create(contrato);
        return ResponseEntity.ok().body(result);
    }
}
