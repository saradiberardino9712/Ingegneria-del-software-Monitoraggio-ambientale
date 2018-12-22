package Model;

import Database.DBDato;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Dato {
	private SimpleStringProperty stato;
	private SimpleStringProperty dataora;
	private SimpleStringProperty tipo;
	private SimpleStringProperty ids;
	private SimpleIntegerProperty valore;
	private SimpleStringProperty stanza;
	private SimpleStringProperty edificio;
	private SimpleStringProperty zona;
	
	public Dato(String stato, String dataora, String tipo, String ids,int valore, String stanza, String edificio, String zona) {
		this.stato=new SimpleStringProperty(stato);
		this.dataora= new SimpleStringProperty(dataora);
		this.tipo=new SimpleStringProperty(tipo);
		this.ids=new SimpleStringProperty(ids);
		this.valore=new SimpleIntegerProperty(valore);
		this.stanza=new SimpleStringProperty(stanza);
		this.edificio=new SimpleStringProperty(edificio);
		this.zona=new SimpleStringProperty(zona);
	}
	
	public String getStato() {
		return stato.get();
	}
	
	public String getDataora() {
		return dataora.get();
	}
	
	public String getTipo() {
		return tipo.get();
	}
	
	public String ids() {
		return ids.get();
	}
	
	public int getValore() {
		return valore.get();
	}
	
	public String getStanza() {
		return stanza.get();
	}
	
	public String getEdificio() {
		return edificio.get();
	}
	
	public String getZona() {
		return zona.get();
	}
	
	public static ObservableList<Dato> prendidati(){
		ObservableList<Dato> listadati= new DBDato().retrieve();
		return listadati;
	}
}
