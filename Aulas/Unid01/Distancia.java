import java.util.Scanner;

public class Distancia {
    double x1, y1, x2, y2;

    Scanner ent = new Scanner(System.in);

    System.out.print("x1: ");
    x1 = ent.nextDouble();
    System.out.print("y1: ");
    y1 = ent.nextDouble();
    System.out.print("x2: ");
    x2 = ent.nextDouble();
    System.out.print("y2: ");
    y2 = ent.nextDouble();

    double dist = Math.sqrt(Math.pow(x1 - x2 , 2.0) + Math.pow(y1 - y2, 2.0));

    System.out.print("A distância entre (" + x1 + " , " + y1 + ") e (" + x2 + " , " + y2 + ") é: " + dist);

    ent.close();
}