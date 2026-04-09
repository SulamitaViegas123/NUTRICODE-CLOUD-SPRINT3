package com.challenge.nutricode.repository;

import com.challenge.nutricode.model.Alimentos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlimentoRepository extends JpaRepository<Alimentos, Long> {
    // Filtra por nome (igualdade exata)
    List<Alimentos> findByNome(String nome);

    // Filtra por nome contendo (LIKE %nome%)
    List<Alimentos> findByNomeContainingIgnoreCase(String nome);
}