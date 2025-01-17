create table topicos(

    id bigint not null auto_increment,
    titulo varchar(255) not null unique,
    mensagem varchar(255) not null unique,
    autor varchar(100) not null,
    data_criacao datetime not null,
    curso varchar(50) not null,
    estado_topico varchar(50) not null,
    ativo tinyint not null,

    primary key(id)

);