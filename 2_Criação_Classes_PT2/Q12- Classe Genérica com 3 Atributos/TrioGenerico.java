public class TrioGenerico<T>{
    private T atributo1;
    private T atributo2;
    private T atributo3;
    
    public TrioGenerico(T atributo1, T atributo2, T atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    
    public int contarIguais(){
        if(atributo1.equals(atributo2)){
            if(atributo2.equals(atributo3)){
                return 3; // Todos Iguais
            }
            return 2; 
        } else if (atributo2.equals(atributo3)){
            return 2;
        } else if (atributo1.equals(atributo3)){
            return 2;
        } else {
            return 0; // Todos Diferentes
        }
    }
    
    public void imprimirAtributos(){
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }
    
    // Getters e Setters
    public T getAtributo1(){
        return atributo1;
    }
    
    public void setAtributo1(T atributo1){
        this.atributo1 = atributo1;
    }
    
    public T getAtributo2(){
        return atributo2;
    }
    
    public void setAtributo2(T atributo2){
        this.atributo2 = atributo2;
    }
    
    public T getAtributo3(){
        return atributo3;
    }
    
    public void setAtributo3(T atributo3){
        this.atributo3 = atributo3;
    }
}