package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    public MatriculaController(MatriculaServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Matricula> buscaTodas(@RequestParam(value = "bairro", required = false) String bairro){
        return service.getAll(bairro);
    }

    @PostMapping
    public Matricula criarMatricula(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }




}
