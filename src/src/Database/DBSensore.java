package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Sensore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBSensore {
	
	@SuppressWarnings({ "finally" })
	public ObservableList<Sensore> retrieve() {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		ObservableList<Sensore> listasensori = FXCollections.observableArrayList();
		try{
			connect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/monitoraggioambientale","root","ciao");
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("select tiposensore,count(tiposensore) as conteggio from sensore s join stanza s1 on (s.idstanza=s1.ID) where s1.idedificio=1 group by tiposensore order by tiposensore");
			while(resultSet.next()) {
				String tiposensore=resultSet.getString("tiposensore");
				int conteggio = resultSet.getInt("conteggio");
				Sensore s = new Sensore(tiposensore,conteggio);
				listasensori.add(s);
			}	
			connect.close();
			Statement.close();
			resultSet.close();
			return listasensori;
		}
		catch(SQLException e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		catch(Exception e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Generico");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		finally{
			try{
				if(connect!=null) connect.close();
				if(Statement!=null) Statement.close();
				if(resultSet!=null) resultSet.close();
				return listasensori;
			}
			catch(final SQLException e){		
				final Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Errore");
				alert.setHeaderText("Errore Database");
				alert.setContentText(e.getMessage());
				alert.showAndWait();
				return null;
			}					
		}
	}

}
