public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo (String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super (nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual () {
        double salarioBase = getSalario();
        double salarioMensal = salarioBase;

        if (turno.equalsIgnoreCase("noite")) {
            salarioMensal += adicionalNoturno;
        }

        // 12 meses com adicional (se noturno) + 13º sem adicional
        return salarioMensal * 12 + salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno + 
               ", Adicional Noturno: R$" + String.format("%.2f", adicionalNoturno) + " (Administrativo)";
    }
}