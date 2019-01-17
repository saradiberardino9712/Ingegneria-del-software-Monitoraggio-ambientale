package Controller;

import java.util.ArrayList;

import Model.Zona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class controller_visualizzazione {
	
	public static ArrayList<Zona> lista;
	
	public static ObservableList<String> prendizone(String città) {
		lista= Zona.prendizone(città);
		ObservableList<String> listazone= FXCollections.observableArrayList();
		String nome;
		if(lista.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Attenzione!!");
			alert.setHeaderText("Non ci sono zone da monitorare.");
			alert.showAndWait();
		}else {
			for(Zona z: lista) {
				nome=z.getNomezona();
				listazone.add(nome);
			}
		}
		return listazone;
	}
}
