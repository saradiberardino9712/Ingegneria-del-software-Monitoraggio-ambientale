package Controller;

import java.util.ArrayList;

import Model.Edificio;
import Model.Stanza;
import Model.Zona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class controller_visualizzazione {
	
	public static ArrayList<Zona> listaz;
	public static ArrayList<Edificio> listae;
	public static ArrayList<Stanza> listap;
	
	public static ObservableList<String> prendizone(String città) {
		listaz= Zona.prendizone(città);
		ObservableList<String> listazone= FXCollections.observableArrayList();
		String nome;
		if(listaz.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Attenzione!!");
			alert.setHeaderText("Non ci sono zone da monitorare.");
			alert.showAndWait();
		}else {
			for(Zona z: listaz) {
				nome=z.getNomezona();
				listazone.add(nome);
			}
		}
		return listazone;
	}
	
	public static ObservableList<String> prendiedifici(String zona) {
		listae= Edificio.prendiedifici(zona);
		ObservableList<String> listaedifici= FXCollections.observableArrayList();
		String nome;
		if(listae.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Attenzione!!");
			alert.setHeaderText("Non ci sono edifici da monitorare.");
			alert.showAndWait();
		}else {
			for(Edificio e: listae) {
				nome=e.getNomeedificio();
				listaedifici.add(nome);
			}
		}
		return listaedifici;
	}
	
	public static ObservableList<String> prendipiani(String edificio) {
		listap= Stanza.prendipiani(edificio);
		ObservableList<String> listapiani= FXCollections.observableArrayList();
		String nome;
		if(listap.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Attenzione!!");
			alert.setHeaderText("Non ci sono edifici da monitorare.");
			alert.showAndWait();
		}else {
			for(Stanza s: listap) {
				nome=s.getPiano();
				listapiani.add(nome);
			}
		}
		return listapiani;
	}
}
