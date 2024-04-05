package TallerClasesAbstractas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Legislador> legisladores = new ArrayList<>();
        
        legisladores.add(new Diputado("Juan", 40, "Buenos Aires"));
        legisladores.add(new Senador("María", 45, "Córdoba"));
        
        for (Legislador legislador : legisladores) {
            System.out.println(legislador.getNombre() + " trabaja en la cámara de " + legislador.getCamaraEnQueTrabaja());
        }
    }
}
