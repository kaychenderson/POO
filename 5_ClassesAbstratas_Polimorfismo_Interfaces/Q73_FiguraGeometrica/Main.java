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