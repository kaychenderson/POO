public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private int x1, y1; // Coordenadas da figura1
    private int x2, y2; // Coordenadas da figura2
    
    public Desenho(FiguraGeometrica figura1, int x1, int y1,
                   FiguraGeometrica figura2, int x2, int y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void apresenta() {
        System.out.println("Figura 1 nas coordenadas (" + x1 + "," + y1 + "):");
        figura1.descricao();
        
        System.out.println("\nFigura 2 nas coordenadas (" + x2 + "," + y2 + "):");
        figura2.descricao();
    }
}