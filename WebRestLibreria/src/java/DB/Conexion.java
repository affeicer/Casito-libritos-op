
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
        String url = "jdbc:sqlserver://localhost:1433;databaseName=CASOLIBROS";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            System.out.println("Class Not Found Exception: "+ e.toString());
        }
        
        try{
            con = DriverManager.getConnection(url,"sa","q1w2e3r4.3102");
        }catch(SQLException ex){
            System.out.println("SQL Exception: "+ex.toString());
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
