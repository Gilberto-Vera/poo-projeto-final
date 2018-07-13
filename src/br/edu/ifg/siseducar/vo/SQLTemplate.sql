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
    catSup VARCHAR(20),
    cat VARCHAR(40),
    id_catSupFK INTEGER,
    FOREIGN KEY (id_catSupFK) REFERENCES categoria(id_cat)
);