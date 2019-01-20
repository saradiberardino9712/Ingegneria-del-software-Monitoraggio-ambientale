package Controller;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import Model.Dato;
import javafx.collections.ObservableList;

public class controller_malfunzionamenti {
	
	public static ObservableList<Dato> analizza(String edificio,int piano){
		String e;
		if(edificio.contains("ZA01")) 
			e="edificioza01";
		else if(edificio.contains("ZA02"))
			e="edificioza02";
		else e="edificiozb01";
		ObservableList<Dato> datiTot=Dato.datiTotminuto(e,piano);
		ArrayList<Dato> sensorinoninvia=Dato.sensorenoninvia(e);
		datiTot.addAll(sensorinoninvia);
		ArrayList<String> sensoriallarme=Dato.sensoriallarme(e);
		Paint stato;
		if(sensoriallarme.size()==1) 
			stato=Color.ORANGE;
		else
			stato=Color.RED;
		for(Dato d: datiTot) {
			if(sensoriallarme.contains(d.getIds()))
				d.setStato(stato);
		}
		return datiTot;
	}
}
