package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Zona;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBZona {
	
	public ArrayList<Zona> retrievezone(ArrayList<Object> args) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Zona z=null;
		ArrayList<Zona> zona = new ArrayList<>();
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM edificioza01.zona z join edificioza01.city c on (z.idcittà=c.ID) where c.Nomecitta='"+args.get(0)+"'");
			while(resultSet.next()) {
				String nomezona=resultSet.getString("idzona");
				int nedifici = resultSet.getInt("n_edifici");
				z = new Zona(nomezona,nedifici);
				zona.add(z);
			}
			MySQLConn.close(connect,Statement,resultSet);
			return zona;	
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
	
	public Zona retrieve(ArrayList<Object> args) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Zona zona=null;
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM edificioza01.zona where idzona='"+ args.get(0)+ "'");
			while(resultSet.next()) {
				String nomezona=resultSet.getString("idzona");
				int nedifici = resultSet.getInt("n_edifici");
				zona = new Zona(nomezona,nedifici);
			}
			MySQLConn.close(connect,Statement,resultSet);
			return zona;	
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
