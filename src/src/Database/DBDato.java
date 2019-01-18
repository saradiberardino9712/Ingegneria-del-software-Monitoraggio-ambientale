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
			resultSet = Statement.executeQuery("select stato,dataora,tiposensore,idsensore,valore,ID_stanza,ID_edificio,ID_zona \r\n" + 
					"from dato d join sensore s on (d.idsensore=s.ID) join stanza st on (s.idstanza=st.ID) join edificio e on (st.idedificio=e.ID) join zona z on ( e.idzona=z.ID) \r\n" + 
					"where st.idpiano=1\r\n" + 
					"order by dataora desc;");
			while(resultSet.next()) {
				String stato=resultSet.getString("stato");
				Timestamp data_ora = resultSet.getTimestamp("dataora");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
				String dataora  = dateFormat.format(data_ora);
				String tipo=resultSet.getString("tiposensore");
				String ids=resultSet.getString("idsensore");
				int valore=resultSet.getInt("valore");
				String stanza=resultSet.getString("ID_stanza");
				String edificio=resultSet.getString("ID_edificio");
				String zona=resultSet.getString("ID_zona");
				Dato s = new Dato(stato, dataora, tipo, ids, valore, stanza, edificio, zona);
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
