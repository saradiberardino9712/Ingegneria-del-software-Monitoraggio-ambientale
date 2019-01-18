package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Utente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBUtente {

	public Object retrieve(ArrayList<Object> args) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Utente utente=null;
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("Select u.*,r.ruolo from utente u join ruolo r on (u.idruolo=r.idruolo) ");
			while(resultSet.next()) {
				String nome = resultSet.getString("nome");
				String cognome = resultSet.getString("cognome");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				String ruolo= resultSet.getString("ruolo");
				String id_area= resultSet.getString("id_area");
				if (email.equals((String) args.get(0)) && password.equals((String) args.get(1))) {
					utente = Utente.setInstance(nome, cognome, password, email, ruolo, id_area);
					MySQLConn.close(connect,Statement,resultSet);
					return utente;
				} else 
					utente=null;
			}	
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	} 
	
	public ObservableList<Utente> retrieveutenti() {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Utente utente=null;
		ObservableList<Utente> listautenti= FXCollections.observableArrayList();
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("Select u.*,r.ruolo from utente u join ruolo r on (u.idruolo=r.idruolo) ");
			while(resultSet.next()) {
				String nome = resultSet.getString("nome");
				String cognome = resultSet.getString("cognome");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				String ruolo= resultSet.getString("ruolo");
				utente = new Utente(nome, cognome, password, email, ruolo);
				listautenti.add(utente);
			}	
			MySQLConn.close(connect,Statement,resultSet);
			return listautenti;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	} 
		
	public boolean updatelogin(ArrayList<Object> args){
		Connection connect = null;
		Statement Statement = null;
		boolean success=true; 
		Utente utente=(Utente)args.get(0);
		boolean valore=(boolean) args.get(1);
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement(); 
			if(valore)
				Statement.executeUpdate("UPDATE edificioza01.utente SET attivo=true WHERE email='" + utente.getEmail() + " ' AND password='" + utente.getPassword() + " ' ");
			else
				Statement.executeUpdate("UPDATE edificioza01.utente SET attivo=false WHERE email='" + utente.getEmail() + " ' AND password='" + utente.getPassword() + " ' ");
		}catch(SQLException ex){
			success=false;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
		return success;
	}
}
