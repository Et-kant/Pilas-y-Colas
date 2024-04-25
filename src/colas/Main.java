package colas;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.extraer();
        cola.extraer();

        cola.imprimir();
    }
}
