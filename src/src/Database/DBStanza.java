package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Stanza;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBStanza {
	
	public ArrayList<Stanza> retrievepiani(String edificiodato) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Stanza s = null;
		ArrayList<Stanza> stanze = new ArrayList<>();
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT distinct s.piano FROM edificioza01.stanza s join edificioza01.edificio e on (e.ID=s.idedificio) where e.idedificio='"+edificiodato+"'");
			while(resultSet.next()) {
				String nomepiano=resultSet.getString("piano");
				s = new Stanza(nomepiano);
				stanze.add(s);
			}
			MySQLConn.close(connect,Statement,resultSet);
			return stanze;
		}
		catch(SQLException ex){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
		return null;
	}
}
