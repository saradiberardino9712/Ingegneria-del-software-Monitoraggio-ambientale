package Model;

import Database.DBSensore;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Sensore {
	
	private SimpleStringProperty tiposensore;
	private SimpleIntegerProperty conteggio; // N° totale di sensori per tipologia
	
	public Sensore(String tiposensore, int conteggio) {
		this.tiposensore=new SimpleStringProperty(tiposensore);
		this.conteggio= new SimpleIntegerProperty(conteggio);
	}
	
	public String getTiposensore() {
		return tiposensore.get();
	}
	
	public int getConteggio() {
		return conteggio.get();
	}
	
	public static ObservableList<Sensore> prendiAll(){
		Sensore conteggioST= new DBSensore().retrieve("ST",1);
		Sensore conteggioSP= new DBSensore().retrieve("SP",2);
		Sensore conteggioSU= new DBSensore().retrieve("SU",3);
		ObservableList<Sensore> listasensore=FXCollections.observableArrayList();
		listasensore.add(conteggioSU);
		listasensore.add(conteggioSP);
		listasensore.add(conteggioST);
		return listasensore;
	}
	
	public static ObservableList<Sensore> prendiZN(){
		Sensore conteggioST= new DBSensore().retrieveZN("ST",1);
		Sensore conteggioSP= new DBSensore().retrieveZN("SP",2);
		Sensore conteggioSU= new DBSensore().retrieveZN("SU",3);
		ObservableList<Sensore> listasensore=FXCollections.observableArrayList();
		listasensore.add(conteggioSU);
		listasensore.add(conteggioSP);
		listasensore.add(conteggioST);
		return listasensore;
	}
	
	public static ObservableList<Sensore> prendiED(){
		Sensore conteggioST= new DBSensore().retrieveED("ST",1);
		Sensore conteggioSP= new DBSensore().retrieveED("SP",2);
		Sensore conteggioSU= new DBSensore().retrieveED("SU",3);
		ObservableList<Sensore> listasensore=FXCollections.observableArrayList();
		listasensore.add(conteggioSU);
		listasensore.add(conteggioSP);
		listasensore.add(conteggioST);
		return listasensore;
	}
}
