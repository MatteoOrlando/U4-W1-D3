package es1;

public class Rettangolo {

//    attributi privati
    private double altezza;
    private double larghezza;


//    costruttore
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

//    metodo calcolo area e perimetro


    public double calcolaArea() {
        return altezza * larghezza;
    }
    public double calcolaPerimetro(){
        return altezza + larghezza;
    }

    public void stampaRettangolo(){
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Rettangolo 1: ");
        rettangolo1.stampaRettangolo();
        System.out.println("Rettangolo 2: ");
        rettangolo2.stampaRettangolo();
    }

}
