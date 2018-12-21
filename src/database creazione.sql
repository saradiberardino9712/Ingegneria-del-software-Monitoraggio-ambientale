drop database if exists monitoraggioambientale;
create database monitoraggioambientale;
use monitoraggioambientale;

create table città (
 ID integer unsigned primary key not null auto_increment,
 ID_città varchar(50) not null,
 n_zone integer unsigned not null
 );

create table zona (
 ID integer unsigned primary key not null auto_increment,
 ID_zona varchar(50) not null,
 n_edifici integer unsigned not null,
 idcittà integer unsigned not null,
 constraint zona_città foreign key (idcittà) references città(ID) on update cascade on delete cascade
);

create table edificio (
 ID integer unsigned primary key not null auto_increment,
 ID_edificio varchar(50),
 n_piani integer unsigned not null,
 n_stanzepiano1 integer unsigned not null,
 n_stanzepiano2 integer unsigned not null,
 n_stanzepiano3 integer unsigned not null,
 n_stanzepiano4 integer unsigned not null,
 n_stanzepiano5 integer unsigned not null,
 idzona integer unsigned not null,
 constraint edificio_zona foreign key (idzona) references zona(ID) on update cascade on delete cascade
);

create table stanza (
 ID integer unsigned primary key not null auto_increment,
 ID_stanza varchar(50) not null,
 tipostanza varchar(100) not null,
 priorità enum('bassa','alta'),
 idedificio integer unsigned not null,
 idpiano integer unsigned not null,
 constraint stanza_edificio foreign key (idedificio) references edificio(ID) on update cascade on delete cascade
);

create table sensore (
 ID integer unsigned primary key not null auto_increment,
 ID_sensore varchar(50) not null,
 idstanza integer unsigned not null,
 tiposensore varchar(50) not null,
 constraint sensore_stanza foreign key (idstanza) references stanza(ID) on update cascade on delete cascade
);

create table dato (
 ID integer unsigned primary key not null auto_increment,
 stato enum('verde','arancione','rosso') not null,
 dataora timestamp not null,
 valore integer not null,
 idsensore integer unsigned not null,
 constraint dato_sensore foreign key (idsensore) references sensore(ID) on update cascade on delete cascade
)
