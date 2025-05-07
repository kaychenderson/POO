public class Data {
    int dia;
    int mes;
    int ano;

    boolean dataValida(){
        return (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && ano > 0);
    }

    void inicializaData (int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    void mostrarData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public static void main(Strin[] args){
        Data d1 = new Data();

        d1.inicializaData(6, 5, 2025);
        d1.dataValida();
        d1.mostrarData();
    }
}