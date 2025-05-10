package Heranca.Cliente_Heranca;

public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String nomeFantasia;
    private String sigla;
    private String cnpj;

    public PessoaJuridica(String pais, String dataCadastro, String razaoSocial, String nomeFantasia, String sigla, String cnpj){
        super(pais, dataCadastro);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.sigla = sigla;
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Sigla: " + sigla);
        System.out.println("CNPJ: " + cnpj);
    }
}
