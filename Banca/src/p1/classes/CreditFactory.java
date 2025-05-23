package p1.classes;

public class CreditFactory {
    public static Credit createCredit(String tip, double suma, double dobanda) {
        switch (tip.toLowerCase()) {
            case "nevoi personale":
                return new CreditNevoiPersonale(suma, dobanda);
            case "ipotecar":
                return new CreditIpotecar(suma, dobanda);
            default:
                throw new IllegalArgumentException("Tip de credit necunoscut: " + tip);
        }
    }
}
