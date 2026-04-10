package com.challenge.nutricode.controller;

import com.challenge.nutricode.model.Alimentos;
import com.challenge.nutricode.repository.AlimentosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alimentos")
public class AlimentosController {

    private final AlimentosRepository repository;

    public AlimentosController(AlimentosRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Alimentos> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Alimentos salvar(@RequestBody Alimentos alimento) {
        return repository.save(alimento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}