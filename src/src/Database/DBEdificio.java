package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Edificio;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBEdificio {
	
	public ArrayList<Edificio> retrieveedifici(String zonadata,String db) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Edificio e = null;
		ArrayList<Edificio> edifici = new ArrayList<>();
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT e.idedificio,e.n_piani FROM "+db+".zona z join "+db+".edificio e on (z.ID=e.idzona) where z.idzona='"+zonadata+"'");
			while(resultSet.next()) {
				String nomeedificio=resultSet.getString("idedificio");
				int npiani = resultSet.getInt("n_piani");
				e = new Edificio(nomeedificio,npiani);
				edifici.add(e);
			}
			MySQLConn.close(connect,Statement,resultSet);
			return edifici;
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
	
	public Edificio retrieve(String edificiodato,String db) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Edificio edificio = null;
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM "+db+".edificio where idedificio='"+edificiodato+ "'");
			while(resultSet.next()) {
				String nomeedificio=resultSet.getString("idedificio");
				int npiani = resultSet.getInt("n_piani");
				edificio = new Edificio(nomeedificio,npiani);
			}
			MySQLConn.close(connect,Statement,resultSet);
			return edificio;
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
