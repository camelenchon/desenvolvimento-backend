create database db_empresa_eventos;

use db_empresa_eventos;
create table tb_eventos (
id int primary key, 
nome varchar(255), 
localizacao varchar(255),
 preco_ingresso decimal(6,2));
 
 insert into tb_eventos values(
 1, 
 'Rock in Rio', 
 'Rio de Janeiro', 
 450.00);
 
 insert into tb_eventos values(
2,
'Lollapalooza',
'São Paulo',
990.00);
 
 


