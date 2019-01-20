package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Utente;
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
	
	public ArrayList<Utente> retrieveutenti() {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Utente utente=null;
		ArrayList<Utente> listautenti= new ArrayList<>();
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
				utente = new Utente(nome, cognome, password, email, ruolo,id_area);
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
			MySQLConn.close(connect,Statement,null);
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

	public boolean delete(ArrayList<Utente> eliminare) {
		Connection connect = null;
		Statement Statement = null;
		boolean success=true; 
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			String email;
			String password;
			for(Utente u:eliminare) {
				email=u.getEmail();
				password=u.getPassword();
				Statement.executeUpdate("DELETE FROM edificioza01.utente WHERE password='"+password+"' and email='"+email+"'");
			}
			MySQLConn.close(connect,Statement,null);
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

	public boolean update(ArrayList<Utente> modificare) {
		Connection connect = null;
		Statement Statement = null;
		boolean success=true; 
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			String email;
			String password;
			String ruolo;
			String area;
			String nome;
			String cognome;
			for(Utente u:modificare) {
				email=u.getEmail();
				password=u.getPassword();
				ruolo=u.getRuolo();
				area=u.getIDArea();
				nome=u.getNome();
				cognome=u.getCognome();
				Statement.executeUpdate("UPDATE edificioza01.utente SET password='"+password+"' and idruolo=(select idruolo from ruolo where ruolo='"+ruolo+"')"
						+ "and id_area='"+area+"'and nome='"+nome+"' and cognome='"+cognome+"'WHERE email='" + email + " ' ");
			}
			MySQLConn.close(connect,Statement,null);
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
