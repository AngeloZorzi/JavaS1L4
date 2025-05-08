package ESERCIZIO;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("A001", 1500.00, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("A002", 1800.50, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente("A003", 1700.25, Dipartimento.VENDITE);

        Dipendente[] dipendenti = { d1, d2, d3 };
        for (Dipendente d : dipendenti){
            System.out.println(d.getMatricola());
        }

    }
}
