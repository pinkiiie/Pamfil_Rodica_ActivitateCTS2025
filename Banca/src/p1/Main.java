package p1;
import p1.classes.Credit;
import p1.classes.CreditFactory;
public class Main {
    public static void main(String[] args) {
        Credit creditNevoiPersonale = CreditFactory.createCredit("nevoi personale", 50000, 5.5);

        creditNevoiPersonale.descriere();
        Credit creditIpotecar = CreditFactory.createCredit("ipotecar", 200000, 3.5);
        creditIpotecar.descriere();
    }
}