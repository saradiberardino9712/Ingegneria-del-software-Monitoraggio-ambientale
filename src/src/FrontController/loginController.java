package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Controller.controller_login;
import Model.Utente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtemail;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnLogin;

    @FXML
    void initialize() {
        assert txtemail != null : "fx:id=\"txtemail\" was not injected: check your FXML file 'login.fxml'.";
        assert txtpassword != null : "fx:id=\"txtpassword\" was not injected: check your FXML file 'login.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'login.fxml'.";
    } 
    
    public void Login(ActionEvent event) throws IOException {
    	boolean verifica=controller_login.verificacredenziali(txtemail, txtpassword);
		if(verifica) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Login effettuato!!");
			alert.showAndWait();
			switch(Utente.getIstance().getRuolo()) {
				case "edificio":((Node) event.getSource()).getScene().getWindow().hide();
								Stage primaryStage = new Stage();
								Pane root = (Pane) FXMLLoader.load(getClass().getResource("/application/javafx/gestorediedificio.fxml"));
								Scene scene = new Scene(root);
								primaryStage.setScene(scene);
								primaryStage.show();
								break;
				case "citta":((Node) event.getSource()).getScene().getWindow().hide();
							 Stage primaryStage1 = new Stage();
							 Pane root1 = (Pane) FXMLLoader.load(getClass().getResource("/application/javafx/gestoredicitta.fxml"));
							 Scene scene1 = new Scene(root1);
							 primaryStage1.setScene(scene1);
							 primaryStage1.show();
							 break;
				case "zona":((Node) event.getSource()).getScene().getWindow().hide();
							Stage primaryStage2 = new Stage();
							Pane root2 = (Pane) FXMLLoader.load(getClass().getResource("/application/javafx/gestoredizona.fxml"));
							Scene scene2 = new Scene(root2);
							primaryStage2.setScene(scene2);
							primaryStage2.show();
							break;
				case "admin":((Node) event.getSource()).getScene().getWindow().hide();
							 Stage primaryStage3 = new Stage();
							 Pane root3 = (Pane) FXMLLoader.load(getClass().getResource("/application/javafx/Amministratore.fxml"));
							 primaryStage3.setResizable(true);
							 Scene scene3 = new Scene(root3);
							 primaryStage3.setScene(scene3);
							 primaryStage3.show();
							 break;
			}
		}
	}
}
