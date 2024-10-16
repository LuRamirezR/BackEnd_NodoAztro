package domain;

import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {
    //metodo crear una lista de enteros, agregar 5 elementos a la lista,
    // imprimir todos los elementos de la lista
    public void ejecutar() {
        List<Integer> lista = new ArrayList<>();

        //Agregar 5 elementos a la lista
        lista.add(5);
        lista.add(78);
        lista.add(29);
        lista.add(47);
        lista.add(13);

        //Imprimir los elementos de la lista
        System.out.println("Lista de números enteros: ");
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}
