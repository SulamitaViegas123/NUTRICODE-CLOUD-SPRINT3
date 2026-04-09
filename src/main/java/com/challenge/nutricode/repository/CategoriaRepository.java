package com.challenge.nutricode.repository;

import com.challenge.nutricode.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}