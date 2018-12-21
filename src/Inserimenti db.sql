use monitoraggioambientale;

INSERT INTO città(ID_città,n_zone) VALUES ('L\'Aquila','10');

INSERT INTO zona(ID_zona,n_edifici,idcittà) VALUES ('Z1','10','1');

INSERT INTO edificio(ID_edificio,n_piani,n_stanzepiano1,n_stanzepiano2,n_stanzepiano3,n_stanzepiano4,n_stanzepiano5,idzona) VALUES ('E1','5','3','4','5','4','3','1');
INSERT INTO edificio(ID_edificio,n_piani,n_stanzepiano1,n_stanzepiano2,n_stanzepiano3,n_stanzepiano4,n_stanzepiano5,idzona) VALUES ('E2','5','3','4','5','4','3','1');

INSERT INTO stanza(ID_stanza,tipostanza,priorità,idedificio,idpiano) VALUES ('S1','t1','bassa','1','1');

INSERT INTO sensore(ID_sensore,idstanza,tiposensore) VALUES ('1000001','1','SU');
INSERT INTO sensore(ID_sensore,idstanza,tiposensore) VALUES ('2000001','1','SP');
INSERT INTO sensore(ID_sensore,idstanza,tiposensore) VALUES ('3000001','1','ST');
INSERT INTO sensore(ID_sensore,idstanza,tiposensore) VALUES ('1000002','1','SU');
