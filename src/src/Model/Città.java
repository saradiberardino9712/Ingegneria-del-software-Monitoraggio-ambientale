package Model;

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
	
	public static Citt� prendicitt�() {
		Citt� newcitt�= (Citt�) new DBCitta().retrieve();
		return newcitt�;
	}
}
