package com.docker.convidados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository repository;

    @GetMapping
    public List<Convidado> getConvidados(){

        List<Convidado> lista = repository.findAll();

        return lista;
    }
}
