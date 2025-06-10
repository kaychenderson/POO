package Reuso.Empresa;

public class DemoEmpresa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Matheus", "123456789");
    System.out.println(pessoa);

    Funcionario funcionario = new Funcionario("Ana", "987654321", "Desenvolvedora", 5000.00);
    System.out.println(funcionario);

    ChefeDepartamento chefe = new ChefeDepartamento("Carlos", "456789123", "Gerente de TI", 8000.00, "Tecnologia da Informação");
    System.out.println(chefe);
  }
}
