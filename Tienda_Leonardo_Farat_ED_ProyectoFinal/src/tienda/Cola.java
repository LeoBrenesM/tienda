package tienda;

public class Cola {

    class Nodo {

        int info;
        String descripcion;
        int precio;
        Nodo sig;
    }

    private Nodo RAIZ, FONDO;
    public static String cNombre = "";

    Cola() {
        RAIZ = null;
        FONDO = null;
    }

    boolean vacia() {
        if (RAIZ == null) {
            return true;
        } else {
            return false;
        }
    }

    void insertar(int info, String vNombre) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.descripcion = vNombre;
        nuevo.sig = null;
        if (vacia()) {
            RAIZ = nuevo;
            FONDO = nuevo;
        } else {
            FONDO.sig = nuevo;
            FONDO = nuevo;
        }
    }
    void insertarP(int info, int vPrecio) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.precio = vPrecio;
        nuevo.sig = null;
        if (vacia()) {
            RAIZ = nuevo;
            FONDO = nuevo;
        } else {
            FONDO.sig = nuevo;
            FONDO = nuevo;
        }
    }
    int extraer() {
        if (!vacia()) {
            int informacion = RAIZ.info;
            String NombreNodo = RAIZ.descripcion;
            cNombre = RAIZ.descripcion;
            if (RAIZ == FONDO) {
                RAIZ = null;
                FONDO = null;
            } else {
                RAIZ = RAIZ.sig;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    int extraerP() {
        if (!vacia()) {
            int precio = RAIZ.precio;
            String NombreNodo = RAIZ.descripcion;
            cNombre = RAIZ.descripcion;
            if (RAIZ == FONDO) {
                RAIZ = null;
                FONDO = null;
            } else {
                RAIZ = RAIZ.sig;
            }
            return precio;
        } else {
            return -1;
        }
    }
    
    String extraerS() {
        if (!vacia()) {
            String informacion = RAIZ.descripcion;
            cNombre = RAIZ.descripcion;
            if (RAIZ == FONDO) {
                RAIZ = null;
                FONDO = null;
            } else {
                RAIZ = RAIZ.sig;
            }
            return informacion;
        } else {
            return null;
        }
    }

    public void imprimir() {
        Nodo reco = RAIZ;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco != null) {
            System.out.print(reco.info + "-" + reco.descripcion + "/");
            reco = reco.sig;
        }
        System.out.println();
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = RAIZ;
        while (reco != null) {
            cant++;
            reco = reco.sig;
        }
        return cant;
    }

    boolean ExisteElemento(int vElemento) {
        Nodo reco = RAIZ;
        while (reco != null) {
            if (reco.info == vElemento) {
                return true;
            }
            reco = reco.sig;
        }
        return false;
    }

    public int retornar() {
        if (RAIZ != null) {
            int informacion = RAIZ.info;
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void Reemplazar(int abuscar, int valor) {
        Nodo reco = RAIZ;
        while (reco != null) {
            if (reco.info == abuscar) {
                reco.info = valor;
            }
            reco = reco.sig;
        }
    }

    public void Inicializar() {//se vacía todo
        Nodo reco = RAIZ;
        while (reco != null) {
            reco.info = 0;
            reco = reco.sig;
        }
    }

    public void Reemplazar(int abuscar, int valor, String NuevoNombre) { //sobrecarga metodos
        Nodo reco = RAIZ;
        while (reco != null) {
            if (reco.info == abuscar) {
                reco.info = valor;
                reco.descripcion = NuevoNombre;
            }
            reco = reco.sig;
        }
    }

}
