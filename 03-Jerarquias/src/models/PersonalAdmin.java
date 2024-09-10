package models;

import domain.Asalariado;

public class PersonalAdmin extends Asalariado {

    //Atributos
    private String cargo;
    private String dependencia;
    private String horario;

    //Sobreescribe constructor del padre (Asalariado)
    //Y adiciono los atributos en los parametros
    public PersonalAdmin(String name, String lastName, int age, String idCard,
                         String cargo, String dependencia, String horario) {
        super(name, lastName, age, idCard);
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.horario = horario;
    }

    //Sobreescribo metodos del padre (Asalariado)
    @Override
    public String work() {
        return "Soy del área administrativa!";
    }

    @Override
    public void increaseSalary(int value) {
        super.setSalario(super.getSalario() * value);
    }

    //Getter y setter
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
