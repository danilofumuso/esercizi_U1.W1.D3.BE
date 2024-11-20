import esercizi.esercizio1.Rettangolo;
import esercizi.esercizio2.Chiamata;
import esercizi.esercizio2.Sim;

public class Main {
    public static void main(String[] args) {

        //Esercizio 1

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 12);

        Rettangolo.stampaRettangolo(rettangolo1);
        Rettangolo.stampaRettangolo(rettangolo2);

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

        //Esercizio2

        Chiamata chiamata=new Chiamata(12,231453225);

        Sim sim = new Sim(365235453);
        sim.stampaDati();


        //Esercizio3
    }
}