package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Controller.controller_logout;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AmministratoreController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnutenti;

    @FXML
    private Button btnarea;

    @FXML
    private Button btnSoglie;

    @FXML
    private Label txtdataora;

    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'Amministratore.fxml'.";
        assert btnutenti != null : "fx:id=\"btnutenti\" was not injected: check your FXML file 'Amministratore.fxml'.";
        assert btnarea != null : "fx:id=\"btnarea\" was not injected: check your FXML file 'Amministratore.fxml'.";
        assert btnSoglie != null : "fx:id=\"btnSoglie\" was not injected: check your FXML file 'Amministratore.fxml'.";
        assert txtdataora != null : "fx:id=\"txtdataora\" was not injected: check your FXML file 'Amministratore.fxml'.";
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
    
    public void GestioneUtenti(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/utenti.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    public void GestioneSoglie(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/soglie.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    public void GestioneArea(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/area.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
}
