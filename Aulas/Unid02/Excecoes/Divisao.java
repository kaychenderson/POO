package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0, den = 0;
    boolean numeradorCorreto = false;
    boolean denominadorCorreto = false;

    do {
      try {
        System.out.print("Numerador: ");
        num = sc.nextInt();
        numeradorCorreto = true;
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. O numerador deveria ser inteiro.");
        sc.nextLine(); // Limpa o buffer do scanner
      }
    } while (!numeradorCorreto);

    do {
      try {
        System.out.print("Denominador: ");
        den = sc.nextInt();
        denominadorCorreto = true;
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. O denominador não pode ser 0.");
        sc.nextLine(); // Limpa o buffer do scanner
      }
    } while (!denominadorCorreto);

    System.out.println("Resultado: " + num + "/" + den + " = " + divisaoInteira(num, den));

    try {
      System.out.println("Resultado: " + num + "/" + den + " = " + divisaoInteira2(num, den));
    } catch (ArithmeticException e) {
      System.out.println("Erro: Divisão por zero não é permitida.");
    }

    sc.close();
  }

  public static int divisaoInteira(int numerador, int denominador) {
    int resultado = 0;
    try {
      resultado = numerador/denominador;
    } catch (ArithmeticException e) {
      System.out.println("Erro: Divisão por zero não é permitida.");
    }
    return resultado;
  }

  public static int divisaoInteira2(int numerador, int denominador) {
    if (denominador == 0) {
      throw new ArithmeticException("Divisão por zero não é permitida.");
    }
    return numerador / denominador;
  }
}
