create table cliente (
	id serial primary key,
	nome varchar,
	telefone varchar,
	email varchar
);

create table Venda (
	id serial primary key,
	observacoes varchar,
	"data" timestamp,
	total numeric(10),
	fk_Cliente_id int references cliente (id)
);

create table Produto (
	id serial primary key,
	descricao varchar,
	valor numeric(10, 2),
	categoria varchar
);

create table item_venda (
	id serial primary key,
	quantidade varchar,
	valor_unitario numeric(10, 2),
	valor_total numeric(10, 2),
	fk_Venda_id int references venda (id),
	fk_Produto_id int references produto (id)
);