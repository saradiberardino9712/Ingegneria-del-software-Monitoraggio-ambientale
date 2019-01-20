package FrontController;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.TreeMap;

import Model.Utente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GestioneUtentiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtdataora;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btndelete;

    @FXML
    private TextField txt11;

    @FXML
    private TextField txt12;

    @FXML
    private TextField txt13;

    @FXML
    private TextField txt14;

    @FXML
    private TextField txt15;

    @FXML
    private TextField txt16;

    @FXML
    private TextField txt17;

    @FXML
    private TextField txt18;

    @FXML
    private TextField txt19;

    @FXML
    private TextField txt110;

    @FXML
    private TextField txt21;

    @FXML
    private TextField txt22;

    @FXML
    private TextField txt41;

    @FXML
    private TextField txt23;

    @FXML
    private TextField txt24;

    @FXML
    private TextField txt25;

    @FXML
    private TextField txt42;

    @FXML
    private TextField txt43;

    @FXML
    private TextField txt26;

    @FXML
    private TextField txt210;

    @FXML
    private TextField txt29;

    @FXML
    private TextField txt28;

    @FXML
    private TextField txt27;

    @FXML
    private TextField txt410;

    @FXML
    private TextField txt49;

    @FXML
    private TextField txt48;

    @FXML
    private TextField txt47;

    @FXML
    private TextField txt46;

    @FXML
    private TextField txt45;

    @FXML
    private TextField txt44;

    @FXML
    private TextField txt55;

    @FXML
    private TextField txt54;

    @FXML
    private TextField txt53;

    @FXML
    private TextField txt52;

    @FXML
    private TextField txt51;

    @FXML
    private TextField txt59;

    @FXML
    private TextField txt58;

    @FXML
    private TextField txt57;

    @FXML
    private TextField txt56;

    @FXML
    private TextField txt62;

    @FXML
    private TextField txt71;

    @FXML
    private TextField txt61;

    @FXML
    private TextField txt510;

    @FXML
    private TextField txt65;

    @FXML
    private TextField txt74;

    @FXML
    private TextField txt64;

    @FXML
    private TextField txt73;

    @FXML
    private TextField txt63;

    @FXML
    private TextField txt72;

    @FXML
    private TextField txt67;

    @FXML
    private TextField txt76;

    @FXML
    private TextField txt66;

    @FXML
    private TextField txt75;

    @FXML
    private TextField txt69;

    @FXML
    private TextField txt78;

    @FXML
    private TextField txt68;

    @FXML
    private TextField txt77;

    @FXML
    private TextField txt710;

    @FXML
    private TextField txt610;

    @FXML
    private TextField txt79;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check4;

    @FXML
    private CheckBox check10;

    @FXML
    private CheckBox check9;

    @FXML
    private CheckBox check8;

    @FXML
    private TextField txt310;

    @FXML
    private TextField txt39;

    @FXML
    private TextField txt38;

    @FXML
    private TextField txt37;

    @FXML
    private TextField txt36;

    @FXML
    private TextField txt35;

    @FXML
    private TextField txt34;

    @FXML
    private TextField txt33;

    @FXML
    private TextField txt32;

    @FXML
    private TextField txt31;
    
    @FXML
    private Button btnHome;

    @FXML
    void Add(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtdataora != null : "fx:id=\"txtdataora\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btnadd != null : "fx:id=\"btnadd\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btnupdate != null : "fx:id=\"btnupdate\" was not injected: check your FXML file 'utenti.fxml'.";
        assert btndelete != null : "fx:id=\"btndelete\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt11 != null : "fx:id=\"txt11\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt12 != null : "fx:id=\"txt12\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt13 != null : "fx:id=\"txt13\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt14 != null : "fx:id=\"txt14\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt15 != null : "fx:id=\"txt15\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt16 != null : "fx:id=\"txt16\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt17 != null : "fx:id=\"txt17\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt18 != null : "fx:id=\"txt18\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt19 != null : "fx:id=\"txt19\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt110 != null : "fx:id=\"txt11i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt21 != null : "fx:id=\"txt21\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt22 != null : "fx:id=\"txt22\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt41 != null : "fx:id=\"txt41\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt23 != null : "fx:id=\"txt23\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt24 != null : "fx:id=\"txt24\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt25 != null : "fx:id=\"txt25\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt42 != null : "fx:id=\"txt42\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt43 != null : "fx:id=\"txt43\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt26 != null : "fx:id=\"txt26\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt210 != null : "fx:id=\"txt21i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt29 != null : "fx:id=\"txt29\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt28 != null : "fx:id=\"txt28\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt27 != null : "fx:id=\"txt27\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt410 != null : "fx:id=\"txt41i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt49 != null : "fx:id=\"txt49\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt48 != null : "fx:id=\"txt48\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt47 != null : "fx:id=\"txt47\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt46 != null : "fx:id=\"txt46\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt45 != null : "fx:id=\"txt45\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt44 != null : "fx:id=\"txt44\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt55 != null : "fx:id=\"txt55\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt54 != null : "fx:id=\"txt54\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt53 != null : "fx:id=\"txt53\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt52 != null : "fx:id=\"txt52\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt51 != null : "fx:id=\"txt51\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt59 != null : "fx:id=\"txt59\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt58 != null : "fx:id=\"txt58\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt57 != null : "fx:id=\"txt57\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt56 != null : "fx:id=\"txt56\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt62 != null : "fx:id=\"txt62\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt71 != null : "fx:id=\"txt71\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt61 != null : "fx:id=\"txt61\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt510 != null : "fx:id=\"txt51i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt65 != null : "fx:id=\"txt65\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt74 != null : "fx:id=\"txt74\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt64 != null : "fx:id=\"txt64\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt73 != null : "fx:id=\"txt73\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt63 != null : "fx:id=\"txt63\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt72 != null : "fx:id=\"txt72\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt67 != null : "fx:id=\"txt67\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt76 != null : "fx:id=\"txt76\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt66 != null : "fx:id=\"txt66\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt75 != null : "fx:id=\"txt75\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt69 != null : "fx:id=\"txt69\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt78 != null : "fx:id=\"txt78\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt68 != null : "fx:id=\"txt68\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt77 != null : "fx:id=\"txt77\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt710 != null : "fx:id=\"txt71i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt610 != null : "fx:id=\"txt61i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt79 != null : "fx:id=\"txt79\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check1 != null : "fx:id=\"check1\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check2 != null : "fx:id=\"check2\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check3 != null : "fx:id=\"check3\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check7 != null : "fx:id=\"check7\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check6 != null : "fx:id=\"check6\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check5 != null : "fx:id=\"check5\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check4 != null : "fx:id=\"check4\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check10 != null : "fx:id=\"check1i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check9 != null : "fx:id=\"check9\" was not injected: check your FXML file 'utenti.fxml'.";
        assert check8 != null : "fx:id=\"check8\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt310 != null : "fx:id=\"txt31i\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt39 != null : "fx:id=\"txt39\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt38 != null : "fx:id=\"txt38\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt37 != null : "fx:id=\"txt37\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt36 != null : "fx:id=\"txt36\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt35 != null : "fx:id=\"txt35\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt34 != null : "fx:id=\"txt34\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt33 != null : "fx:id=\"txt33\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt32 != null : "fx:id=\"txt32\" was not injected: check your FXML file 'utenti.fxml'.";
        assert txt31 != null : "fx:id=\"txt31\" was not injected: check your FXML file 'utenti.fxml'.";
        setta();
    }
  
    public static ArrayList<Utente> listautenti;
    public void setta() {
    	if(update) {
    		
    	}
    	listautenti=Utente.prendiutenti();
    	for(int i=0;i<=listautenti.size()-1;i++) {
    		switch(i){
    			case 0:	txt11.setText("1"); 
    					txt21.setText(listautenti.get(0).getRuolo());
    					txt31.setText(listautenti.get(0).getIDArea());
    					txt41.setText(listautenti.get(0).getNome());
    					txt51.setText(listautenti.get(0).getCognome());
    					txt61.setText(listautenti.get(0).getEmail());
    					txt71.setText(listautenti.get(0).getPassword());
    					break;
    			case 1:	txt12.setText("2"); 
						txt22.setText(listautenti.get(1).getRuolo());
						txt32.setText(listautenti.get(1).getIDArea());
						txt42.setText(listautenti.get(1).getNome());
						txt52.setText(listautenti.get(1).getCognome());
						txt62.setText(listautenti.get(1).getEmail());
						txt72.setText(listautenti.get(1).getPassword());
						break;
    			case 2:	txt13.setText("3"); 
						txt23.setText(listautenti.get(2).getRuolo());
						txt33.setText(listautenti.get(2).getIDArea());
						txt43.setText(listautenti.get(2).getNome());
						txt53.setText(listautenti.get(2).getCognome());
						txt63.setText(listautenti.get(2).getEmail());
						txt73.setText(listautenti.get(2).getPassword());
						break;
    			case 3:	txt14.setText("4"); 
						txt24.setText(listautenti.get(3).getRuolo());
						txt34.setText(listautenti.get(3).getIDArea());
						txt44.setText(listautenti.get(3).getNome());
						txt54.setText(listautenti.get(3).getCognome());
						txt64.setText(listautenti.get(3).getEmail());
						txt74.setText(listautenti.get(3).getPassword());
						break;
    			case 4:	txt15.setText("5"); 
    					txt25.setText(listautenti.get(4).getRuolo());
    					txt35.setText(listautenti.get(4).getIDArea());
    					txt45.setText(listautenti.get(4).getNome());
    					txt55.setText(listautenti.get(4).getCognome());
    					txt65.setText(listautenti.get(4).getEmail());
    					txt75.setText(listautenti.get(4).getPassword());
    					break;
    			case 5:	txt16.setText("6"); 
						txt26.setText(listautenti.get(5).getRuolo());
						txt36.setText(listautenti.get(5).getIDArea());
						txt46.setText(listautenti.get(5).getNome());
						txt56.setText(listautenti.get(5).getCognome());
						txt66.setText(listautenti.get(5).getEmail());
						txt76.setText(listautenti.get(5).getPassword());
						break;
    			case 6:	txt17.setText("7"); 
						txt27.setText(listautenti.get(6).getRuolo());
						txt37.setText(listautenti.get(6).getIDArea());
						txt47.setText(listautenti.get(6).getNome());
						txt57.setText(listautenti.get(6).getCognome());
						txt67.setText(listautenti.get(6).getEmail());
						txt77.setText(listautenti.get(6).getPassword());
						break;
    			case 7:	txt18.setText("8"); 
						txt28.setText(listautenti.get(7).getRuolo());
						txt38.setText(listautenti.get(7).getIDArea());
						txt48.setText(listautenti.get(7).getNome());
						txt58.setText(listautenti.get(7).getCognome());
						txt68.setText(listautenti.get(7).getEmail());
						txt78.setText(listautenti.get(7).getPassword());
						break;
    			case 8:	txt19.setText("9"); 
						txt29.setText(listautenti.get(8).getRuolo());
						txt39.setText(listautenti.get(8).getIDArea());
						txt49.setText(listautenti.get(8).getNome());
						txt59.setText(listautenti.get(8).getCognome());
						txt69.setText(listautenti.get(8).getEmail());
						txt79.setText(listautenti.get(8).getPassword());
						break;
    			case 9:	txt110.setText("1i"); 
						txt210.setText(listautenti.get(9).getRuolo());
						txt310.setText(listautenti.get(9).getIDArea());
						txt410.setText(listautenti.get(9).getNome());
						txt510.setText(listautenti.get(9).getCognome());
						txt610.setText(listautenti.get(9).getEmail());
						txt710.setText(listautenti.get(9).getPassword());
						break;
    		}
    	}
    }
    
    public void Home(ActionEvent event) throws IOException {
    	((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/Amministratore.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    public void Delete(ActionEvent event) throws IOException {
    	boolean selezionato;
    	ArrayList<Utente> eliminare=new ArrayList<>();
    	for(int i=1;i<=10;i++) {
    		switch(i){
    			case 1: selezionato=check1.isSelected();
    					if(selezionato) {
    						eliminare.add(listautenti.get(0));
    					}
    					break;
    			case 2: selezionato=check2.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(1));
						}
						break;
    			case 3: selezionato=check3.isSelected();
					if(selezionato) {
						eliminare.add(listautenti.get(2));
					}
					break;
    			case 4: selezionato=check4.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(3));
						}
						break;
    			case 5: selezionato=check5.isSelected();
					if(selezionato) {
						eliminare.add(listautenti.get(4));
					}
					break;
    			case 6: selezionato=check6.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(5));
						}
						break;
    			case 7: selezionato=check7.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(6));
						}
						break;
    			case 8: selezionato=check8.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(7));
						}
						break;
    			case 9: selezionato=check9.isSelected();
						if(selezionato) {
							eliminare.add(listautenti.get(8));
						}
						break;
    			case 10: selezionato=check10.isSelected();
						 if(selezionato) {
							 eliminare.add(listautenti.get(9));
						 }
						 break;	
    		}
    	}	
    	boolean delete= Utente.deletelista(eliminare);
    	if(delete) {
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Eliminazione");
			alert.setHeaderText("L'eliminazione è avvenuta con successo");
			alert.showAndWait();
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/utenti.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Eliminazione");
			alert.setHeaderText("Attenzione c'è un errore!!");
			alert.showAndWait();
    	}
    } 
    
    public void prendidati() {
    	Utente u;
    	String ruolo;
    	String area;
    	String nome;
    	String cognome;
    	String password;
    	for(Integer i: modificare.keySet()) {
    		switch(i){
    			case 0: u=modificare.get(0);
    					ruolo=txt21.getText();
    					u.setRuolo(ruolo);
    					area=txt31.getText();
    					u.setIDArea(area);
    					nome=txt41.getText();
    					u.setNome(nome);
    					cognome=txt51.getText();
    					u.setCognome(cognome);
    					password=txt71.getText();
    					u.setPassword(password);
    					modificare.put(0,u);
    					break;
    		}
    	}
    }
    public static boolean update;
    TreeMap<Integer,Utente> modificare=new TreeMap<>();
    public void Update(ActionEvent event) throws IOException {
    	if(update) {
    		prendidati();
    		boolean up=Utente.updatelista(modificare);
    		if(up) {
        		Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Aggiornamento");
    			alert.setHeaderText("L'aggiornamento è avvenuto con successo");
    			alert.showAndWait();
    			((Node)event.getSource()).getScene().getWindow().hide();
    			Stage primaryStage = new Stage();
    			Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/utenti.fxml"));
    			Scene scene = new Scene(root);
    			primaryStage.setScene(scene);
    			primaryStage.show();
    			update=false;
    			
        	}else {
        		Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Aggiornamento");
    			alert.setHeaderText("Attenzione c'è un errore!!");
    			alert.showAndWait();
    			update=false;
        	}
    	}
    	boolean selezionato;
    	for(int i=1;i<=10;i++) {
    		switch(i){
    			case 1: selezionato=check1.isSelected();
    					if(selezionato) {
    						modificare.put(0,listautenti.get(0));
    						txt21.setEditable(true);
    						txt31.setEditable(true);
    						txt41.setEditable(true);
    						txt51.setEditable(true);
    						txt71.setEditable(true);
    					}
    					break;
    			case 2: selezionato=check2.isSelected();
						if(selezionato) {
							modificare.put(1,listautenti.get(1));
							txt22.setEditable(true);
							txt32.setEditable(true);
							txt42.setEditable(true);
							txt52.setEditable(true);
							txt72.setEditable(true);
						}
						break;
    			case 3: selezionato=check3.isSelected();
					if(selezionato) {
						modificare.put(2,listautenti.get(2));
						txt23.setEditable(true);
						txt33.setEditable(true);
						txt43.setEditable(true);
						txt53.setEditable(true);
						txt73.setEditable(true);
					}
					break;
    			case 4: selezionato=check4.isSelected();
						if(selezionato) {
							modificare.put(3,listautenti.get(3));
							txt24.setEditable(true);
							txt34.setEditable(true);
							txt44.setEditable(true);
							txt54.setEditable(true);
							txt74.setEditable(true);
						}
						break;
    			case 5: selezionato=check5.isSelected();
					if(selezionato) {
						modificare.put(4,listautenti.get(4));
						txt25.setEditable(true);
						txt35.setEditable(true);
						txt45.setEditable(true);
						txt55.setEditable(true);
						txt75.setEditable(true);
					}
					break;
    			case 6: selezionato=check6.isSelected();
						if(selezionato) {
							modificare.put(5,listautenti.get(5));
							txt26.setEditable(true);
							txt36.setEditable(true);
							txt46.setEditable(true);
							txt56.setEditable(true);
							txt76.setEditable(true);
						}
						break;
    			case 7: selezionato=check7.isSelected();
						if(selezionato) {
							modificare.put(6,listautenti.get(6));
							txt27.setEditable(true);
							txt37.setEditable(true);
							txt47.setEditable(true);
							txt57.setEditable(true);
							txt77.setEditable(true);
						}
						break;
    			case 8: selezionato=check8.isSelected();
						if(selezionato) {
							modificare.put(7,listautenti.get(7));
							txt28.setEditable(true);
							txt38.setEditable(true);
							txt48.setEditable(true);
							txt58.setEditable(true);
							txt78.setEditable(true);
						}
						break;
    			case 9: selezionato=check9.isSelected();
						if(selezionato) {
							modificare.put(8,listautenti.get(8));
							txt29.setEditable(true);
							txt39.setEditable(true);
							txt49.setEditable(true);
							txt59.setEditable(true);
							txt79.setEditable(true);
						}
						break;
    			case 10: selezionato=check10.isSelected();
						 if(selezionato) {
							 modificare.put(9,listautenti.get(9));
							 txt210.setEditable(true);
							 txt310.setEditable(true);
							 txt410.setEditable(true);
							 txt510.setEditable(true);
							 txt610.setEditable(true);
							 txt710.setEditable(true);
						 }
						 break;		
    		}
    	}
    	update=true;
    	/*((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("/application/javafx/utenti.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();*/
    }

}
