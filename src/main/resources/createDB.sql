
create database active_fit;

create table categoria
(
    id          bigint       not null
        primary key,
    descripcion varchar(150) not null,
    nombre      varchar(70)  not null
);

alter table categoria
    owner to postgres;

create table ejercicio
(
    id           bigint       not null
        primary key,
    descripcion  varchar(150) not null,
    nombre       varchar(70)  not null
        constraint uk_33bsr2ruj79u2c4jllcgei8rn
            unique,
    url_video    varchar(200) not null,
    id_categoria bigint       not null
        constraint fknywc7wc8mid9j6y9ivaonabld
            references categoria
);

alter table ejercicio
    owner to postgres;

create table programacion
(
    id           bigint      not null
        primary key,
    fecha_fin    timestamp   not null,
    fecha_inicio timestamp   not null,
    nombre       varchar(70) not null
        constraint uk_qf9y88qy7rnq1abkckwhq8x8k
            unique
);

alter table programacion
    owner to postgres;

create table rol
(
    id          bigint       not null
        primary key,
    descripcion varchar(150) not null,
    nombre      varchar(70)  not null
        constraint uk_43kr6s7bts1wqfv43f7jd87kp
            unique
);

alter table rol
    owner to postgres;

create table rutina
(
    id     bigint      not null
        primary key,
    nombre varchar(70) not null
        constraint uk_88a54prf4mdrxqtklm3cug1h1
            unique
);

alter table rutina
    owner to postgres;

create table programacion_rutina
(
    id              bigint  not null
        primary key,
    dias            integer not null,
    id_programacion bigint  not null
        constraint fkadc19pmub8i3ajfweeqcg482p
            references programacion,
    id_rutina       bigint  not null
        constraint fkhuwb89bk15ldhh6pe5xu0uoc6
            references rutina
);

alter table programacion_rutina
    owner to postgres;

create table rutina_ejercicio
(
    id           bigint       not null
        primary key,
    cantidad     integer      not null,
    comentarios  varchar(200) not null,
    repeticiones integer      not null,
    id_ejercicio bigint       not null
        constraint fkl5sn6h67cl8dae2ff8a9m5eqd
            references ejercicio,
    id_rutina    bigint       not null
        constraint fkp3pwmcjo7gjcgupm9nw8eiil
            references rutina
);

alter table rutina_ejercicio
    owner to postgres;

create table usuario
(
    id                 bigint           not null
        primary key,
    altura             double precision not null,
    apellido           varchar(70)      not null,
    contrasena         varchar(500)     not null,
    email              varchar(150)     not null
        constraint uk_5171l57faosmj8myawaucatdw
            unique,
    imc                double precision not null,
    nombre             varchar(70)      not null,
    numero_de_telefono varchar(80)      not null,
    peso               double precision not null,
    url_imagen         varchar(500)     not null,
    id_rol             bigint           not null
        constraint fkmyv3138vvci6kaq3y5kt4cntu
            references rol
);

alter table usuario
    owner to postgres;

create table usuario_programacion
(
    id              bigint not null
        primary key,
    id_programacion bigint not null
        constraint fk9pmexn16a4e4xqy0kr2snhqbu
            references programacion,
    id_usuario      bigint not null
        constraint fke1ijhvdvacifdp0sgai1qi1ow
            references usuario
);

alter table usuario_programacion
    owner to postgres;

