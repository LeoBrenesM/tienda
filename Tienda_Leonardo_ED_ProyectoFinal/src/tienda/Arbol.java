package tienda;

import javax.swing.JOptionPane;

public class Arbol {

    private NodoArbol raiz;
    boolean boo=false;
    public void inserta(Cliente c) {//Método que permite ingresar clientes 
        if (raiz == null) {//Pregunta si la raiz es vacia
            raiz = new NodoArbol(c);//Si es vacia el medicamento que se ingresa es la raiz

        } else {//Sí no se cumple la afirmación anterior entonces pasa al metodo recursivo
            insertaRec(c, raiz);
        }

    }

    private void insertaRec(Cliente c, NodoArbol n) {//Método recursivo que inserta los clientes
        if (c.getIdentificacion() < n.getDatos().getIdentificacion()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoArbol(c));
            } else {
                insertaRec(c, n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoArbol(c));
            } else {
                insertaRec(c, n.getHijoDer());
            }
        }

    }

    public void preOrden() {
        if (raiz != null) {
            preOrdenRec(raiz);

        } else {
            System.out.println("Arbol vacio");
        }
    }

    private void preOrdenRec(NodoArbol n) {
        if (n != null) {
            System.out.print(" " + n.getDatos());
            preOrdenRec(n.getHijoIzq());

            preOrdenRec(n.getHijoDer());
        }
    }

    public void Buscar(int id) {//Método que recibe el id del cliente para poder buscarlo
        //Decisión que si la raiz no es vacía entonces va a ingresar al metodo recursivo
        if (raiz != null) {
            BuscarRec(raiz, id);//Ingresa el nodo de la raiz con el id que vamos a ingresar en el nodo recursivo
            if (!BuscarRec(raiz, id) && !boo) {
                JOptionPane.showMessageDialog(null,"El id ingresado no existe");
            }
            boo=false;
        } else {
            JOptionPane.showMessageDialog(null,"El registro de clientes se encuentra vacio");//Si no lo encuentra el arbol está vacío
        }
    }

    private boolean BuscarRec(NodoArbol n, int id) {//Metodo recursivo que ingresa el nodo con el id que se quiera buscar
        if (n != null) {//Si el nodo no es vacío
            if (n.getDatos().getIdentificacion() != id) {//Si no es el id
                BuscarRec(n.getHijoDer(), id);//Vuelve a ingresar al metodo recursivo pero con el hijon derecho
                BuscarRec(n.getHijoIzq(), id);//Vuelve a hacer el método del hijo izquierdo
               
            } else if(!boo){
                JOptionPane.showMessageDialog(null, n.getDatos());//Si no y lo encuentra muestra la informacion que se consiguió 
                boo=true;
                return true;
            }
        }
        return false;
    }

}
