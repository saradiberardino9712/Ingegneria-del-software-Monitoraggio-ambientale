package Database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Model.Dato;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;

public class DBDato {
	
	public ArrayList<Dato> retrieve(String edificio) {
		Connection connect = null;
		ResultSet resultSet = null;
		Dato d=null;
		String query="{call SensoreNonInvia('2019-01-14 00:01:00')}";
		ArrayList<Dato> lista =new ArrayList<>();
		try{
			connect=MySQLConn.getConnection();
			CallableStatement stmt = connect.prepareCall(query);
			resultSet = stmt.executeQuery();	
			while(resultSet.next()) {
				java.sql.Timestamp data_ora=resultSet.getTimestamp("DataOraFault");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String idsensore= resultSet.getString("idsensore");
				String idstanza= resultSet.getString("idstanza");
				String tiposensore= resultSet.getString("tiposensore");
				d= new Dato(Color.RED,dataora,tiposensore, idsensore,0, idstanza, null, null);
				lista.add(d);
			}
			MySQLConn.close(connect,null,resultSet);
			return lista;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	}

	public ObservableList<Dato> retrievedatiSP(String edificio,int p) {
		Connection connect = null;
		ResultSet resultSet = null;
		String query="select * from " + edificio + ".datiedificiosp";
		ObservableList<Dato> dato= FXCollections.observableArrayList();
		try{
			connect=MySQLConn.getConnection();
			Statement stmt = connect.createStatement();
			resultSet = stmt.executeQuery(query);	
			while(resultSet.next()) {
				java.sql.Timestamp data_ora=resultSet.getTimestamp("dataora");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String idsensore= resultSet.getString("idsensore");
				int valore= resultSet.getInt("valore");
				String idstanza= resultSet.getString("idstanza");
				String tiposensore= resultSet.getString("tiposensore");
				String idedificio= resultSet.getString("idedificio");
				String idzona= resultSet.getString("idzona");
				int piano= resultSet.getInt("piano");
				if(piano==p) {
					Dato d= new Dato(Color.GREEN,dataora,tiposensore, idsensore,valore, idstanza, idedificio, idzona);
					dato.add(d);
				}
			}
			MySQLConn.close(connect,null,resultSet);
			return dato;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	}

	public ObservableList<Dato> retrievedatiSU(String edificio, int p) {
		Connection connect = null;
		ResultSet resultSet = null;
		String query="select * from " + edificio + ".datiedificiosu";
		ObservableList<Dato> dato= FXCollections.observableArrayList();
		try{
			connect=MySQLConn.getConnection();
			Statement stmt = connect.createStatement();
			resultSet = stmt.executeQuery(query);	
			while(resultSet.next()) {
				java.sql.Timestamp data_ora=resultSet.getTimestamp("dataora");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String idsensore= resultSet.getString("idsensore");
				int valore= resultSet.getInt("valore");
				String idstanza= resultSet.getString("idstanza");
				String tiposensore= resultSet.getString("tiposensore");
				String idedificio= resultSet.getString("idedificio");
				String idzona= resultSet.getString("idzona");
				int piano= resultSet.getInt("piano");
				if(piano==p) {
					Dato d= new Dato(Color.GREEN,dataora,tiposensore, idsensore,valore, idstanza, idedificio, idzona);
					dato.add(d);
				}
			}
			MySQLConn.close(connect,null,resultSet);
			return dato;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	}

	public ObservableList<Dato> retrievedatiST(String edificio,int p) {
		Connection connect = null;
		ResultSet resultSet = null;
		String query="select * from " + edificio + ".datiedificiost";
		ObservableList<Dato> dato= FXCollections.observableArrayList();
		try{
			connect=MySQLConn.getConnection();
			Statement stmt = connect.createStatement();
			resultSet = stmt.executeQuery(query);	
			while(resultSet.next()) {
				java.sql.Timestamp data_ora=resultSet.getTimestamp("dataora");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String idsensore= resultSet.getString("idsensore");
				int valore= resultSet.getInt("valore");
				String idstanza= resultSet.getString("idstanza");
				String tiposensore= resultSet.getString("tiposensore");
				String idedificio= resultSet.getString("idedificio");
				String idzona= resultSet.getString("idzona");
				int piano= resultSet.getInt("piano");
				if(piano==p) {
					Dato d= new Dato(Color.GREEN,dataora,tiposensore, idsensore,valore, idstanza, idedificio, idzona);
					dato.add(d);
				}
			}
			MySQLConn.close(connect,null,resultSet);
			return dato;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	}

	public ArrayList<String> retrieveallarmi(String edificio) {
		Connection connect = null;
		ResultSet resultSet = null;
		String query="{call SensoriAllarme()}";
		ArrayList<String> lista =new ArrayList<>();
		try{
			connect=MySQLConn.getConnection();
			CallableStatement stmt = connect.prepareCall(query);
			resultSet = stmt.executeQuery();	
			while(resultSet.next()) {
				String idsensore= resultSet.getString("idsensore");
				lista.add(idsensore);
			}
			MySQLConn.close(connect,null,resultSet);
			return lista;
		}catch (SQLException ex) {
        	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
        }
        return null;
	}
}
