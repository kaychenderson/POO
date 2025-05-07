package Heranca;

public class PessoaJuridica extends Cliente {
    public String razaoSocial;
    public String nomeFantasia;
    public String sigla;
    public String cnpj;

    public void imprimeDados(String razaoSocial, String nomeFantasia, String sigla, String cnpj){
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.sigla = sigla;
        this.cnpj = cnpj;
    }

    public static void main(String[] args) {
        
    }
}
