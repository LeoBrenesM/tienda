
package tienda;

public class Cliente {
    private int identificacion;
    private String nombre;
    private int numero;
    private String genero;

    public Cliente(int identificacion, String nombre, int numero, String genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.numero = numero;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Resultados de la búsqueda: \n" + "Identificacion: " + identificacion + "\nNombre del cliente: " + nombre + "\nNúmero de télefono: " + numero + "\nGénero:" + genero;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

   
    
    
    
    
    
    
    
}
