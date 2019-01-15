package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Utente;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBUtente {
	@SuppressWarnings("finally")
	public Object retrieve(ArrayList<Object> args) {
		Connection connect = null;
		Statement Statement = null;
		ResultSet resultSet = null;
		Utente utente = null;
		try {
			connect = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:22;databaseName=edificioZA01;user=HandySparke;password=HandySpark3$");
			Statement = connect.createStatement();
			resultSet = Statement.executeQuery("SELECT * FROM edificioZA01.utente");
			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				String cognome = resultSet.getString("cognome");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				String area= resultSet.getString("area");
				String id_area= resultSet.getString("id_area");
				if (email.equals((String) args.get(0)) && password.equals((String) args.get(1))) {
					utente = Utente.setInstance(nome, cognome, password, email, area, id_area);
					connect.close();
					Statement.close();
					resultSet.close();
					return utente;
				} else 
					utente=null;
			}	
		} catch (SQLException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Database");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Errore");
			alert.setHeaderText("Errore Generico");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		} finally {
			try {
				if (connect != null)
					connect.close();
				if (Statement != null)
					Statement.close();
				if (resultSet != null)
					resultSet.close();
				return utente;
			} catch (final SQLException e) {
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
