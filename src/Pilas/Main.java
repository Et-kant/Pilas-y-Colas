package Pilas;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.extraer();
        pila.extraer();
        pila.insertar(4);
        pila.imprimir();
    }
}
