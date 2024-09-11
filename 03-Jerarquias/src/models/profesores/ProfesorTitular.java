package models.profesores;

import models.Profesor;

public class ProfesorTitular extends Profesor {

    //Atributos
    public int workHours;
    public int extraHours;

    //Sobreescribe constructor del padre (Profesor)
    public ProfesorTitular(String name, String lastName, int age, String idCard, String subject,
                           String contractType, int workHours, int extraHours) {
        super(name, lastName, age, idCard, subject, contractType);
        this.workHours = workHours;
        this.extraHours = extraHours;
    }

    //Metodo
    public String extraBonus(){
        return "Hice " + this.extraHours + " horas extras";
    }

}
