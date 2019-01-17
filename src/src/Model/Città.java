package Model;

import java.util.ArrayList;

import Database.DBCitta;

public class Città {
	
	private String nomecittà;
	private int nzone;
	
	public Città(String nomecittà, int nzone) {
		this.nomecittà=nomecittà;
		this.nzone=nzone;
	}
	
	public String getNomecittà() {
		return this.nomecittà;
	}
	
	public int getNzone() {
		return this.nzone;
	}
	
	public static Città prendicittà(String cittàdata) {
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(cittàdata);
		Città newcittà= (Città) new DBCitta().retrieve(lista);
		return newcittà;
	}
}
