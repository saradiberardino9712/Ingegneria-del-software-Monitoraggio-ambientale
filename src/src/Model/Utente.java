package Model;

import java.util.ArrayList;
import Database.DBUtente;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;

public class Utente {
	private static Utente instance;
	private SimpleStringProperty nome;
	private SimpleStringProperty cognome;
	private SimpleStringProperty password;
	private SimpleStringProperty email;
	private String id_area;
	private SimpleStringProperty ruolo;
	private CheckBox select;
	
	private Utente(String nome, String cognome, String password, String email, String ruolo, String id_area) {
		this.nome = new SimpleStringProperty(nome);
		this.cognome = new SimpleStringProperty(cognome);
		this.password = new SimpleStringProperty(password);
		this.email = new SimpleStringProperty(email);
		this.ruolo= new SimpleStringProperty(ruolo);
		this.id_area=id_area;
	}
	
	public Utente(String nome, String cognome, String password, String email, String ruolo) {
		this.nome = new SimpleStringProperty(nome);
		this.cognome = new SimpleStringProperty(cognome);
		this.password = new SimpleStringProperty(password);
		this.email = new SimpleStringProperty(email);
		this.ruolo= new SimpleStringProperty(ruolo);
		this.select=new CheckBox();
	}
	
	public String getNome() {
		return nome.get();
	}
	
	public String getCognome() {
		return cognome.get();
	}
	
	public String getPassword() {
		return password.get();
	}
	
	public String getEmail() {
		return email.get();
	}
	
	public String getIDArea() {
		return id_area;
	}
	
	public String getRuolo() {
		return ruolo.get();
	}
	
	public CheckBox getSelect(){
		return select;
	}
	
	public static Utente cercautentedb(String email, String password) {
		ArrayList<Object> lista= new ArrayList<>();
		lista.add(email);
		lista.add(password);
		Utente utente=(Utente) new DBUtente().retrieve(lista);
		return utente;
	}
	
	public static boolean aggiornautentedb(boolean valore) {
		ArrayList<Object> lista =new ArrayList<>();
		lista.add(instance);
		lista.add(valore);
		boolean aggiornadb=new DBUtente().updatelogin(lista);
		return aggiornadb;
	}
	
	public static ObservableList<Utente> prendiutenti() {
		ObservableList<Utente> listautenti=new DBUtente().retrieveutenti();
		return listautenti;
	}
	
	public static Utente delete() {
		instance = null;
		return instance;
	}
	
	public static final synchronized Utente setInstance(String nome, String cognome,String password, String email, String area, String id_area) {
		if ( instance == null ) {
			instance = new Utente(nome, cognome, password, email, area,id_area);
		}
		return instance;
	}
	
	public static final Utente getIstance() {
		return instance;
	}
}
