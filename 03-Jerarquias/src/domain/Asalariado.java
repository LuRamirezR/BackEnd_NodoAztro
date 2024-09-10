package domain;

public abstract class Asalariado extends Persona {

    //Atributos
    private Long SMLV = 1300000L;
    private Long salario;

    //Sobreescribe el constructor del padre (Persona)
    public Asalariado(String name, String lastName, int age, String idCard) {
        super(name, lastName, age, idCard);
        this.salario = SMLV;
    }

    //Sobreescribe el metodo protegido del padre (Persona)
    @Override
    protected void calcularBono() {
        // Supongamos que el bono es el 10% del salario.
        Long bono = this.getSalario() * 10 / 100;
        System.out.println("El bono del asalariado es: " + bono);
    }

    //Getter y setter
    public Long getSMLV() {
        return SMLV;
    }

    public void setSMLV(Long SMLV) {
        this.SMLV = SMLV;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    //Metodos
    /*
    work(): abstracto que devuelve un String
    increaseSalary(): con parametro entero, que no devuelve nada
    */
    public abstract String work();
    public abstract void increaseSalary(int value);
}
