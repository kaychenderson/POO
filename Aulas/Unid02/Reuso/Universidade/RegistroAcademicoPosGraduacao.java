package Reuso.Universidade;

public class RegistroAcademicoPosGraduacao {
  private RegistroAcademico registro;
  private String orientador;
  private String tituloTese;

  // ! Outra forma de criar um construtor.
  // public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String orientador, String tituloTese) {
  //   this.registro = registro;
  //   this.orientador = orientador;
  //   this.tituloTese = tituloTese;
  // } 

  public RegistroAcademicoPosGraduacao(String nome, String matricula, String curso, String orientador, String tituloTese) {
    this.registro = new RegistroAcademico(nome, matricula, curso);
    this.orientador = orientador;
    this.tituloTese = tituloTese;
  }

  @Override
  public String toString() {
    return "\nRegistroAcademicoPosGraduacao: \n" +
           "Registro = " + registro + "\n" +
           "Orientador = " + orientador + "\n" +
           "TituloTese = " + tituloTese;
  }
}
