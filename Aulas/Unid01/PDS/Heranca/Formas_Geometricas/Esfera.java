package Heranca.Formas_Geometricas;

public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }
}