package Model;

import Database.DBZona;

public class Zona {
	private String nomezona;
	private int nedifici;
	
	public Zona(String nomezona, int nedifici) {
		this.nomezona=nomezona;
		this.nedifici=nedifici;
	}
	
	public String getNomezona() {
		return this.nomezona;
	}
	
	public int getNedifici() {
		return this.nedifici;
	}
	
	public static Zona prendizona() {
		Zona newzona= (Zona) new DBZona().retrieve();
		return newzona;
	}
	
}
