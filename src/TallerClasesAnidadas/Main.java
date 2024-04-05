package TallerClasesAnidadas;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ClaseExterna
        ClaseExterna externa = new ClaseExterna(5);

        // Crear una instancia de ClaseInterna utilizando la instancia de ClaseExterna
        ClaseExterna.ClaseInterna interna = externa.new ClaseInterna();

        // Usar métodos de la clase interna para calcular valores
        System.out.println("El doble del valor externo es: " + interna.calcularDoble());
        System.out.println("El triple del valor externo es: " + interna.calcularTriple());
    }
}

