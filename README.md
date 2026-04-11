# NUTRICODE 
# DDL das tabelas
CREATE TABLE categoria (
    id NUMBER PRIMARY KEY,
    nome VARCHAR2(100)
);

CREATE TABLE alimento (
    id NUMBER PRIMARY KEY,
    nome VARCHAR2(100),
    descricao VARCHAR2(255),
    categoria_id NUMBER,
    CONSTRAINT fk_categoria FOREIGN KEY (categoria_id)
    REFERENCES categoria(id)
);
