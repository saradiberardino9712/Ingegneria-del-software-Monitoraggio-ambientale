package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Città;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBCitta {
	
	@SuppressWarnings("finally")
	public boolean insert(ArrayList<Object> args) {
		Connection connect = null;
		PreparedStatement preparedStatement = null;
		boolean success=true;
		try{	
			connect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/monitoraggioambientale","root","ciao");
			preparedStatement = connect.prepareStatement("INSERT INTO monitoraggioambientale.citta(ID_città,n_zone) VALUES (?,?)");
			preparedStatement.setString(1,(String)args.get(0));
			preparedStatement.setInt(2,(int)args.get(1));
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			success=false;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}catch(Exception e){
			success=false;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Generico");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}finally{
				try{
						if(connect!=null) connect.close();
						if(preparedStatement!=null) preparedStatement.close();
						return success;
						}
					catch(final SQLException e){
						final Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Errore");
						alert.setHeaderText("Errore Database");
						alert.setContentText(e.getMessage());
						alert.showAndWait();
						return false;
						}
					}
		}	
	
	
	@SuppressWarnings("finally")
	public Object retrieve() {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Città città = null;
		try{
			connect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/monitoraggioambientale","root","ciao");
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM monitoraggioambientale.città");
			while(resultSet.next()) {
				String nomecittà=resultSet.getString("ID_città");
				int nzone = resultSet.getInt("n_zone");
				città = new Città(nomecittà,nzone);
				connect.close();
				Statement.close();
				resultSet.close();
				return città;
			}	
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
				return città;
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
