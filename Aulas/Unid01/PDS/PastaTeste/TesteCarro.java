package PastaTeste;
import Pasta.Carro;
import Pasta.Sedan;

public class TesteCarro {
    public static void main(String[] args) {
        Carro fit = new Carro();
        Sedan civic = new Sedan();

        fit.marca = "Honda";
        fit.ano = 2014;
        fit.preco = 55000;

        civic.marca = "Honda";
        civic.ano = 2014;
        civic.preco = 75000;
        civic.portaMalas = 450;

        // System.out.print();
    }
}
