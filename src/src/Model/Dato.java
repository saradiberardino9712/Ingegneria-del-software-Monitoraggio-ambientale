package Model;

import Database.DBDato;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Dato {
	private Background stato;
	private SimpleStringProperty dataora;
	private SimpleStringProperty tipo;
	private SimpleStringProperty ids;
	private SimpleIntegerProperty valore;
	private SimpleStringProperty stanza;
	private SimpleStringProperty edificio;
	private SimpleStringProperty zona;
	
	public Dato(String stato, String dataora, String tipo, String ids,int valore, String stanza, String edificio, String zona) {
		this.stato=new Background(new BackgroundFill(Color.TRANSPARENT,null,null));
		this.dataora= new SimpleStringProperty(dataora);
		this.tipo=new SimpleStringProperty(tipo);
		this.ids=new SimpleStringProperty(ids);
		this.valore=new SimpleIntegerProperty(valore);
		this.stanza=new SimpleStringProperty(stanza);
		this.edificio=new SimpleStringProperty(edificio);
		this.zona=new SimpleStringProperty(zona);
	}
	
	public Background getStato() {
		return stato;
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
