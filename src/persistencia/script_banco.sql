create schema if not exists aula10;

use aula10;

create or replace table aluno (
 id bigint primary key auto_increment,
 matricula int not null,
 nome varchar (150) not null,
 email varchar(200) not null,
 nota01 float8,
 nota02 float8
);

desc aluno;

/*
 
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| id        | bigint(20)   | NO   | PRI | NULL    | auto_increment |
| matricula | int(11)      | NO   |     | NULL    |                |
| nome      | varchar(150) | NO   |     | NULL    |                |
| email     | varchar(200) | NO   |     | NULL    |                |
| nota01    | double       | YES  |     | NULL    |                |
| nota02    | double       | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+

*/

/*  insere dados na tabela */
insert into aluno values(null, 1234, "Anisio", "anisios2jorge@gmail.com", 5.6, 6.5);

/* lista todos os registros da tabela*/
select * from aluno;