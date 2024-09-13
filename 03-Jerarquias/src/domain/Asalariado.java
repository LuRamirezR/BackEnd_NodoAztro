package domain;

public abstract class Asalariado extends Persona {

    //Atributos
    //private Long SMLV = 1300000L;
    private Long salario;
    private Long bonoNavideno;

    //Sobreescribe el constructor del padre (Persona)
    public Asalariado(String name, String lastName, int age, String idCard, Long salario) {
        super(name, lastName, age, idCard);
        this.salario = salario;
        this.bonoNavideno = 0L;
        this.calcularBonoNavideno();
    }

    //Sobreescribe el metodo protegido del padre (Persona)
    @Override
    protected void calcularBonoNavideno() {
        // Supongamos que el bono es el 10% del salario.
        this.bonoNavideno = this.salario * 10 / 100;
        //System.out.println("\nEl bono del asalariado es: $" + bono);
    }

    //Getter y setter
    /*public Long getSMLV() {
        return SMLV;
    }

    public void setSMLV(Long SMLV) {
        this.SMLV = SMLV;
    }*/

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public Long getBonoNavideno() {
        return bonoNavideno;
    }


    //Metodos
    /*
    work(): abstracto que devuelve un String
    increaseSalary(): con parametro entero, que no devuelve nada
    */
    public abstract String work();
    public abstract void increaseSalary(int value);
}
