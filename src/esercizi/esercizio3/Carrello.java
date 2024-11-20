package esercizi.esercizio3;

public class Carrello {
    private String clienteAssociato;
    private Articolo[] elencoArticoli;
    private double costoArticoli;

    public Carrello(String clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new Articolo[20];
        this.costoArticoli = 0;
    }
}
