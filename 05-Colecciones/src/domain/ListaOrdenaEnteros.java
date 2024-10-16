package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenaEnteros {
    //metodo crear una lista de enteros, agregar 5 elementos desordenados a la lista,
    // ordenar la lista ascendente, imprimir la lista ordenada
    public void ejecutarOrdenar() {
        List<Integer> lista = new ArrayList<>();

        //Agregar 5 elementos a la lista de enteros
        lista.add(16);
        lista.add(159);
        lista.add(21);
        lista.add(37);
        lista.add(8);

        //Ordenar la lista de enteros de forma ascendente
        Collections.sort(lista);

        //Imprimir los elementos de la lista ordenada
        System.out.println("Lista de números enteros ordenados de forma ascendente: " + lista);
    }
}
