import java.util.Scanner;
import java.text.DecimalFormat;

public class LojaDescontos {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        int codigoSetor;
        System.out.print("Informe o código setor (111 ou 222) do produto: ");
        codigoSetor = leitor.nextInt();

        double valor;
        System.out.print("Informe o valor do produto: ");
        valor = leitor.nextDouble();

        double valorComDesconto = 0;
        String nomeSetor = "";

        switch(codigoSetor) {
            case 111:
                nomeSetor = "Cama, Mesa e Banho";
                if (valor > 100) {
                    valorComDesconto = valor * 0.6;
                } else if (valor >= 50) {
                    valorComDesconto = valor * 0.8;
                } else {
                    valorComDesconto = valor * 0.9;
                }
                break;
            case 222:
                nomeSetor = "Eletros";
                if (valor > 500) {
                    valorComDesconto = valor * 0.9;
                } else {
                    valorComDesconto = valor;
                }
                break;
            default:
                System.out.print("Setor Inválido");
                return;
        }

        System.out.println("Nome do setor: " + nomeSetor);
        System.out.println("Valor com desconto: " + df.format(valorComDesconto));

        leitor.close();
    }
}