import es1.Rettangolo;
import es2.SIM;

import static es1.Rettangolo.stampaDueRettangoli;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(7, 23);
                Rettangolo rettangolo2 = new Rettangolo( 81, 3);

                stampaDueRettangoli(rettangolo1, rettangolo2);

        SIM sim = new SIM("1234567890");

        sim.aggiungiChiamata("0987654321", 5);
        sim.aggiungiChiamata("9871236545", 2);
        sim.stampaDatiSIM();

    }


}