package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Controller.controller_logout;
import Controller.controller_malfunzionamenti;
import Controller.controller_visualizzazione;
import Model.Dato;
import Model.Edificio;
import Model.Sensore;
import Model.Utente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class gestorediedificioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogout;

    @FXML
    private Label txtnomeedificio;

    @FXML
    private ListView<String> listviewpiani;

    @FXML
    private TableView<Sensore> tableedificio;
    
    @FXML
    private TableColumn<Sensore, String> tiposensore;

    @FXML
    private TableColumn<Sensore, Integer> conteggio;

    @FXML
    private Label txtnomeedificio1;

    @FXML
    private Label txtnpiani;

    @FXML
    private TableView<Dato> table1;
    
    @FXML
    private TableColumn<Dato, Button> stato;

    @FXML
    private TableColumn<Dato, String> dataora;

    @FXML
    private TableColumn<Dato, String> tipo;

    @FXML
    private TableColumn<Dato, String> ids;

    @FXML
    private TableColumn<Dato, Integer> valore;

    @FXML
    private TableColumn<Dato, String> stanza;

    @FXML
    private TableColumn<Dato, String> edificio;

    @FXML
    private TableColumn<Dato, String> zona;
    
    @FXML
    private Button btnpiano1;

    @FXML
    private Button btnpiano2;

    @FXML
    private Button btnpiano3;

    @FXML
    private Button btnpiano4;

    @FXML
    private Button btnpiano5;
    
    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert txtnomeedificio != null : "fx:id=\"txtnomeedificio\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert listviewpiani != null : "fx:id=\"listviewedifici\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert tableedificio != null : "fx:id=\"tableedificio\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert tiposensore != null : "fx:id=\"tiposensore\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert conteggio != null : "fx:id=\"conteggio\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert txtnomeedificio1 != null : "fx:id=\"txtnomeedificio1\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert txtnpiani != null : "fx:id=\"txtnpiani\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table1 != null : "fx:id=\"table1\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert stato != null : "fx:id=\"stato\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert dataora != null : "fx:id=\"dataora\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert tipo != null : "fx:id=\"tipo\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert ids != null : "fx:id=\"ids\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert valore != null : "fx:id=\"valore\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert stanza != null : "fx:id=\"stanza\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert edificio != null : "fx:id=\"edificio\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert zona != null : "fx:id=\"zona\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert btnpiano1 != null : "fx:id=\"btnpiano1\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert btnpiano2 != null : "fx:id=\"btnpiano2\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert btnpiano3 != null : "fx:id=\"btnpiano3\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert btnpiano4 != null : "fx:id=\"btnpiano4\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert btnpiano5 != null : "fx:id=\"btnpiano5\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        setta();
    }
    
    public static String ed;
	public void setta() {
    	if(Utente.getIstance().getRuolo().equals("edificio")) {
    		ed=Utente.getIstance().getIDArea();
    	}else {
    		ed=gestoredizonaController.edificio;
    		btnLogout.setVisible(false);
    	}
    	txtnomeedificio.setText(ed);
    	txtnomeedificio1.setText(ed);
    	String db;
		if(ed.contains("ZA01"))
			db="edificioza01";
		else if(ed.contains("ZA02"))
			db="edificioza02";
		else
			db="edificiozb01";
    	Edificio e=Edificio.prendiedificio(ed,db);
    	txtnpiani.setText(Integer.toString(e.getNpiani()));
    	ObservableList<String> listpiani= controller_visualizzazione.prendipiani(ed);
    	listviewpiani.setItems(listpiani);
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prendiED();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tableedificio.setItems(lista);
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
    
    public void Piano1(ActionEvent event) {
    	btnpiano1.setStyle("-fx-background-color:#ffffe6");
    	btnpiano2.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano3.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano4.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano5.setStyle("-fx-background-color:#f2f2f2");
    	stato.setCellValueFactory(new PropertyValueFactory<Dato,Button>("stato"));
		dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
		tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
		ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
		valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
		stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
		edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
		zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
		ObservableList<Dato> lista = FXCollections.observableArrayList();
    	lista=controller_malfunzionamenti.analizza(ed,1);
    	table1.getItems().addAll(lista);
    }

    public void Piano2(ActionEvent event) {
    	btnpiano1.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano2.setStyle("-fx-background-color:#ffffe6");
    	btnpiano3.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano4.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano5.setStyle("-fx-background-color:#f2f2f2");
    	stato.setCellValueFactory(new PropertyValueFactory<Dato,Button>("stato"));
		dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
		tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
		ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
		valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
		stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
		edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
		zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
		ObservableList<Dato> lista = FXCollections.observableArrayList();
    	lista=controller_malfunzionamenti.analizza(ed,1);
    	table1.getItems().addAll(lista);
    }

    public void Piano3(ActionEvent event) {
    	btnpiano1.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano2.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano3.setStyle("-fx-background-color:#ffffe6");
    	btnpiano4.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano5.setStyle("-fx-background-color:#f2f2f2");
    	stato.setCellValueFactory(new PropertyValueFactory<Dato,Button>("stato"));
		dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
		tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
		ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
		valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
		stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
		edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
		zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
		ObservableList<Dato> lista = FXCollections.observableArrayList();
    	lista=controller_malfunzionamenti.analizza(ed,1);
    	table1.getItems().addAll(lista);
    }

    public void Piano4(ActionEvent event) {
    	btnpiano1.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano2.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano3.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano4.setStyle("-fx-background-color:#ffffe6");
    	btnpiano5.setStyle("-fx-background-color:#f2f2f2");
    	stato.setCellValueFactory(new PropertyValueFactory<Dato,Button>("stato"));
		dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
		tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
		ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
		valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
		stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
		edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
		zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
		ObservableList<Dato> lista = FXCollections.observableArrayList();
    	lista=controller_malfunzionamenti.analizza(ed,1);
    	table1.getItems().addAll(lista);
    }

    public void Piano5(ActionEvent event) {
    	btnpiano1.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano2.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano3.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano4.setStyle("-fx-background-color:#f2f2f2");
    	btnpiano5.setStyle("-fx-background-color:#ffffe6");
	    stato.setCellValueFactory(new PropertyValueFactory<Dato,Button>("stato"));
		dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
		tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
		ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
		valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
		stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
		edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
		zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
		ObservableList<Dato> lista = FXCollections.observableArrayList();
	    lista=controller_malfunzionamenti.analizza(ed,1);
	    table1.getItems().addAll(lista);
    }
}

