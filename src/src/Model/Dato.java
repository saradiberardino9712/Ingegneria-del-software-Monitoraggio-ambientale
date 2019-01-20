package Model;

import java.util.ArrayList;
import Database.DBDato;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

public class Dato {
	private Button stato;
	private SimpleStringProperty dataora;
	private SimpleStringProperty tipo;
	private SimpleStringProperty ids;
	private SimpleIntegerProperty valore;
	private SimpleStringProperty stanza;
	private SimpleStringProperty edificio;
	private SimpleStringProperty zona;
	
	public Dato(Paint stato, String dataora, String tipo, String ids,int valore, String stanza, String edificio, String zona) {
		this.stato=new Button();
		this.stato.setBackground(new Background(new BackgroundFill(stato,null,null)));
		this.dataora= new SimpleStringProperty(dataora);
		this.tipo=new SimpleStringProperty(tipo);
		this.ids=new SimpleStringProperty(ids);
		this.valore=new SimpleIntegerProperty(valore);
		this.stanza=new SimpleStringProperty(stanza);
		this.edificio=new SimpleStringProperty(edificio);
		this.zona=new SimpleStringProperty(zona);
	}
	
	public Button getStato() {
		return stato;
	}
	
	public void setStato(Paint stato) {
		this.stato.setBackground(new Background(new BackgroundFill(stato,null,null)));
	}
	
	public String getDataora() {
		return dataora.get();
	}
	
	public String getTipo() {
		return tipo.get();
	}
	
	public String getIds() {
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
	
	public static ArrayList<Dato> sensorenoninvia(String edificio){
		ArrayList<Dato> listadati= new DBDato().retrieve(edificio);
		return listadati;
	}

	public static ObservableList<Dato> datiTotminuto(String edificio,int p) {
		ObservableList<Dato> datiTotminuto= FXCollections.observableArrayList();
		ObservableList<Dato> datiSP=new DBDato().retrievedatiSP(edificio,p);
		ObservableList<Dato> datiSU=new DBDato().retrievedatiSU(edificio,p);
		ObservableList<Dato> datiST=new DBDato().retrievedatiST(edificio,p);
		datiTotminuto.addAll(datiST);
		datiTotminuto.addAll(datiSU);
		datiTotminuto.addAll(datiSP);
		return datiTotminuto;
	}

	public static ArrayList<String> sensoriallarme(String edificio) {
		ArrayList<String> listadati= new DBDato().retrieveallarmi(edificio);
		return listadati;
	}
}
