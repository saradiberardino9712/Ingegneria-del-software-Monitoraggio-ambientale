package FrontController;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Dato;
import Model.Edificio;
import Model.Sensore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    ObservableList<String> list = FXCollections.observableArrayList("Piano 1", "Piano 2", "Piano 3",
			"Piano 4", "Piano 5");

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
    void Logout(ActionEvent event) {

    }

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
    	Edificio e=Edificio.prendiedificio();
    	txtnomeedificio.setText(e.getNomeedificio());
    	txtnomeedificio1.setText(e.getNomeedificio());
    	txtnpiani.setText(Integer.toString(e.getNpiani()));
    	listviewpiani.setItems(list);
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prenditips();
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
}

