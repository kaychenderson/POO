package Heranca.Formas_Geometricas;

public class Tetraedro extends FormaTridimensional {
    private double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * aresta * aresta;
    }

    @Override
    public double getVolume() {
        return Math.pow(aresta, 3) / (6 * Math.sqrt(2));
    }
}