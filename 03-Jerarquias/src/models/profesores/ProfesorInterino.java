package models.profesores;

import models.Profesor;

public class ProfesorInterino extends Profesor {

    //Atributos
    public String whoReplace;

    //Sobreescribe constructor del padre (Profesor)
    public ProfesorInterino(String name, String lastName, int age, String idCard, String subject,
                            String contractType, String whoReplace) {
        super(name, lastName, age, idCard, subject, contractType);
        this.whoReplace = whoReplace;
    }
}
