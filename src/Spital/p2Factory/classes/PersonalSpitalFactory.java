package p2Factory.classes;

public class PersonalSpitalFactory {
    public static PersonalSpital createPersonal(TipPersonal tipPersonal) {
        switch (tipPersonal) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                throw new IllegalArgumentException("Tip personal necunoscut.");
        }
    }
}