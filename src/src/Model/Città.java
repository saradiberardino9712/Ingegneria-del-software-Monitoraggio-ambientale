package Model;

import java.util.ArrayList;

import Database.DBCitta;

public class Citt� {
	
	private String nomecitt�;
	private int nzone;
	
	public Citt�(String nomecitt�, int nzone) {
		this.nomecitt�=nomecitt�;
		this.nzone=nzone;
	}
	
	public String getNomecitt�() {
		return this.nomecitt�;
	}
	
	public int getNzone() {
		return this.nzone;
	}
	
	public static Citt� prendicitt�(String citt�data) {
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(citt�data);
		Citt� newcitt�= (Citt�) new DBCitta().retrieve(lista);
		return newcitt�;
	}
}
