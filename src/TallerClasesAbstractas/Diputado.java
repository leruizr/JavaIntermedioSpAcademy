package TallerClasesAbstractas;

public class Diputado extends Legislador {
    public Diputado(String nombre, int edad, String provincia) {
        super(nombre, edad, provincia);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputados";
    }
}
