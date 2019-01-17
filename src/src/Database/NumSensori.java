package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class NumSensori {
	
	    public static void getSensori(int tipoid) {
	        // 
	    	String query = "SELECT * FROM edificioza01.utente";
	        String query1 = "{ call '"+query+"' }";
	        ResultSet rs;
	 
	        try (Connection conn = MySQLConn.getConnection();
	                CallableStatement stmt = conn.prepareCall(query1)) {
	 
	            stmt.setInt(1,tipoid);
	 
	            rs = stmt.executeQuery();
	            while (rs.next()) {	              
	                System.out.println(rs.getInt("TotSensori"));
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
	    }
	 
	    /* @param args */
	    public static void main(String[] args) {
	    	getSensori(1);
	    }
	}
	
