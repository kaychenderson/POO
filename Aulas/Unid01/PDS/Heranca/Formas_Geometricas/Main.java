package Heranca.Formas_Geometricas;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(2),
            new Quadrado(3),
            new Triangulo(4, 5),
            new Esfera(2),
            new Cubo(3),
            new Tetraedro(2)
        };

        for (Forma f : formas) {
            if (f instanceof FormaBidimensional) {
                FormaBidimensional fb = (FormaBidimensional) f;
                System.out.println("Forma Bidimensional - Área: " + fb.getArea());
            } else if (f instanceof FormaTridimensional) {
                FormaTridimensional ft = (FormaTridimensional) f;
                System.out.println("Forma Tridimensional - Área: " + ft.getArea());
                System.out.println(" - Volume: " + ft.getVolume());
            }
        }
    }
}
