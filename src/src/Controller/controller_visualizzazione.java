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
		String db;
		if(zona.contains("ZA"))
			db="edificioza01";
		else
			db="edificiozb01";
		listae= Edificio.prendiedifici(zona,db);
		ObservableList<String> listaedifici= FXCollections.observableArrayList();
		String nome;
		if(listae.isEmpty()) {
			Alert alert1 = new Alert(AlertType.INFORMATION);
			alert1.setTitle("Attenzione!!");
			alert1.setHeaderText("Non ci sono edifici da monitorare.");
			alert1.showAndWait();
		}else {
			for(Edificio e: listae) {
				nome=e.getNomeedificio();
				listaedifici.add(nome);
			}
		}
		return listaedifici;
	}
	
	public static ObservableList<String> prendipiani(String edificio) {
		String db;
		if(edificio.contains("ZA01"))
			db="edificioza01";
		else if(edificio.contains("ZA02"))
			db="edificioza02";
		else
			db="edificiozb01";
		listap= Stanza.prendipiani(edificio,db);
		ObservableList<String> listapiani= FXCollections.observableArrayList();
		String nome;
		if(listap.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Attenzione!!");
			alert.setHeaderText("Non ci sono piani da monitorare.");
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
