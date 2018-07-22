package tienda;

public class producto {
    String nombre;
    int codigo;
    String descripcion;
    int precio;

    public producto(String nombre, int precio, int codigo,String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio=precio;
    }

    
    @Override
    public String toString() {
        return ".Producto: " +nombre + "| #" + codigo + "| caracteristicas: " +descripcion+ "_PRECIO: " + precio;
    }
    public String toString2(){
        return nombre + " : " + precio + "$";
    }
}
