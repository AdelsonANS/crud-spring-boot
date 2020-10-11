package com.crud.teste.controller;

import com.crud.teste.model.Contrato;
import com.crud.teste.model.Inquilino;
import com.crud.teste.service.ContratoService;
import com.crud.teste.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/inquilino"})
public class InquilinoController {
    @Autowired
    InquilinoService inquilinoService;

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        Inquilino result = inquilinoService.findById(id);
        return ResponseEntity.ok().body(result);
    }
    @PostMapping
    public ResponseEntity create(@RequestBody Inquilino inquilino){
        Inquilino result = inquilinoService.create(inquilino);
        return ResponseEntity.ok().body(result);
    }
    @PutMapping(value = "/{id}")
    public void update(@RequestBody Inquilino inquilino, @PathVariable("id") long id){
        inquilinoService.atualizar(inquilino, id);
    }
}
