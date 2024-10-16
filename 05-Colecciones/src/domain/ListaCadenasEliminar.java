package domain;

import java.util.ArrayList;
import java.util.List;

public class ListaCadenasEliminar {

    //metodo crea una lista de cadenas, agregar 5 elementos a la lista,
    // eliminar el tercer elemento de la lista e imprimir la lista resultante
    public void ejecutaEliminar() {
        List<String> lista = new ArrayList<>();

        //Agregar 5 elementos a la lista
        lista.add("Java");
        lista.add("Nodo EAFIT");
        lista.add("Hola");
        lista.add("Desarrolladora");
        lista.add("BackEnd");

        //Eliminar el tercer elemento de la lista
        lista.remove(2);

        //Imprimir los elementos de la lista
        System.out.println("Lista de cadenas, eliminando el tercer elemento: ");
        for (String cadena : lista) {
            System.out.println(cadena);
        }
    }
}
