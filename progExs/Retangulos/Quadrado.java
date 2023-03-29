package progExs.Retangulos;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4*lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
