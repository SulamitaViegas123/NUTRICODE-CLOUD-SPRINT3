package com.challenge.nutricode.repository;

import com.challenge.nutricode.model.Alimentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentosRepository extends JpaRepository<Alimentos, Long> {
}