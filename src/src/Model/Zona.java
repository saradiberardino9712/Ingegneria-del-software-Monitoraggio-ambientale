package Model;

import java.util.ArrayList;
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
	
	public static ArrayList<Zona> prendizone(String cittàdata) {
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(cittàdata);
		ArrayList<Zona> newzona= (ArrayList<Zona>) new DBZona().retrievezone(lista);
		return newzona;
	}
	
	public static Zona prendi(String zonadata) {
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(zonadata);
		Zona newzona= (Zona) new DBZona().retrieve(lista);
		return newzona;
	}
	
}
