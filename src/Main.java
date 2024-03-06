import es1.Rettangolo;
import static es1.Rettangolo.stampaDueRettangoli;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(7, 23);
                Rettangolo rettangolo2 = new Rettangolo( 81, 3);

                stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}