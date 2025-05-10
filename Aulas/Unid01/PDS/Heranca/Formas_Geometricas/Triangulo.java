package Heranca.Formas_Geometricas;

public class Triangulo extends FormaBidimensional {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }
}