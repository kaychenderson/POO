public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico (String nome, double salario, int matricula, double bonusSalarial) {
        super (nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        // 12 meses com bônus + 13º sem bônus
        return (getSalario() + bonusSalarial) * 12 + getSalario();
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus Salarial: R$" + String.format("%.2f", bonusSalarial) + " (Técnico)";
    }
}