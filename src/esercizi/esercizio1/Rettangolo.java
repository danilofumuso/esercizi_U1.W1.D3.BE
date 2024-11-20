package esercizi.esercizio1;

public class Rettangolo {
    private int altezza;
    private int larghezza;


    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    private int perimetro() {
        return (2 * altezza) + (2 * larghezza);
    }

    private int area() {
        return altezza * larghezza;
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("il Perimetro del rettangolo è:" + rettangolo.perimetro());
        System.out.println("L'area del rettangolo è:" + rettangolo.area());

    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("il Perimetro del primo rettangolo è:" + rettangolo1.perimetro());
        System.out.println("L'area del primo rettangolo è:" + rettangolo1.area());

        System.out.println("il Perimetro del secondo rettangolo è:" + rettangolo2.perimetro());
        System.out.println("L'area del secondo rettangolo è:" + rettangolo2.area());

        int sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro();
        System.out.println("la somma dei perimetri dei rettangoli è: " + sommaPerimetri);

        int sommaAree = rettangolo1.area() + rettangolo2.area();
        System.out.println("la somma delle aree dei rettangoli è: " + sommaAree);
    }

}
