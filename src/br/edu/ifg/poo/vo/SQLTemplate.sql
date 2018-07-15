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

CREATE TABLE fluxo(
    id SERIAL PRIMARY KEY,
    descri VARCHAR(50),
    id_usu INT,
    id_cat INT ,
    data_fc DATE,
    valor DOUBLE PRECISION,
    FOREIGN KEY (id_usu) REFERENCES usuario(id),
    FOREIGN KEY (id_cat) REFERENCES categoria(id_cat)
);

INSERT INTO usuario VALUES (
    default, 'Gilberto Vera', 'gilberto', '123'),
    (default, 'Administrado', 'admin', 'admin'
);

INSERT INTO categoria VALUES (
    default, 'Alimentação', null),(
    default, 'Restaurante', 1),(
    default, 'Automóvel', null),(
    default, 'Combustível', 3),(
):