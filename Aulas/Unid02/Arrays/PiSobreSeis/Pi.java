package Array.PiSobreSeis;

public class Pi {
    public static void main(String[] args) {
        double[] termosDaSerie = new double[1000000];

        for (int i = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1.0/Math.pow(i+1, 2);
        }

        for (int i = 10; i <= 1000000; i*=10) {
            calculaEMostraSomatoria(i, termosDaSerie);
        }
    }

    public static void calculaEMostraSomatoria(int num, double[] array){
        double soma = 0.0;
        for (int i = 0; i < num; i++) {
            soma += array[i];
        }
        System.out.println(soma);
    }
}