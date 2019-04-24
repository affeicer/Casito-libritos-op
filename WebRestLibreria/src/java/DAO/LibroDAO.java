
package DAO;

import DB.Conexion;
import MODELO.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    public List<Libro> getLibro() throws SQLException{
        
        List<Libro> libros = new ArrayList<>();
        Libro unlibro = null;
        sql = "SELECT * FROM Libros";
        con = Conexion.getConexion();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
            unlibro = new Libro();
            unlibro.setId(rs.getInt("id"));
            unlibro.setNombre(rs.getString("nombre"));
            unlibro.setPrecio(rs.getInt("precio"));
            unlibro.setStock(rs.getInt("stock"));
            
            libros.add(unlibro);
        }
        Conexion.CloseConexion();
        return libros;
    }
}