public class TimeTeste {
    public static void main(String[] args) {
        Time t1 = new Time("Flamengo");
        
        t1.registrarVitoria();
        t1.registrarVitoria();
        t1.registrarVitoria();
        t1.registrarEmpate();
        t1.registrarDerrota();
        
        System.out.println(t1);
        System.out.printf("Aproveitamento: %.2f%%\n", t1.calcAproveitamento());
    }
}