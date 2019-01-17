package Database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class Connect
{
   public static void main (String[] args) throws FileNotFoundException, IOException
   {
       Connection conn = null;
       try (FileInputStream f = new FileInputStream("db.properties")) {
    	   
           // load the properties file
           Properties pros = new Properties();
           pros.load(f);

           // assign db parameters
           String url = pros.getProperty("url");
           String user = pros.getProperty("user");
           String password = pros.getProperty("password");
           
           Class.forName ("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection(url,user,password);
           System.out.println ("Database connection established");
       }
       catch (Exception e)
       {
           e.printStackTrace();

       }
       finally
       {
           if (conn != null)
           {
               try
               {
                   conn.close ();
                   System.out.println ("Database connection terminated");
                   //System.out.println(System.getProperty("user.dir"));
               }
               catch (Exception e) { /* ignore close errors */ }
           }
       }
   }
}