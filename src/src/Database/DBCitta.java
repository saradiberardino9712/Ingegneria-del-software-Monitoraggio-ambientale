package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Citt�;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBCitta {
	
	public Object retrieve(ArrayList<Object> args) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Citt� citt� = null;
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM edificioza01.city where Nomecitta='"+ args.get(0)+ "'");
			while(resultSet.next()) {
				String nomecitt�=resultSet.getString("Nomecitta");
				int nzone = resultSet.getInt("n_zone");
				citt� = new Citt�(nomecitt�,nzone);
				MySQLConn.close(connect,Statement,resultSet);
				return citt�;
			}	
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
