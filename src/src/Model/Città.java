package Model;

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
	
	public static Città prendicittà() {
		Città newcittà= (Città) new DBCitta().retrieve();
		return newcittà;
	}
}
