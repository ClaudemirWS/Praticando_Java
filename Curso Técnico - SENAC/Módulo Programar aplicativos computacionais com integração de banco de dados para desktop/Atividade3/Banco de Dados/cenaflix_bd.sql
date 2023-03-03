CREATE DATABASE atividade3;

USE atividade3;

CREATE TABLE usuario (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    login VARCHAR(100) NOT NULL,
    senha TEXT NOT NULL,
    tipo VARCHAR(30) NOT NULL
);

CREATE TABLE podcast (
    id INT PRIMARY KEY AUTO_INCREMENT,
    produtor VARCHAR(45) NOT NULL,
    nomedoepisodio VARCHAR(100) NOT NULL,
    numerodoepisodio INT NOT NULL,
    duracaoepisodio TIME NOT NULL,
    urlrepositorio VARCHAR(45) NOT NULL
);

INSERT INTO podcast (produtor,nomedoepisodio,numerodoepisodio,duracaoepisodio,urlrepositorio) VALUES ('Claudemir', 'Episódio 1', 1, '1:00' , 'episodio@senac.com' );
INSERT INTO podcast (produtor,nomedoepisodio,numerodoepisodio,duracaoepisodio,urlrepositorio) VALUES ('Claudemir', 'Episódio 2', 2, '1:28' , 'episodio@senac.com' );

INSERT INTO usuario (nome,login,senha,tipo) VALUES ('João', 'adm@senac.com', '202cb962ac59075b964b07152d234b70', 'Administrador');
INSERT INTO usuario (nome,login,senha,tipo) VALUES ('Luis', 'operador@senac.com', '202cb962ac59075b964b07152d234b70', 'Operador');
INSERT INTO usuario (nome,login,senha,tipo) VALUES ('Carlos', 'usuario@senac.com', '202cb962ac59075b964b07152d234b70', 'Usuário');