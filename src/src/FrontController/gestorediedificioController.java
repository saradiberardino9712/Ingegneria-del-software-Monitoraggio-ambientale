package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Controller.controller_logout;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
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
    private TableColumn<Dato, String> stato;

    @FXML
    private TableColumn<Dato, String> dataora;

    @FXML
    private TableColumn<Dato, String> tipo;

    @FXML
    private TableColumn<Dato,String> ids;

    @FXML
    private TableColumn<Dato, Integer> valore;

    @FXML
    private TableColumn<Dato, String> stanza;

    @FXML
    private TableColumn<Dato, String> edificio;

    @FXML
    private TableColumn<Dato, String> zona;

    @FXML
    private TableView<?> table2;

    @FXML
    private TableView<?> table3;

    @FXML
    private TableView<?> table4;

    @FXML
    private TableView<?> table5;
    
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
        assert table2 != null : "fx:id=\"table2\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table3 != null : "fx:id=\"table3\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table4 != null : "fx:id=\"table4\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table5 != null : "fx:id=\"table5\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        setta();
    }
    
	public void setta() {
		String ed;
    	if(Utente.getIstance().getRuolo().equals("edificio")) {
    		ed=Utente.getIstance().getIDArea();
    	}else {
    		ed=gestoredizonaController.edificio;
    		btnLogout.setVisible(false);
    	}
    	txtnomeedificio.setText(ed);
    	txtnomeedificio1.setText(ed);
    	Edificio e=Edificio.prendiedificio(ed);
    	txtnpiani.setText(Integer.toString(e.getNpiani()));
    	ObservableList<String> listpiani= controller_visualizzazione.prendipiani(ed);
    	listviewpiani.setItems(listpiani);
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prendiED();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tableedificio.setItems(lista);
    	ObservableList<Dato> lista1 = FXCollections.observableArrayList();
    	lista1=Dato.prendidati();
    	stato.setCellValueFactory(new PropertyValueFactory<Dato,String>("stato"));
    	dataora.setCellValueFactory(new PropertyValueFactory<Dato,String>("dataora"));
    	tipo.setCellValueFactory(new PropertyValueFactory<Dato,String>("tipo"));
    	ids.setCellValueFactory(new PropertyValueFactory<Dato,String>("ids"));
    	valore.setCellValueFactory(new PropertyValueFactory<Dato,Integer>("valore"));
    	stanza.setCellValueFactory(new PropertyValueFactory<Dato,String>("stanza"));
    	edificio.setCellValueFactory(new PropertyValueFactory<Dato,String>("edificio"));
    	zona.setCellValueFactory(new PropertyValueFactory<Dato,String>("zona"));
    	table1.setItems(lista1);
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

}

