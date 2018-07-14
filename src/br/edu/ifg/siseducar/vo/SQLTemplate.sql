/**
 * Author:  gilberto
 * Created: 13/07/2018
 */

CREATE TABLE usuario(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    login VARCHAR(20),
    senha VARCHAR(20)
);

CREATE TABLE categoria(
    id_cat SERIAL PRIMARY KEY,
    descricao VARCHAR(30),
    id_catSup INTEGER,
    FOREIGN KEY (id_catSup) REFERENCES categoria(id_cat)
);