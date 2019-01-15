package Model;

import java.util.ArrayList;
import Database.DBUtente;

public class Utente {
	private static Utente instance;
	private String nome;
	private String cognome;
	private String password;
	private String email;
	private String area;
	private String id_area;
	
	private Utente(String nome, String cognome, String password, String email, String area, String id_area) {
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email = email;
		this.area=area;
		this.id_area=id_area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getIDArea() {
		return id_area;
	}
	
	public String getArea() {
		return area;
	}
	
	public static Utente cercautentedb(String email, String password) {
		ArrayList<Object> lista= new ArrayList<>();
		lista.add(email);
		lista.add(password);
		Utente utente=(Utente) new DBUtente().retrieve(lista);
		return utente;
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
