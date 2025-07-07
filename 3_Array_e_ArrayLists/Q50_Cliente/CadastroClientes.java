package 3_Array_e_ArrayLists.Q50_Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (negativo para sair): ");
            int id = sc.nextInt();
            if (id < 0) break;
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("\nClientes cadastrados:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        sc.close();
    }
}