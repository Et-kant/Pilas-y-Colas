package Pilas;

public class Pila {

    private Nodo raiz;

    class Nodo{
        int info;
        Nodo siguiente;
    }

    public Pila() {
        this.raiz = null;
    }

    public void insertar(int elemento){
        Nodo nuevo = new Nodo();
        nuevo.info = elemento;
        if (raiz == null){
            nuevo.siguiente = null;
            raiz = nuevo;
        }else{
            nuevo.siguiente = raiz;
            raiz = nuevo;
        }

    }

    public int extraer(){
        if(raiz!=null){
            int informacion = raiz.info;
            raiz = raiz.siguiente;
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir(){
        Nodo i = raiz;
        System.out.println("|-- Listado de elementos ");
        while (i!=null){
            System.out.println(i.info);
            i = i.siguiente;
        }
    }

    public boolean vacia(){
        if (raiz == null){
            return true;
        }else{
            return false;
        }
    }

    public int cantidad(){
        int cant = 0;
        Nodo i = raiz;
        while(i!=null){
            i = i.siguiente;
            cant++;
        }
        System.out.println("la cantidad de Nodos de la pila es; ");
        return cant;
    }
}
