package Model;

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
	
	public static String prendiedificio() {
		Edificio newedificio= (Edificio) new DBEdificio().retrieve();
		return newedificio.nomeedificio;
	}
}
