package ESERCIZIO;

public class Main {
    public static void main(String[] args) {
        Dipendente f1 = new DipendenteFullTime("FT001", 2000, Dipartimento.PRODUZIONE);
        Dipendente p1 = new DipendentePartTime("PT001", Dipartimento.VENDITE, 80, 12.5);
        Dipendente d1 = new Dirigente("D001", 3000, Dipartimento.AMMINISTRAZIONE, 500);

        Dipendente[] dipendenti = {f1, p1, d1};
        Volontario v1 = new Volontario("Gatto Silvestro", 28, "CV breve");
        Volontario v2 = new Volontario("TOPO GIGIO", 60, "Studente universitaria");

        CheckIn[] persone = {f1, p1, d1, v1, v2};

        for (CheckIn persona : persone) {
            persona.checkIn();
        }

        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente);

        }

    }
}
