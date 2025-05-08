package ESERCIZIO;

public class Main {
    public static void main(String[] args) {
        Dipendente f1 = new DipendenteFullTime("FT001", 2000, Dipartimento.PRODUZIONE);
        Dipendente p1 = new DipendentePartTime("PT001", Dipartimento.VENDITE, 80, 12.5);
        Dipendente d1 = new Dirigente("D001", 3000, Dipartimento.AMMINISTRAZIONE, 500);

        Dipendente[] dipendenti = {f1, p1, d1};

        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente);

        }

    }
}
