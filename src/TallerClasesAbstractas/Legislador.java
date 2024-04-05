package TallerClasesAbstractas;

public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;

    public Legislador(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    // Método abstracto
    public abstract String getCamaraEnQueTrabaja();
}

