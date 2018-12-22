package FrontController;

import java.net.URL;
import java.util.ResourceBundle;
import Model.Città;
import Model.Sensore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class gestoredicittaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogout;

    @FXML
    private Label txtnomecitta;

    @FXML
    private ListView<String> listviewzone;
    ObservableList<String> list = FXCollections.observableArrayList("Zona A", "Zona B", "Zona C",
			"Zona D", "Zona E", "Zona F", "Zona G");

    @FXML
    private TableView<Sensore> tablecitta;

    @FXML
    private Button btnzonaA;

    @FXML
    private Button btnzonaB;

    @FXML
    private Button btnzonac;

    @FXML
    private Button btnzonad;

    @FXML
    private Button btnzonae;

    @FXML
    private Button btnzonaf;

    @FXML
    private Button btnzonag;

    @FXML
    private Button btnzonah;

    @FXML
    private Button btnzonai;

    @FXML
    private Button btnzonal;
    
    @FXML
    private Label txtnomecitta1;

    @FXML
    private Label txtnzone;
    
    @FXML
    private TableColumn<Sensore, String> tiposensore;

    @FXML
    private TableColumn<Sensore, Integer> conteggio;

    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnomecitta != null : "fx:id=\"nomecitta\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert listviewzone != null : "fx:id=\"listviewzone\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert tablecitta != null : "fx:id=\"tablecitta\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaA != null : "fx:id=\"btnzonaA\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaB != null : "fx:id=\"btnzonaB\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonac != null : "fx:id=\"btnzonac\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonad != null : "fx:id=\"btnzonad\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonae != null : "fx:id=\"btnzonae\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaf != null : "fx:id=\"btnzonaf\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonag != null : "fx:id=\"btnzonag\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonah != null : "fx:id=\"btnzonah\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonai != null : "fx:id=\"btnzonai\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonal != null : "fx:id=\"btnzonal\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnomecitta1 != null : "fx:id=\"txtnomecitta1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnzone != null : "fx:id=\"nzone\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert tiposensore != null : "fx:id=\"col1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert conteggio != null : "fx:id=\"col2\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        setta();
    }
    
    public void setta() {
    	Città città=Città.prendicittà();
    	txtnomecitta.setText(città.getNomecittà());
    	txtnomecitta1.setText(città.getNomecittà());
    	txtnzone.setText(Integer.toString(città.getNzone()));
    	listviewzone.setItems(list);
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prenditips();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tablecitta.setItems(lista);
    }
    
    public void Logout(ActionEvent event) {
    	
    }
    
    public void Zona(ActionEvent event) throws Exception {
    	Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/gestoredizona.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
}
