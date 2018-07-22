package tienda;

public class NodoArbol {

    private Cliente datos;
    private NodoArbol HijoIzq;
    private NodoArbol HijoDer;

    public NodoArbol(Cliente datos) {
        this.datos = datos;
    }

    public Cliente getDatos() {
        return datos;
    }

    public void setDatos(Cliente datos) {
        this.datos = datos;
    }

    public NodoArbol getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(NodoArbol HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public NodoArbol getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(NodoArbol HijoDer) {
        this.HijoDer = HijoDer;
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "datos=" + datos + '}';
    }
}
