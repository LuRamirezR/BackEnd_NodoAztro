import models.PersonalAdmin;
import models.profesores.ProfesorInterino;
import models.profesores.ProfesorTitular;
import models.voluntarios.VoluntarioExterno;
import models.voluntarios.VoluntarioMiembro;

public class Main {
    public static void main(String[] args) {

        //Asalariados
        //Personal administrativo
        PersonalAdmin jefeContable = new PersonalAdmin("John", "Hernandez", 29, "70536861",
                1700000L, 10,"Jefe de Contaduria", "Contaduria",
                "Horario:7AM --> 5PM");
        jefeContable.increaseSalary(2);
        System.out.printf("Personal administrativo:\nNombre: %s \nSalario: $%s y su bono navideño es: $%s",
                jefeContable.getFullName(), jefeContable.getSalario(), jefeContable.getBonoNavideno());


        //Profesores
        //Profesor Titular
        ProfesorTitular profeMatematicas = new ProfesorTitular("Lucia", "Bernal", 32, "11265498", 1600000L,
                10 , "Matematicas", "Contrato indefinido", 40, 5);
        profeMatematicas.increaseSalary(10);
        System.out.println("\n\nProfesores: " + profeMatematicas.work());
        System.out.printf("\nProfesor Titular:\nNombre: %s\nEnseña %s \n%s",
                profeMatematicas.getFullName(), profeMatematicas.getSubject(), profeMatematicas.extraBonus());

        //Profesor Interino
        ProfesorInterino profeReemplazo = new ProfesorInterino("Carlos", "Molina", 29, "1237854", 1900000L,
                5, "Inglés", "Contrato por horas", "En incapacidad por gripa");
        System.out.printf("\nProfesor Interino:\nNombre: %s, edad %s años", profeReemplazo.getFullName(), profeReemplazo.getAge());
        System.out.printf("\nEsta reemplazando a un profesor(a) %s", profeReemplazo.whoReplace);


        //Voluntarios
        //Voluntario Miembro
        VoluntarioMiembro voluntarioLider = new VoluntarioMiembro("Juan", "Lopez", 40,
                "1123456", "Evento PyLadies Conf", "Comunidad Tech");
        System.out.println("\n\nVoluntarios:");
        System.out.printf("\nVoluntario Miembro:\nNombre: %s y es Lider en el %s", voluntarioLider.getFullName(), voluntarioLider.getProject());

        //Voluntario Externo
        VoluntarioExterno voluntarioOcasional = new VoluntarioExterno("Pablo", "Gallego", 21, "1234569", "EAFIT");
        System.out.printf("\nVoluntario Externo:\nNombre: %s y pertenece a %s como voluntario externo", voluntarioOcasional.getFullName(), voluntarioOcasional.getExternalOrganization());

    }
}