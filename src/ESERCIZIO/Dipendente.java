package ESERCIZIO;



public class Dipendente {

    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
