package 3_Array_e_ArrayLists.Q51_Calculadora;

public class Calculadora {
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
}
