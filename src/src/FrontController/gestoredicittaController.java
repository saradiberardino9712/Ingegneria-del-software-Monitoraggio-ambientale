package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import Controller.controller_logout;
import Controller.controller_visualizzazione;
import Model.Città;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
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

    @FXML
    private TableView<Sensore> tablecitta;
    
    @FXML
    private TableColumn<Sensore, String> tiposensore;

    @FXML
    private TableColumn<Sensore, Integer> conteggio;

    @FXML
    private Button btnzonaA;

    @FXML
    private Button btnzonaB;

    @FXML
    private Button btnzonaC;

    @FXML
    private Button btnzonaD;

    @FXML
    private Button btnzonaE;

    @FXML
    private Button btnzonaF;

    @FXML
    private Button btnzonaG;

    @FXML
    private Button btnzonaH;

    @FXML
    private Button btnzonaI;

    @FXML
    private Button btnzonaL;

    @FXML
    private Label txtnomecitta1;

    @FXML
    private Label txtnzone;

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
    private Label txtdataora;

    @FXML
    void initialize() {
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnomecitta != null : "fx:id=\"txtnomecitta\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert listviewzone != null : "fx:id=\"listviewzone\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert tablecitta != null : "fx:id=\"tablecitta\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert tiposensore != null : "fx:id=\"tiposensore\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert conteggio != null : "fx:id=\"conteggio\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaA != null : "fx:id=\"btnzonaA\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaB != null : "fx:id=\"btnzonaB\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaC != null : "fx:id=\"btnzonac\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaD != null : "fx:id=\"btnzonad\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaE != null : "fx:id=\"btnzonae\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaF != null : "fx:id=\"btnzonaf\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaG != null : "fx:id=\"btnzonag\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaH != null : "fx:id=\"btnzonah\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaI != null : "fx:id=\"btnzonai\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnzonaL != null : "fx:id=\"btnzonal\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnomecitta1 != null : "fx:id=\"txtnomecitta1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtnzone != null : "fx:id=\"txtnzone\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng1 != null : "fx:id=\"btng1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr1 != null : "fx:id=\"btnr1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno1 != null : "fx:id=\"btno1\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng2 != null : "fx:id=\"btng2\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr2 != null : "fx:id=\"btnr2\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno2 != null : "fx:id=\"btno2\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng5 != null : "fx:id=\"btng5\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr5 != null : "fx:id=\"btnr5\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno5 != null : "fx:id=\"btno5\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng6 != null : "fx:id=\"btng6\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr6 != null : "fx:id=\"btnr6\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno6 != null : "fx:id=\"btno6\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng9 != null : "fx:id=\"btng9\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr9 != null : "fx:id=\"btnr9\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno9 != null : "fx:id=\"btno9\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng3 != null : "fx:id=\"btng3\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr3 != null : "fx:id=\"btnr3\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno3 != null : "fx:id=\"btno3\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng4 != null : "fx:id=\"btng4\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr4 != null : "fx:id=\"btnr4\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno4 != null : "fx:id=\"btno4\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng7 != null : "fx:id=\"btng7\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr7 != null : "fx:id=\"btnr7\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno7 != null : "fx:id=\"btno7\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng8 != null : "fx:id=\"btng8\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr8 != null : "fx:id=\"btnr8\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno8 != null : "fx:id=\"btno8\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btng10 != null : "fx:id=\"btng10\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btnr10 != null : "fx:id=\"btnr10\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert btno10 != null : "fx:id=\"btno10\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        assert txtdataora != null : "fx:id=\"txtdataora\" was not injected: check your FXML file 'gestoredicitta.fxml'.";
        btng1.setVisible(false);
        setta();
    }
    
    public void setta() {
    	String città=Utente.getIstance().getIDArea();
    	txtnomecitta.setText(città);
    	txtnomecitta1.setText(città);
    	Città c= Città.prendicittà(città);
    	txtnzone.setText(Integer.toString(c.getNzone()));
    	ObservableList<String> listzone= controller_visualizzazione.prendizone(città);
    	listviewzone.setItems(listzone);
    	Zona z;
    	String s;
    	for(int i=0; i<controller_visualizzazione.listaz.size();i++) {
    		z=controller_visualizzazione.listaz.get(i);
    		s=z.getNomezona();
    		switch(i) {
    		case 0: btnzonaA.setText(s);
    				break;
    		case 1: btnzonaB.setText(s);
					break;
    		case 2: btnzonaC.setText(s);
					break;
    		case 3: btnzonaD.setText(s);
					break;
    		case 4: btnzonaE.setText(s);
					break;
    		case 5: btnzonaF.setText(s);
					break;
    		case 6: btnzonaG.setText(s);
					break;
    		case 7: btnzonaH.setText(s);
					break;
    		case 8: btnzonaI.setText(s);
					break;
    		case 9: btnzonaL.setText(s);
					 break;
    		}
    	}
    	ObservableList<Sensore> lista = FXCollections.observableArrayList();
    	lista=Sensore.prendiAll();
    	tiposensore.setCellValueFactory(new PropertyValueFactory<Sensore,String>("tiposensore"));
    	conteggio.setCellValueFactory(new PropertyValueFactory<Sensore,Integer>("conteggio"));
    	tablecitta.setItems(lista);
    	/*Timer timer = new Timer();
		TimerTask task = new MyTask(txtdataora);
		timer.schedule( task, 0, 1000 );*/
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
    
    public static String zona=null;
    public void ZonaA(ActionEvent event) throws IOException {
    	zona=btnzonaA.getText();
    	Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/gestoredizona.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    @FXML
    void ZonaL(ActionEvent event) {

    }

    @FXML
    void ZonaB(ActionEvent event) {

    }

    @FXML
    void ZonaC(ActionEvent event) {

    }

    @FXML
    void ZonaD(ActionEvent event) {

    }

    @FXML
    void ZonaE(ActionEvent event) {

    }

    @FXML
    void ZonaF(ActionEvent event) {

    }

    @FXML
    void ZonaG(ActionEvent event) {

    }

    @FXML
    void ZonaH(ActionEvent event) {

    }

    @FXML
    void ZonaI(ActionEvent event) {

    }
}
