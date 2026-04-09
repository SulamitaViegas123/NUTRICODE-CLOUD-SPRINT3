package com.challenge.nutricode.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORIA") // nome da tabela no Oracle
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID") // garante que o Hibernate use o nome correto
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonManagedReference  // controla serialização
    private List<Alimentos> alimentos;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Alimentos> getAlimentos() { return alimentos; }
    public void setAlimentos(List<Alimentos> alimentos) { this.alimentos = alimentos; }
}