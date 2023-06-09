package progExs.Retangulos;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularCircunferencia() {
        return (2*raio*Math.PI);
    }

    public double calcularArea() {
        return Math.PI*Math.pow(raio, 2);
    }
}
