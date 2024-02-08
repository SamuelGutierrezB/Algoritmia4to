package Diagnostico;
import java.util.Scanner;

public class ListaSimplementeLigada {

    static Scanner sc = new Scanner(System.in);
    Nodo inicio;

    public ListaSimplementeLigada() {
        this.inicio = null;
    }

    public void agregarElemento(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
    }


    public void eliminarElemento() {
        Nodo actual= inicio;
        Nodo siguiente = actual.siguiente;

        while (siguiente != null) {
        actual= siguiente;
        inicio = actual;
        siguiente = actual.siguiente;        

        }
        
    }

    public void mostrarLista() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimplementeLigada lista = new ListaSimplementeLigada();
        int age = sc.nextInt();
        lista.agregarElemento(age);
        System.out.println("Lista inicial:");
        lista.mostrarLista();

        age = sc.nextInt();
        lista.agregarElemento(age);
        System.out.println("Segunda lista:");
        lista.mostrarLista();

        lista.eliminarElemento();

        age = sc.nextInt();
        lista.agregarElemento(age);
        System.out.println("Tercer lista:");
        lista.mostrarLista();

    }
}
