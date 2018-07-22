package tienda;

public class Productos {

    String nombre;
    int precio;
    int codigo;

    public void Productos(String nombre, int precio, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    /*@Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + '}';
    }*/
    @Override
    public String toString(){
        return "Producto: " + nombre + "\n  Precio: " + precio + ", CODIOG";
    }
}
