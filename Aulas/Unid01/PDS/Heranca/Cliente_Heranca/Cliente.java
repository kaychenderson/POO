package Heranca.Cliente_Heranca;

public class Cliente {
    protected String pais;
    protected String dataCadastro;

    public Cliente(String pais, String dataCadastro){
        this.pais = pais;
        this.dataCadastro = dataCadastro;
    }

    public void exibirDados(){
        System.out.println("País: " + pais);
        System.out.println("Data de Cadastro: " + dataCadastro);
    }
}
