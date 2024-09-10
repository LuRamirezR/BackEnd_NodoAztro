package domain;

public abstract class Voluntario extends Persona {
    //Sobreescribe el constructor del padre (Persona)
    public Voluntario(String name, String lastName, int age, String idCard) {
        super(name, lastName, age, idCard);
    }

    //Sobreescribe el metodo protegido del padre (Persona)
    @Override
    protected void calcularBono() {
        // Un bono fijo o según alguna otra variable de voluntariado.
        System.out.println("El voluntario no recibe bono monetario, pero recibe beneficios.");
    }
}
