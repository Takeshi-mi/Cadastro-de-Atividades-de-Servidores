CREATE SCHEMA "Cadastro-Atividades";
SET SEARCH_PATH TO 'Cadastro-Atividades';

CREATE TABLE usuario(
	siap integer,
	nome VARCHAR(100),
	senha VARCHAR(50),
	tipo INTEGER, --1. adm, 2. Professor
	primary key(siap)
);

senha(varchar(50));
CREATE TABLE atividade(
	usiap integer,
	nome VARCHAR(100),
	carga_horaria integer,
	tipo VARCHAR(100), -- ensino, extensão, comissão
	subtipo VARCHAR(100), -- aula, projeto de aula
	status integer, --1.Pendente, 2. Aprovado, 3 Reprovado
	FOREIGN KEY(usiap) REFERENCES usuario(siap)
);




