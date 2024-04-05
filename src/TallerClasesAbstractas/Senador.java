package TallerClasesAbstractas;

public class Senador extends Legislador {
    public Senador(String nombre, int edad, String provincia) {
        super(nombre, edad, provincia);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }
}
