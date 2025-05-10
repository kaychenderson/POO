public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return 6 * lado * lado;
    }

    @Override
    public double getVolume() {
        return lado * lado * lado;
    }
}