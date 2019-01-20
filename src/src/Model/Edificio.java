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
	
	public static Edificio prendiedificio(String edificiodato,String db) {
		Edificio newedificio= (Edificio) new DBEdificio().retrieve(edificiodato,db);
		return newedificio;
	}
	
	public static ArrayList<Edificio> prendiedifici(String zonadata,String db) {
		ArrayList<Edificio> newedificio= (ArrayList<Edificio>) new DBEdificio().retrieveedifici(zonadata,db);
		return newedificio;
	}
}
