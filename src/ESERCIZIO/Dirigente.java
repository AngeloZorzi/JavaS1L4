package ESERCIZIO;

public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + bonus;
    }
}
