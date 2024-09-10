import models.PersonalAdmin;

public class Main {
    public static void main(String[] args) {

        PersonalAdmin jefeContable = new PersonalAdmin("John", "Hernandez", 29, "70536861",
                "Jefe de Contaduria", "Contaduria",
                "Horario:7AM --> 5PM");
        jefeContable.increaseSalary(2);

        System.out.printf("Personal administrativo:\nNombre: %s \nSalario: $%s", jefeContable.getFullName(), jefeContable.getSalario());

    }
}