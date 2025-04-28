public class Lampada{
    private boolean estadoDaLampada;
    private Contador contadorAcesa;
    
    public Lampada(){
        this.estadoDaLampada = false;
        this.contadorAcesa = new Contador();
    }
    
    public void acende(){
        if(!estadoDaLampada){
            estadoDaLampada = true;
            contadorAcesa.incrementar();
        }
    }
    
    public void apaga(){
        estadoDaLampada = false;
    }
    
    public void mostraEstado(){
        if(estadoDaLampada){
            System.out.println("A lampada está acesa.");
        } else {
            System.out.println("A lampada está apagada.");
        }
    }
    
    public boolean estaLigada(){
        return estadoDaLampada;
    }
    
    public int getVezesAcesa(){
        return contadorAcesa.getValor();
    }
}