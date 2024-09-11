package models.voluntarios;

import domain.Voluntario;

public class VoluntarioExterno extends Voluntario {

    //Atributos
    private String externalOrganization;

    //Sobreescribe constructor del padre (Voluntario)
    public VoluntarioExterno(String name, String lastName, int age, String idCard, String externalOrganization) {
        super(name, lastName, age, idCard);
        this.externalOrganization = externalOrganization;
    }

    //Getter y setter
    public String getExternalOrganization() {
        return externalOrganization;
    }

    public void setExternalOrganization(String externalOrganization) {
        this.externalOrganization = externalOrganization;
    }
}
