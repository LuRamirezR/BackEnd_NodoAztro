import models.PersonalAdmin;
import models.profesores.ProfesorTitular;

public class Main {
    public static void main(String[] args) {

        //Asalariados
        //Personal administrativo
        PersonalAdmin jefeContable = new PersonalAdmin("John", "Hernandez", 29, "70536861",
                "Jefe de Contaduria", "Contaduria",
                "Horario:7AM --> 5PM");
        jefeContable.increaseSalary(2);
        System.out.printf("Personal administrativo:\nNombre: %s \nSalario: $%s", jefeContable.getFullName(), jefeContable.getSalario());

        //Profesores
        //Profesor Titular
        ProfesorTitular profeMatematicas = new ProfesorTitular("Lucia", "Bernal", 32, "11265498",
                "Matematicas", "Contrato fijo", 40, 5);
        profeMatematicas.increaseSalary(10);
        System.out.println("\n\nProfesores:" + profeMatematicas.work());
        System.out.printf("\nProfesor Titular:\nNombre: %s\nEnseña %s \n%s", profeMatematicas.getFullName(), profeMatematicas.getSubject(), profeMatematicas.extraBonus());
        //Profesor Interino
        System.out.println("\nProfesor Interino:");

        //Voluntarios
        //Voluntario Miembro

        //Voluntario Externo

    }
}