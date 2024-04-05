package TallerClasesAnidadas;

public class ClaseExterna {
    private int valorExterno;

    public ClaseExterna(int valorExterno) {
        this.valorExterno = valorExterno;
    }

    // Getter para obtener el valor externo
    public int getValorExterno() {
        return valorExterno;
    }

    // Clase interna que realiza cálculos para la clase externa
    public class ClaseInterna {
        public int calcularDoble() {
            return valorExterno * 2;
        }

        public int calcularTriple() {
            return valorExterno * 3;
        }
    }
}
