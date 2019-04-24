
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    //Instancia
    private static Connection con = null;
    
    public static Connection getConexion(){
      try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://DESKTOP-0A3F1TV\\SQLEXPRESS:1433"+
            "databaseName=CASOLIBROS;user=sa;password=q1w2e3r4.3102;";
        con = DriverManager.getConnection(connectionUrl);
      } catch (SQLException e){
          System.out.println("SQL Exception: "+e.toString());
      } catch (ClassNotFoundException cE){
          System.out.println("Class Not Found Exception: "+ cE.toString());
      }
      return con;
    }
    
    public static void CloseConexion(){
        try{
            con.close();
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
