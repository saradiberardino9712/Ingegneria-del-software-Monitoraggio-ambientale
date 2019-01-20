package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Controller.controller_logout;
import Controller.controller_visualizzazione;
import Model.Sensore;
import Model.Utente;
import Model.Zona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class gestoredizonaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogout;

    @FXML
    private Label txtnomezona;

    @FXML
    private ListView<String> listviewedifici;

    @FXML
    private TableView<Sensore> tablezona;

    @FXML
    private TableColumn<Sensore, String> tiposensore;

    @FXML
    private TableColumn<Sensore, Integer> conteggio;

    @FXML
    private Button btnedificio1;

    @FXML
    private Button btnedificio2;

    @FXML
    private Button btnedificio3;

    @FXML
    private Button btnedificio4;

    @FXML
    private Button btnedificio5;

    @FXML
    private Button btnedificio6;

    @FXML
    private Button btnedificio7;

    @FXML
    private Button btnedificio8;

    @FXML
    private Button btnedificio9;

    @FXML
    private Button btnedificio10;

    @FXML
    private Label txtnomezona1;

    @FXML
    private Label txtnedifici;

    @FXML
    private Circle btng1;

    @FXML
    private Circle btnr1;

    @FXML
    private Circle btno1;

    @FXML
    private Circle btng2;

    @FXML
    private Circle btnr2;

    @FXML
    private Circle btno2;

    @FXML
    private Circle btng5;

    @FXML
    private Circle btnr5;

    @FXML
    private Circle btno5;

    @FXML
    private Circle btng6;

    @FXML
    private Circle btnr6;

    @FXML
    private Circle btno6;

    @FXML
    private Circle btng9;

    @FXML
    private Circle btnr9;

    @FXML
    private Circle btno9;

    @FXML
    private Circle btng3;

    @FXML
    private Circle btnr3;

    @FXML
    private Circle btno3;

    @FXML
    private Circle btng4;

    @FXML
    private Circle btnr4;

    @FXML
    private Circle btno4;

    @FXML
    private Circle btng7;

    @FXML
    private Circle btnr7;

    @FXML
    private Circle btno7;

    @FXML
    private Circle btng8;

    @FXML
    private Circle btnr8;

    @FXML
    private Circle btno8;

    @FXML
    private Circle btng10;

    @FXML
    private Circle btnr10;

    @FXML
    private Circle btno10;

    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert txtnomezona != null : "fx:id=\"txtnomezona\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert listviewedifici != null : "fx:id=\"listviewedifici\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert tablezona != null : "fx:id=\"tablezona\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert tiposensore != null : "fx:id=\"tiposensore\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert conteggio != null : "fx:id=\"conteggio\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio1 != null : "fx:id=\"btnedificio1\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio2 != null : "fx:id=\"btnedificio2\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio3 != null : "fx:id=\"btnedificio3\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio4 != null : "fx:id=\"btnedificio4\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio5 != null : "fx:id=\"btnedificio5\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio6 != null : "fx:id=\"btnedificio6\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio7 != null : "fx:id=\"btnedificio7\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio8 != null : "fx:id=\"btnedificio8\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio9 != null : "fx:id=\"btnedificio9\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnedificio10 != null : "fx:id=\"btnedificio10\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert txtnomezona1 != null : "fx:id=\"txtnomezona1\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert txtnedifici != null : "fx:id=\"txtnedifici\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng1 != null : "fx:id=\"btng1\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr1 != null : "fx:id=\"btnr1\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno1 != null : "fx:id=\"btno1\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng2 != null : "fx:id=\"btng2\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr2 != null : "fx:id=\"btnr2\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno2 != null : "fx:id=\"btno2\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng5 != null : "fx:id=\"btng5\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr5 != null : "fx:id=\"btnr5\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno5 != null : "fx:id=\"btno5\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng6 != null : "fx:id=\"btng6\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr6 != null : "fx:id=\"btnr6\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno6 != null : "fx:id=\"btno6\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng9 != null : "fx:id=\"btng9\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr9 != null : "fx:id=\"btnr9\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno9 != null : "fx:id=\"btno9\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng3 != null : "fx:id=\"btng3\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr3 != null : "fx:id=\"btnr3\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno3 != null : "fx:id=\"btno3\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng4 != null : "fx:id=\"btng4\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr4 != null : "fx:id=\"btnr4\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno4 != null : "fx:id=\"btno4\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng7 != null : "fx:id=\"btng7\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr7 != null : "fx:id=\"btnr7\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno7 != null : "fx:id=\"btno7\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng8 != null : "fx:id=\"btng8\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr8 != null : "fx:id=\"btnr8\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno8 != null : "fx:id=\"btno8\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btng10 != null : "fx:id=\"btng10\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btnr10 != null : "fx:id=\"btnr10\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert btno10 != null : "fx:id=\"btno10\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        setta();
        button();
    }
    
    public void button() {
    	if(zon.contains("ZB")) {
    		btng1.setVisible(false);
    		btno1.setVisible(false);
    	}else {
    		btng1.setVisible(false);
    		btng2.setVisible(false);
    		btno1.setVisible(false);
    		btno2.setVisible(false);
    	}
    }
    
	private static String zon;
    public void setta() {
    	if(Utente.getIstance().getRuolo().equals("zona")) {
    		zon=Utente.getIstance().getIDArea();
    	}else {
    		zon=gestoredicittaController.zona;
    		btnLogout.setVisible(false);
    	}
    	txtnomezona.setText(zon);
    	txtnomezona1.setText(zon);
    	Zona z= Zona.prendi(zon);
    	txtnedifici.setText(Integer.toString(z.getNedifici()));
    	ObservableList<String> listedifici= controller_visualizzazione.prendiedifici(zon);
    	listviewedifici.setItems(listedifici);
    	Model.Edificio e;
    	String s;
    	for(int i=0; i<controller_visualizzazione.listae.size();i++) {
    		e=controller_visualizzazione.listae.get(i);
    		s=e.getNomeedificio();
    		switch(i) {
    		case 0: btnedificio1.setText(s);
    				break;
    		case 1: btnedificio2.setText(s);
					break;
    		case 2: btnedificio3.setText(s);
					break;
    		case 3: btnedificio4.setText(s);
					break;
    		case 4: btnedificio5.setText(s);
					break;
    		case 5: btnedificio6.setText(s);
					break;
    		case 6: btnedificio7.setText(s);
					break;
    		case 7: btnedificio8.setText(s);
					break;
    		case 8: btnedificio9.setText(s);
					break;
    		case 9: btnedificio10.setText(s);
					 break;
    		}
    	}
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prendiZN();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tablezona.setItems(lista);
    }
    
    public void Logout(ActionEvent event) throws IOException {
    	boolean disattiva=controller_logout.disattivautente();
    	if(disattiva) {
    		((Node)event.getSource()).getScene().getWindow().hide();
    		Stage primaryStage = new Stage();
    		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/login.fxml"));
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.show();
    	}
    }
    
    public static String edificio=null;
    public void Edificio1(ActionEvent event) throws Exception {
    	edificio=btnedificio1.getText();
    	Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/gestorediedificio.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    public void Edificio10(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio2(ActionEvent event) throws IOException {
    	if(zon.contains("ZB")) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Attenzione!!");
    		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
    		alert.showAndWait();
    	}else {
    		edificio=btnedificio2.getText();
    		Stage primaryStage = new Stage();
    		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/gestorediedificio.fxml"));
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.show();
    	}
    }

    public void Edificio3(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio4(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio5(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio6(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio7(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio8(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }

    public void Edificio9(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Attenzione!!");
		alert.setHeaderText("Il prototipo comprende solo la gestione di 2 edifici della zona A e 1 della zona B");
		alert.showAndWait();
    }
}
