package es2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
//    attributi della SIM privati
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> ultimeChiamate;



//    costruttore per creare SIM

    public SIM(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new ArrayList<>();
    }

    public static void aggiungiChiamata(String number, int i) {
    }

    public void stampaDatiSIM(){
        System.out.println("numero di telefono; " + numeroTelefono);
        System.out.println("credito residuo: " + creditoDisponibile + "euro");
        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : ultimeChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurata() + " minuti");
        }
    }

}
 class Chiamata {
    private String numeroChiamato;
    private int durata;

    // Costruttore per creare dati chiamata
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    // Metodo getter per ottenere il numero chiamato
    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    // Metodo getter per ottenere la durata della chiamata
    public int getDurata() {
        return durata;
    }
}

