package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public void readNumberFromFile(String filePath){

        //FileReader abre el archivo
        //BufferedReader lee el archivo línea por línea
        try (BufferedReader readerFile = new BufferedReader(new FileReader(filePath))){
            String line = readerFile.readLine();
            int number = Integer.parseInt(line);    // Convierte la cadena a número
            System.out.println("El número del archivo es: " + number);
        } catch (FileNotFoundException e){ // cuando el archivo no existe
            System.out.println("Error: El archivo " + filePath + " no existe.");
        } catch (IOException e){ // cuando hay un error al leer el archivo
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
