create database escola;

use escola;

CREATE TABLE  estudante (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            nome VARCHAR(255) NOT NULL,
                            data_nascimento DATE
)  ENGINE=INNODB;

select * from estudante;

insert into estudante (nome, data_nascimento) values ('Wanderson' , '1977-08-02');
insert into estudante (nome, data_nascimento) values ('Stephany' , '1998-01-20');
insert into estudante (nome, data_nascimento) values ('Wanderson' , '2009-04-01');
insert into estudante (nome, data_nascimento) values ('Robson' , '2009-04-01');

select * from estudante where nome = 'Stephany';
select * from estudante where id = 3;

update estudante set nome = 'Alexander' where id = 3;

delete from estudante where id = 4;

commit;

