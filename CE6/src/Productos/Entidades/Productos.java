
package Productos.Entidades;

//import java.util.HashMap;

public class Productos {
    
    private Double precio;
    private String nomprod;
    //private HashMap<Integer, String> Productos;

    public Productos() {
    }

    public Productos(Double precio, String nomprod) {
        this.precio = precio;
        this.nomprod = nomprod;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

   
    
    

    
}
