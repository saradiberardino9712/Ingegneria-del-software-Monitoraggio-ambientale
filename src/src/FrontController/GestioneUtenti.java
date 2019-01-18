package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Model.Utente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GestioneUtenti {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnHome;

    @FXML
    private Label txtdataora;

    @FXML
    private TableView<Utente> tableutenti;
    
    @FXML
    private TableColumn<Utente, CheckBox> select;

    @FXML
    private TableColumn<Utente, String> ruolo;

    @FXML
    private TableColumn<Utente, String> nome;

    @FXML
    private TableColumn<Utente, String> cognome;

    @FXML
    private TableColumn<Utente, String> email;

    @FXML
    private TableColumn<Utente, String> password;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btndelete;

    @FXML
    private Menu MenuHome;

    @FXML
    void Add(ActionEvent event) {

    }

    @FXML
    void Delete(ActionEvent event) {

    }

    @FXML
    void Update(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnHome != null : "fx:id=\"btnHome\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txtdataora != null : "fx:id=\"txtdataora\" was not injected: check your FXML file 'utenti.fxml'.";
        assert tableutenti != null : "fx:id=\"tableutenti\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btnadd != null : "fx:id=\"btnadd\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btnupdate != null : "fx:id=\"btnupdate\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btndelete != null : "fx:id=\"btndelete\" was not injected: check your FXML file 'utenti.fxml'.";
        assert MenuHome != null : "fx:id=\"MenuHome\" was not injected: check your FXML file 'utenti.fxml'.";
        assert select != null : "fx:id=\"codice\" was not injected: check your FXML file 'utenti.fxml'.";
        assert ruolo != null : "fx:id=\"ruolo\" was not injected: check your FXML file 'utenti.fxml'.";
        assert nome != null : "fx:id=\"nome\" was not injected: check your FXML file 'utenti.fxml'.";
        assert cognome != null : "fx:id=\"cognome\" was not injected: check your FXML file 'utenti.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'utenti.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'utenti.fxml'.";
        setta();
    }
    
    public static ObservableList<Utente> listautenti=FXCollections.observableArrayList();
    public void setta() {
    	listautenti=Utente.prendiutenti();
    	ruolo.setCellValueFactory(new PropertyValueFactory<Utente,String>("ruolo"));
    	nome.setCellValueFactory(new PropertyValueFactory<Utente,String>("nome"));
    	cognome.setCellValueFactory(new PropertyValueFactory<Utente,String>("cognome"));
    	email.setCellValueFactory(new PropertyValueFactory<Utente,String>("email"));
    	password.setCellValueFactory(new PropertyValueFactory<Utente,String>("password"));
    	select.setCellValueFactory(new PropertyValueFactory<Utente,CheckBox>("select"));
    	tableutenti.setItems(listautenti);
    }
    
    public void Home(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/Amministratore.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
}
