package Heranca.Cliente_Heranca;

public class Teste {
    public static void main (String[] args){
        PessoaFisica pf = new PessoaFisica("Brasil", "20/03/2004", "Maria", "Silva", "123.456.789.00");
        PessoaJuridica pj = new PessoaJuridica("Brasil", "02/03/2005", "Amazon", "Loja Legal", "AMZ", "11.222.333/4444-55");

        System.out.println("Pessoa Fisica: ");
        pf.exibirDados();

        System.out.println("\nPessoa Juridica: ");
        pj.exibirDados();
    }
}