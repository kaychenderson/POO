import java.util.Stack;

public class VerificaParenteses {
    public static void main(String[] args) {
        String[] testes = {
            "(()()()())",
            "(((())))",
            "(()((())()))",
            "((((((())",
            "()))",
            "(()()(()"
        };
        
        for (String teste : testes) {
            System.out.println(teste + " está balanceado? " + estaBalanceado(teste));
        }
    }
    
    public static boolean estaBalanceado(String s) {
        Stack<Character> pilha = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        
        return pilha.isEmpty();
    }
}