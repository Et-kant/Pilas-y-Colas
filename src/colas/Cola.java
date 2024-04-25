package colas;

public class Cola {

    public class Nodo{
        int info;
        Nodo sig;
    }
    private Nodo cabeza, fondo;

    public Cola() {
        this.cabeza = null;
        this.fondo = null;
    }

    public boolean vacia(){
        if (cabeza==null){
            return true;
        }else{
            return false;
        }
    }

    void insertar(int info){
        Nodo nuevo = new Nodo();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia()){
            cabeza = nuevo;
            fondo = nuevo;
        }else{
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    int extraer(){
        if (!vacia()){
            int informacion = cabeza.info;
            if (cabeza == fondo){
                cabeza = null;
                fondo  = null;
            }else{
                cabeza = cabeza.sig;
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir(){
        Nodo i=cabeza;
        System.out.println("|- Listado de todos los elementos");
        while(i!= null){
            System.out.print(" - "+i.info);
            i = i.sig;
        }
    }


}
