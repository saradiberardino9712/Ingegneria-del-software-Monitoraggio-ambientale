package FrontController;

import java.net.URL;
import java.util.ResourceBundle;
import Model.Edificio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

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
    private TableView<Object> tableedificio;

    @FXML
    private Label txtnomeedificio1;

    @FXML
    private Label txtnpiani;

    @FXML
    private TableView<String> table1;

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
        assert txtnomeedificio1 != null : "fx:id=\"txtnomeedificio1\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert txtnpiani != null : "fx:id=\"txtnpiani\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table1 != null : "fx:id=\"table1\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table2 != null : "fx:id=\"table2\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table3 != null : "fx:id=\"table3\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table4 != null : "fx:id=\"table4\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        assert table5 != null : "fx:id=\"table5\" was not injected: check your FXML file 'gestorediedificio.fxml'.";
        setta();
    }
    
	public void setta() {
    	String edificio=Edificio.prendiedificio();
    	txtnomeedificio.setText(edificio);
    	txtnomeedificio1.setText(edificio);
    	txtnpiani.setText("10");
    	listviewpiani.setItems(list);
    	
    }
}

