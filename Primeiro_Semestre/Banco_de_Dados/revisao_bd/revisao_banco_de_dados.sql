-- Entrar no banco de dados
use estudoBD;

-- Criar a tabela alunos
create table alunos(
	matricula integer primary key,
	nome varchar(30) not null,
	endereco varchar(100) not null,
	cidade varchar(30) not null
);

-- Criar a tabela disciplinas
create table disciplinas(
	cod_disciplina integer primary key,
	nome_disciplina varchar(30) not null,
	carga_hora integer not null,
);

-- Criar a tabela professores
create table professores(
	cod_prof integer primary key,
	turma varchar(30) not null,
	endereco varchar(100) not null,
	cidade varchar(30) not null
);

-- Criar a tabela turma
create table turma(
	cod_turma integer primary key,
	foreign key (cod_disciplina) references disciplinas(cod_disciplina),
	foreign key (cod_prof) references professores(cod_prof),
	turma varchar(30) not null,
	ano integer not null,
	horario integer not null
);

-- Criar a tabela historico
create table historico(
	cod_turma integer primary key,
	foreign key (cod_disciplina) references disciplinas(cod_disciplina),
	foreign key (cod_prof) references professores(cod_prof),
	frequencia integer not null,
	nota integer not null
);

-- Selecionar a tabela
select * from alunos;