CREATE DATABASE mystream;

USE mystream;

CREATE TABLE usuario (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    login VARCHAR(100) NOT NULL,
    senha TEXT NOT NULL
);

CREATE TABLE filmes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    genero VARCHAR(45) NOT NULL,
    streaming VARCHAR(45) NOT NULL
);

CREATE TABLE series (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    genero VARCHAR(45) NOT NULL,
    streaming VARCHAR(45) NOT NULL
);

INSERT INTO usuario (nome,login,senha) VALUES ('Claudemir', 'claudemir@mystream', '202cb962ac59075b964b07152d234b70');
INSERT INTO usuario (nome,login,senha) VALUES ('Luthiano', 'luthiano@mystream', '202cb962ac59075b964b07152d234b70');

INSERT INTO filmes(nome,genero,streaming) VALUES ('Shazam! Fury of the gods','Ação','HBO MAX');
INSERT INTO filmes(nome,genero,streaming) VALUES ('The Flash','Ação','HBO MAX');
INSERT INTO filmes(nome,genero,streaming) VALUES ('Aquaman and the Lost Kingdom','Ação','HBO MAX');
INSERT INTO filmes(nome,genero,streaming) VALUES ('Indiana Jones and the Dial of Destiny','Aventura','Disney+');
INSERT INTO filmes(nome,genero,streaming) VALUES ('The Super Mario Bros. Movie','Animação','Netflix');

INSERT INTO series(nome,genero,streaming) VALUES ('Band of Brothers','Drama','HBO MAX');
INSERT INTO series(nome,genero,streaming) VALUES ('Chernobyl','Drama','HBO MAX');
INSERT INTO series(nome,genero,streaming) VALUES ('The Last of Us','Drama','HBO MAX');
INSERT INTO series(nome,genero,streaming) VALUES ('The Mandalorian','Ficçao Científica','Disney+');
INSERT INTO series(nome,genero,streaming) VALUES ('Kobra Kai','Ação','Netflix');