package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import Model.Dato;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBDato {
	
	public ObservableList<Dato> retrieve() {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		ObservableList<Dato> listadati = FXCollections.observableArrayList();
		try{
			connect=MySQLConn.getConnection();
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SET @dataora='2019-01-14 00:01:00';\r\n" + 
					"SELECT @dataora as DataOraFault, A.idsensore, idstanza, tiposensore from edificioza01.sensore A\r\n" + 
					"left join (select * from dato where dataora=@dataora ) B\r\n" + 
					"    on B.idsensore=A.idsensore\r\n" + 
					"where B.idsensore is null;");
			while(resultSet.next()) {
				String stato=resultSet.getString("stato");
				Timestamp data_ora = resultSet.getTimestamp("DataOraFault");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String tipo=resultSet.getString("tiposensore");
				String ids=resultSet.getString("idsensore");
				//int valore=resultSet.getInt("valore");
				String stanza=resultSet.getString("idstanza");
				//String edificio=resultSet.getString("ID_edificio");
				//tring zona=resultSet.getString("ID_zona");
				Dato s = new Dato(stato, dataora, tipo, ids, 0, stanza, null, null);
				listadati.add(s);
			}	
			MySQLConn.close(connect,null,resultSet);
			return listadati;
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
