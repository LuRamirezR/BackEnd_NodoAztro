import domain.ListaCadenasBuscar;
import domain.ListaCadenasEliminar;
import domain.ListaEnteros;
import domain.ListaOrdenaEnteros;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Crear instancias de las clases

        //Lista de enteros
        ListaEnteros listaEnteros = new ListaEnteros();
        listaEnteros.ejecutar();

        //Lista de cadenas para eliminar el tercer elemento
        ListaCadenasEliminar listaCadenasElimina = new ListaCadenasEliminar();
        listaCadenasElimina.ejecutaEliminar();

        //Lista de cadenas para buscar un elemento específico
        ListaCadenasBuscar listaBuscar = new ListaCadenasBuscar();
        listaBuscar.ejecutaBuscar();

        //Lista de enteros para ordenar de forma ascendente
        ListaOrdenaEnteros listaOrdenaAscendente = new ListaOrdenaEnteros();
        listaOrdenaAscendente.ejecutarOrdenar();
    }
}