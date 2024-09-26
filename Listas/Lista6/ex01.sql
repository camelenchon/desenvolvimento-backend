CREATE DATABASE db_escola_tech;
USE db_escola_tech;

create table tb_endereco (
	id int auto_increment primary key,
	logradouro varchar(255),
	bairro varchar(255),
	numero int,
	uf char(2),
	pais varchar(255));
 

create table tb_filial (
	id int auto_increment primary key,
    nome varchar(255),
    cnpj char(14),
    id_endereco int,
    foreign key (id_endereco) references tb_endereco(id));
    

INSERT INTO tb_endereco(logradouro,bairro,numero,uf,pais) VALUES('Av Tiradentes', 'Centro', 111, 'SP', 'Brasil');
INSERT INTO tb_filial(nome,cnpj, id_endereco) VALUES('FATEC', '12345678000911',1);