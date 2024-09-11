package models.voluntarios;

import domain.Voluntario;

public class VoluntarioMiembro extends Voluntario {

    //Atributos
    private String project;
    private String institution;

    //Sobreescribe constructor del padre (Voluntario)
    public VoluntarioMiembro(String name, String lastName, int age, String idCard, String project, String institution) {
        super(name, lastName, age, idCard);
        this.project = project;
        this.institution = institution;
    }

    //Getter y setter
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
