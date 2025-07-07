// Classe abstrata FiguraGeometrica
public abstract class FiguraGeometrica {
    public abstract void descricao();
}

// Subclasse Circulo
public class Circulo extends FiguraGeometrica {
    @Override
    public void descricao() {
        System.out.println("Esta é uma figura circular, com todos os pontos equidistantes do centro.");
    }
}

// Subclasse Quadrado
public class Quadrado extends FiguraGeometrica {
    @Override
    public void descricao() {
        System.out.println("Esta é uma figura quadrada, com quatro lados iguais e quatro ângulos retos.");
    }
}

// Subclasse Triangulo
public class Triangulo extends FiguraGeometrica {
    @Override
    public void descricao() {
        System.out.println("Esta é uma figura triangular, com três lados e três ângulos.");
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();
        
        circulo.descricao();
        quadrado.descricao();
        triangulo.descricao();
    }
}