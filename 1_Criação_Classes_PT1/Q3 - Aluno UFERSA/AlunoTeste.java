public class AlunoTeste{
    public static void main(String[] args){
        Aluno a1 = new Aluno("20230101", "Felipe Silva", 7.5, 8.5, 9.5);
        Aluno a2 = new Aluno("20230102", "Amanda Souza", 6.5, 6.3, 6.0);
        Aluno a3 = new Aluno("20230103", "Bruno Oliveira", 4.5, 5.5, 6.0);
        
        System.out.println(a1);
        System.out.println("\n" + a2);
        System.out.println("\n" + a3);
    }
}