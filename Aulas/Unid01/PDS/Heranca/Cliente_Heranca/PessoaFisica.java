package Heranca.Cliente_Heranca;

public class PessoaFisica extends Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public PessoaFisica (String pais, String dataCadastro, String nome, String sobrenome, String cpf){
        super(pais, dataCadastro);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
}
