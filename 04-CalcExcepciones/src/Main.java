import domain.*;
import model.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Calculadora
        Scanner scannerConsole = new Scanner(System.in); // creo objeto para leer entrada en consola
        int option = -1;
        while (option != 0) {
            try {
                System.out.println("\nHas ingresado a la calculadora\nSelecciona una de las siguientes opciones:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Potencia");
                System.out.println("6. Salir de calculadora");
                option = scannerConsole.nextInt();  // Lee la opción del usuario (numero entero)

                Calculator calc = null;

                switch (option){
                    case 1:
                        calc = new SumCalc();
                        break;
                    case 2:
                        calc = new RestCalc();
                        break;
                    case 3:
                        calc = new MultiplicationCalc();
                        break;
                    case 4:
                        calc = new DivisionCalc();
                        break;
                    case 5:
                        // 3. Se debe agregar una clase adicional a las operaciones llamada “potencia” en donde
                        //al darle dos numeros me devuelva la potencia del primero elevado al segundo
                        calc = new PowerCalc();
                        break;
                    case 6:
                        System.out.println("Saliendo de la calculadora");
                        option = 0;
                        break;
                    default:
                        System.out.println("Debe seleccionar una opción válida");
                }

                // captura los numeros ingresados en consola
                if(calc != null) {
                    try {
                        System.out.println("Ingresa el primer número");
                        double number1 = scannerConsole.nextDouble();
                        System.out.println("Ingresa el segundo número");
                        double number2 = scannerConsole.nextDouble();
                        double resultado = calc.operation(number1, number2);
                        System.out.println("El resultado es: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir por cero!"+ e);
                    } catch (InputMismatchException e){ // cuando el usuario ingresa un valor no numérico en los numeros a evaluar
                        System.out.println("Error: Debe ingresar un número válido");
                        scannerConsole.next(); // limpia el buffer
                    }
                }
            } catch (InputMismatchException e) { // cuando el usuario ingresa un valor no numérico en la opción
                System.out.println("Debe ingresar un número entero");
                scannerConsole.next(); // limpia el buffer
            }
        }
        scannerConsole.close();

        // 1. Lea de un archivo un numero y lo imprima en pantalla
        //Instancio objeto fileReader de la clase FileReaderClass
        FileReaderClass fileReader = new FileReaderClass();
        //Variable con la ruta del archivo
        String filePath = "numberFile.txt";
        //Se llama al metodo readNumberFromFile de la clase FileReaderClass
        fileReader.readNumberFromFile(filePath);
    }
}