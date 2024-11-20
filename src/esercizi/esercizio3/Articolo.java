package esercizi.esercizio3;

public class Articolo {

    private int idArticolo;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(int idArticolo, String descrizione, double prezzo, int pezziDisponibili) {
        this.idArticolo = idArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }
}
