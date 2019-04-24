
package MODELO;

public class Libro {

    public Libro(){
        
    }
    
    public Libro(int id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    private int id;
    private String nombre;
    private int precio;
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
   
}
