package Reuso.Universidade;

public class DemoUniversidade {
  public static void main(String[] args) {
    RegistroAcademico registro = new RegistroAcademico("João Silva", "123456", "Engenharia de Software");
    System.out.println(registro);

    RegistroAcademicoPosGraduacao registroPos = new RegistroAcademicoPosGraduacao("Maria Oliveira", "654321", "Ciência da Computação", "Dr. Carlos Souza", "Inteligência Artificial");
    System.out.println(registroPos);
  }
}
