
package tienda;

public class Pila {

    class Nodo {

        String info;
        Nodo sig;
    }

    private Nodo RAIZ;

    Pila() {
        RAIZ = null;
    }

    boolean vacia() {
        if (RAIZ == null) {
            return true;
        } else {
            return false;
        }
    }

    void insertar(String x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (vacia()) {
            nuevo.sig = null;
            RAIZ = nuevo;
        } else {
            nuevo.sig = RAIZ;
            RAIZ = nuevo;
        }
    }

    String extraer() {
        if (!vacia()) {
            String informacion = RAIZ.info;
            RAIZ = RAIZ.sig;
            return informacion;
        } else {
            return "-1";
        }
    }

    public void imprimir() {
        Nodo reco = RAIZ;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco != null) {
            System.out.print(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public boolean ExisteElemento(String x) {
        Nodo reco = RAIZ;
        while (reco != null) {
            if (x.equals( reco.info)) {
                return true;
            }
            reco = reco.sig;
        }
        return false;
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

    public String retornar() {
        if (RAIZ != null) {
            String informacion = RAIZ.info;
            return informacion;
        } else {
            return "-1";
        }
    }
                    //Esto esta comentado por razones obvias.
//    public void Reemplazar(String abuscar, String valor) {
//        Nodo reco = RAIZ;
//        while (reco != null) {
//            if (reco.info.equals(abuscar)) {
//                reco.info = valor;
//            }
//            reco = reco.sig;
//        }
//    }
//
//    public void Inicializar() {
//        Nodo reco = RAIZ;
//        while (reco != null) {
//            reco.info = "X";
//            reco = reco.sig;
//        }
//
//    }

//    public static void main(String[] args) {
//
//        Pila pila1 = new Pila();
//
//        pila1.insertar(10);
//        pila1.insertar(40);
//        pila1.insertar(3);
//
//        pila1.imprimir();
//
//        int elemento = 5;
//        boolean existe = pila1.ExisteElemento(elemento);
//        System.out.println("---");
//        if (existe) {
//            System.out.println("SI EXISTE EL ELEMENTO : " + elemento);
//            System.out.println("---");
//        } else {
//            System.out.println("NO EXISTE EL ELEMENTO : " + elemento);
//            System.out.println("---");
//        }
//
//        System.out.println("Extraemos de la pila:" + pila1.extraer());
//        pila1.imprimir();
//        System.out.println("Retornamos primero de la pila:" + pila1.retornar());
//        pila1.imprimir();
//
//        int CantNodos = pila1.cantidad();
//
//        int[] arreglo = new int[CantNodos];
//
//        
//        for (int i = 0; i < CantNodos; i++) {
//            arreglo[i] = pila1.extraer();
//        }
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("Arreglo[" + i + "] = " + arreglo[i]);
//        }
//        
//        
//        Scanner sc = new Scanner(System.in);
//        int[] array = new int[5];
//        
//        System.out.println("Digite 6 numeros ");
//        
//        for (int i = 0; i <= 4; i++) {
//            System.out.print("Array[" + i + "] : ");
//            array[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < array.length; i++) {
//            pila1.insertar(array[i]);
//        }
//        
//        pila1.imprimir();
//
//    }

}

