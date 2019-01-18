package Model;

import java.util.ArrayList;
import Database.DBEdificio;

public class Edificio {
	private String nomeedificio;
	private int npiani;
	
	public Edificio(String nomeedificio, int npiani) {
		this.nomeedificio=nomeedificio;
		this.npiani=npiani;
	}
	
	public String getNomeedificio() {
		return this.nomeedificio;
	}
	
	public int getNpiani() {
		return this.npiani;
	}
	
	public static Edificio prendiedificio(String edificiodato) {
		Edificio newedificio= (Edificio) new DBEdificio().retrieve(edificiodato);
		return newedificio;
	}
	
	public static ArrayList<Edificio> prendiedifici(String zonadata) {
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(zonadata);
		ArrayList<Edificio> newedificio= (ArrayList<Edificio>) new DBEdificio().retrieveedifici(lista);
		return newedificio;
	}
}
