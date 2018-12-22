package Model;

import Database.DBSensore;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
	
	public static ObservableList<Sensore> prenditips(){
		ObservableList<Sensore> listasensore= new DBSensore().retrieve();
		return listasensore;
	}
}
