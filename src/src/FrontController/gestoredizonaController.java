package FrontController;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Sensore;
import Model.Zona;
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
    ObservableList<String> list = FXCollections.observableArrayList("Edificio 1", "Edificio 2", "Edificio 3",
			"Edificio 4", "Edificio 5", "Edificio 6", "Edificio 7");

    @FXML
    private TableView<Sensore> tablezona;

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
    private TableColumn<Sensore, String> tiposensore;

    @FXML
    private TableColumn<Sensore, Integer> conteggio;

    @FXML
    void Logout(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert txtnomezona != null : "fx:id=\"txtnomezona\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert listviewedifici != null : "fx:id=\"listviewedifici\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert tablezona != null : "fx:id=\"tablezona\" was not injected: check your FXML file 'gestoredizona.fxml'.";
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
        assert tiposensore != null : "fx:id=\"tiposensore\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        assert conteggio != null : "fx:id=\"conteggio\" was not injected: check your FXML file 'gestoredizona.fxml'.";
        setta();
    }
    
    public void setta() {
    	Zona zona=Zona.prendizona();
    	txtnomezona.setText(zona.getNomezona());
    	txtnomezona1.setText(zona.getNomezona());
    	txtnedifici.setText(Integer.toString(zona.getNedifici()));
    	listviewedifici.setItems(list);
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prenditips();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tablezona.setItems(lista);
    }
    
    public void Edificio(ActionEvent event) throws Exception {
    	Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/gestorediedificio.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
}
