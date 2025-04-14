public class NumeroComplexoTeste{
    public static void main(String[] args){
        System.out.println("--- Testando Números Complexos ---");
        
        NumeroComplexo c1 = new NumeroComplexo(2, 4);
        NumeroComplexo c2 = new NumeroComplexo(3);
        NumeroComplexo c3 = new NumeroComplexo();
        NumeroComplexo c4 = new NumeroComplexo(-1, -2);
        NumeroComplexo c5 = new NumeroComplexo(0, 5);
        
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C3: " + c3);
        System.out.println("C4: " + c4);
        System.out.println("C5: " + c5);
        
        // Modificando valores
        c3.setReal(7);
        c3.setImaginario(-3);
        System.out.println("C3: " + c3);
    }
}