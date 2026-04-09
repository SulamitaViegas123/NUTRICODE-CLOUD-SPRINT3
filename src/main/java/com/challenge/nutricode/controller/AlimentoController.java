package com.challenge.nutricode.controller;

import com.challenge.nutricode.model.Alimentos;
import com.challenge.nutricode.repository.AlimentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    private final AlimentoRepository alimentoRepository;

    public AlimentoController(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    // Retorna todos
    @GetMapping
    public List<Alimentos> getAllAlimentos() {
        return alimentoRepository.findAll();
    }

    // Retorna filtrando por nome exato
    @GetMapping("/nome")
    public List<Alimentos> getAlimentosByNome(@RequestParam String nome) {
        return alimentoRepository.findByNome(nome);
    }

    // Retorna filtrando por nome contendo
    @GetMapping("/buscar")
    public List<Alimentos> searchAlimentos(@RequestParam String termo) {
        System.out.println("Buscando alimentos com termo: " + termo);
        return alimentoRepository.findByNomeContainingIgnoreCase(termo);
    }
}