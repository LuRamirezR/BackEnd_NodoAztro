package domain;

import java.util.ArrayList;
import java.util.List;

public class ListaCadenasBuscar {

    //metodo crea una lista de cadenas, agregar 5 elementos a la lista,
    // buscar un elemento específico en la lista y mostrar su índice
    public void ejecutaBuscar() {
        List<String> lista = new ArrayList<>();

        //Agregar 5 elementos a la lista
        lista.add("Medellin");
        lista.add("Cali");
        lista.add("Bogota");
        lista.add("Barranquilla");
        lista.add("Manizales");

        //Buscar un elemento específico en la lista
        String buscar = "Manizales";
        int indiceLista = lista.indexOf(buscar);

        //Imprimir el índice del elemento buscado
        System.out.printf("El elemento %s se encuentra en la posición %d de la lista\n", buscar, indiceLista);
    }
}
