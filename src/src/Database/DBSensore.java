package Database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Sensore;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBSensore {
	
	public Sensore retrieve(String tipo,int tipoid) {
		Connection connect = null;
		ResultSet resultSet = null;
		Sensore conteggiosens= null;
		String query="{call contaSensoriAll('"+tipoid+"')}";
		try{
			connect=MySQLConn.getConnection();
			CallableStatement stmt = connect.prepareCall(query);
			resultSet = stmt.executeQuery();	
			while(resultSet.next()) {
				int conteggio=resultSet.getInt("TotSensori");
				conteggiosens=new Sensore(tipo,conteggio);
			}
			MySQLConn.close(connect,null,resultSet);
			return conteggiosens;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return conteggiosens;
	}
	
	public Sensore retrieveZN(String tipo,int tipoid) {
		Connection connect = null;
		ResultSet resultSet = null;
		Sensore conteggiosens= null;
		String query="{call contaSensoriZN('"+tipoid+"')}";
		try{
			connect=MySQLConn.getConnection();
			CallableStatement stmt = connect.prepareCall(query);
			resultSet = stmt.executeQuery();	
			while(resultSet.next()) {
				int conteggio=resultSet.getInt("TotSensori");
				conteggiosens=new Sensore(tipo,conteggio);
			}
			MySQLConn.close(connect,null,resultSet);
			return conteggiosens;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return conteggiosens;
	}
	
	public Sensore retrieveED(String tipo,int tipoid) {
		Connection connect = null;
		ResultSet resultSet = null;
		Sensore conteggiosens= null;
		String query="{call contaSensoriED('"+tipoid+"')}";
		try{
			connect=MySQLConn.getConnection();
			CallableStatement stmt = connect.prepareCall(query);
			resultSet = stmt.executeQuery();	
			while(resultSet.next()) {
				int conteggio=resultSet.getInt("TotSensori");
				conteggiosens=new Sensore(tipo,conteggio);
			}
			MySQLConn.close(connect,null,resultSet);
			return conteggiosens;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return conteggiosens;
	}
}
