// src/main/java/com/challenge/nutricode/TesteConexao.java
package com.challenge.nutricode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TesteConexao implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            String resultado = jdbcTemplate.queryForObject("SELECT 'Conexão OK' FROM dual", String.class);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}