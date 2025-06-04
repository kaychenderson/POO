package Array.Extrato;

import java.util.Scanner;

public class ExtratoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato ex = new Extrato();
        int op;
        double valor;

        do {
            System.out.println("1 - Visualizar");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");
            System.out.println("4 - Encerrar");
            op = sc.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println(ex);
                    break;
                case 2:
                    System.out.print("Valor do deposito: ");
                    valor = sc.nextDouble();
                    ex.transacao(valor);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    valor = sc.nextDouble();
                    ex.transacao(-valor);
                    break;
                case 4:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(op != 3);

        sc.close();
    }
}