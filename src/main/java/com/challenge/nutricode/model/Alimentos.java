package com.challenge.nutricode.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ALIMENTOS") // nome da tabela no Oracle
public class Alimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID") // garante que o Hibernate use o nome correto
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "PROTEINA", precision = 10, scale = 2)
    private BigDecimal proteina;

    @Column(name = "CARBOIDRATO", precision = 10, scale = 2)
    private BigDecimal carboidrato;

    @Column(name = "GORDURA", precision = 10, scale = 2)
    private BigDecimal gordura;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    @JsonBackReference  // evita loop infinito
    private Categoria categoria;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public BigDecimal getProteina() { return proteina; }
    public void setProteina(BigDecimal proteina) { this.proteina = proteina; }

    public BigDecimal getCarboidrato() { return carboidrato; }
    public void setCarboidrato(BigDecimal carboidrato) { this.carboidrato = carboidrato; }

    public BigDecimal getGordura() { return gordura; }
    public void setGordura(BigDecimal gordura) { this.gordura = gordura; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}