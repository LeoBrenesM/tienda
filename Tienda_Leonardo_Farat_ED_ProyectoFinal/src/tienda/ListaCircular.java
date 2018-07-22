package tienda;

import javax.swing.Icon;

public class ListaCircular {
    class Nodo {

        int info;
        Icon foto;
        Nodo ant, sig;
    }

    private Nodo raiz;

    public ListaCircular() {
        raiz = null;
    }

    public void insertarPrimero(int x,Icon foto) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.foto = foto;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            Nodo ultimo = raiz.ant; //1
            nuevo.sig = raiz; //2
            nuevo.ant = ultimo; //3
            raiz.ant = nuevo; //4
            ultimo.sig = nuevo; //5
            raiz = nuevo;
        }
    }

    public void insertarUltimo(int x, Icon foto) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.foto = foto;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            Nodo ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
        }
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (!vacia()) {
            Nodo reco = raiz;
            do {
                System.out.print(reco.info + "-");
                reco = reco.sig;
            } while (reco != raiz);
            System.out.println();
        }
    }
    public void imprimirReverso(){
        Nodo reco = raiz.ant;
        while(reco != raiz){
            System.out.print(reco.info + "-");
            reco = reco.ant;
        }
        System.out.print(reco.info + "-");
        System.out.println();
    }
    public void imprimirReversoPos(){
        Nodo ultimo = raiz.ant;
        Nodo reco = raiz;
        while(reco != ultimo){
            System.out.print(reco.info+"-");
            reco =reco.sig;
        }
        System.out.print(reco.info+"-\n");
    }
    public int cantidad() {
        int cant = 0;
        if (!vacia()) {
            Nodo reco = raiz;
            do {
                cant++;
                reco = reco.sig;
            } while (reco != raiz);
        }
        return cant;
    }
    public boolean ordenada(){
        if (cantidad() > 1) {
            Nodo reco1=raiz;
            Nodo  reco2=raiz.sig;
            do{
                if (reco2.info<reco1.info) {
                    return false;
                }
                reco2= reco2.sig;
                reco1 = reco1.sig;
            } while (reco2 != raiz);
        }
        return true;
    }
    public void borrar(int pos) {
        if (pos <= cantidad()) {
            if (pos == 1) {
                if (cantidad() == 1) {
                    raiz = null;
                } else {
                    Nodo ultimo = raiz.ant;
                    raiz = raiz.sig;
                    ultimo.sig = raiz;
                    raiz.ant = ultimo;
                }
            } else {
                Nodo reco = raiz;
                for (int f = 1; f <= pos - 1; f++) {
                    reco = reco.sig;
                }
                Nodo anterior = reco.ant;
                reco = reco.sig;
                anterior.sig = reco;
                reco.ant = anterior;
            }
        }
    }

    public int mayor() {
        if (!vacia()) {
            int may = raiz.info;
            Nodo reco = raiz.sig;
            do {
                if (reco.info > may) {
                    may = reco.info;
                }
            } while (reco != raiz);
            return may;
        }
        return Integer.MAX_VALUE;
    }

    public void intercambiar(int pos1, int pos2) {
        if (pos1 <= cantidad() && pos2 <= cantidad()) {
            Nodo reco1 = raiz;
            for (int f = 1; f < pos1; f++) {
                reco1 = reco1.sig;
            }
            Nodo reco2 = raiz;
            for (int f = 1; f < pos2; f++) {
                reco2 = reco2.sig;
            }
            int aux = reco1.info;
            reco1.info = reco2.info;
            reco2.info = aux;
        }
    }

    public int GetPos(int x) {
        int pos = 0;
        Nodo reco = raiz;
        while (reco != null) {
            pos++;
            if (reco.info == x) {
                return pos;
            }
            reco = reco.sig;
        }
        return pos;
    }

    public void intercambiarValores(int valor1, int valor2) {
        int pos1 = GetPos(valor1);
        int pos2 = GetPos(valor2);
        if (pos1 <= cantidad() && pos2 <= cantidad()) {
            Nodo reco1 = raiz;
            for (int f = 1; f < pos1; f++) {
                reco1 = reco1.sig;
            }
            Nodo reco2 = raiz;
            for (int f = 1; f < pos2; f++) {
                reco2 = reco2.sig;
            }
            int aux = reco1.info;
            reco1.info = reco2.info;
            reco2.info = aux;
        }
    }
    public int ObtenerPosicion(int Pos, String Comando){
        int retorno=-1;
        if (Pos <= cantidad()) {
            Nodo reco = raiz;
            for (int i = 1; i < Pos; i++) {
                reco= reco.sig;
            }
            if (Comando == "A") {
                return reco.ant.info;
            }
            if (Comando.equals("P")) {
                return reco.sig.info;
            }
        }
        return retorno;
    }
    public Icon DevuelveFoto(int pos){
        Icon foto = null;
        if (pos<=cantidad()) {
            Nodo reco=raiz;
            for (int i = 1; i < pos; i++) {
                reco=reco.sig;
            }
            foto=reco.foto;
        }
        return foto;
    }
    public Icon Siguiente(int posAc){
        Icon nombre = null;
        
        if (posAc<=cantidad()) {
            Nodo reco=raiz;
            for (int i = 0; i < posAc; i++) {
                reco=reco.sig;
            }
            reco=reco.sig;
            nombre=reco.foto;
        }
        return nombre;
    }
}
