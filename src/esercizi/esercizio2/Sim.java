package esercizi.esercizio2;

import java.util.ArrayList;

public class Sim {
    private int numeroSim;
    private int credito;
    private Chiamata[] chiamate;

    public Sim(int numeroSim) {
        this.numeroSim = numeroSim;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void stampaDati() {
        System.out.println("Numero Sim: " + numeroSim);
        System.out.println("Credito Sim: " + credito + "€");
        System.out.println("Chiamate Sim: " + chiamate);
    }

//    public void effettuaChiamata(Chiamata chiamata) {
//
//    }

}
