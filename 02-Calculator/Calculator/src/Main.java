import model.*;

import java.util.Scanner; //para leer la entrada del usuario (puede ser por consola)

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // creo objeto pára leer entrada en consola
        int option = -1;
        while (option != 0){
            System.out.println("\nHas ingresado a la calculadora\nSelecciona una de las siguientes opciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir de calculadora");
            option = scanner.nextInt();  // Lee la opción del usuario (numero entero)

            // variable calc tipo abstracto Calculadora, para polimorfirmos
            Calculadora calc = null;

            //Evaluar la opcion seleccionada por el usuario en consola
            switch (option){
                case 1:
                    calc = new SumaCalc(); //se asigna a calc una instancia de una de las subclases de Calculadora
                    break;
                case 2:
                    calc = new RestaCalc();
                    break;
                case 3:
                    calc = new MultipCalc();
                    break;
                case 4:
                    calc = new DivisionCalc();
                    break;
                case 5:
                    option = 0;
                    System.out.println("Saliendo de la calculadora....");
                    break;
                default:
                    System.out.println("Debe seleccionar una opción válida");

            }

            // captura los numeros ingresados en consola
            if(calc != null){
                System.out.println("Ingresa el primer número:");
                double num1 = scanner.nextDouble();
                System.out.println("Ingresa el segundo número:");
                double num2 = scanner.nextDouble();

                // Verifico si la operacion escogida es de division y si num2 es cero (0)
                if(calc instanceof DivisionCalc && num2 == 0){
                    System.out.println("No se puede dividir entre cero, ingresa otro número");
                }else {
                    double resultado = calc.operar(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                }
            }
        }
        scanner.close();  // Cierra el scanner
    }
}