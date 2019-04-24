/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAO.LibroDAO;
import MODELO.Libro;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Niko-PC
 */
@Path("Libro")
public class LibroResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LibroResource
     */
    public LibroResource() {
    }

    /**
     * Retrieves representation of an instance of WebServices.LibroResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Terrible de WebService";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/libros")
    public String getLibros() throws SQLException{
        Gson g = new Gson();
        LibroDAO dao = new LibroDAO();
        List<Libro> libros = dao.getLibro();
        return g.toJson(libros);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
