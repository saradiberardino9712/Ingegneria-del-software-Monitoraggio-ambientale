package Model;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import Database.DBUtente;

public class Utente {
	private static Utente instance;
	private String nome;
	private String cognome;
	private String password;
	private String email;
	private String id_area;
	private String ruolo;
	
	public Utente(String nome, String cognome, String password, String email, String ruolo, String id_area) {
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email =email;
		this.ruolo= ruolo;
		this.id_area=id_area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String newnome) {
		this.nome=newnome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String newcognome) {
		this.cognome=newcognome;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String newpassword) {
		this.password=newpassword;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String newemail) {
		this.email=newemail;
	}
	
	public String getIDArea() {
		return id_area;
	}
	
	public void setIDArea(String newidarea) {
		this.id_area=newidarea;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(String newruolo) {
		this.ruolo=newruolo;
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
	
	public static ArrayList<Utente> prendiutenti() {
		ArrayList<Utente> listautenti=new DBUtente().retrieveutenti();
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

	public static boolean deletelista(ArrayList<Utente> eliminare) {
		boolean elimina= new DBUtente().delete(eliminare);
		return elimina;
	}

	public static boolean updatelista(TreeMap<Integer, Utente> mod) {
		ArrayList<Utente>lista=new ArrayList<>();
		for(Entry<Integer, Utente> e:mod.entrySet()) {
			lista.add(e.getValue());
		}
		boolean update= new DBUtente().update(lista);
		return update;
	}
}
