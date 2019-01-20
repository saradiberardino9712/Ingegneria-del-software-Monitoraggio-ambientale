package Model;

import java.util.ArrayList;
import Database.DBStanza;

public class Stanza {
	
	private String piano;
	
	public Stanza(String piano) {
		this.piano=piano;
	}
	
	public String getPiano() {
		return piano;
	}
	
	public static ArrayList<Stanza> prendipiani(String edificiodato, String db) {
		ArrayList<Stanza> newpiano= (ArrayList<Stanza>) new DBStanza().retrievepiani(edificiodato,db);
		return newpiano;
	}
}
