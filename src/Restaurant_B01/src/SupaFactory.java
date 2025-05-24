public class SupaFactory {
    public static ISupa createSupa(TipSupa tip) {
        switch (tip) {
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                throw new IllegalArgumentException("Tipul de supă necunoscut: " + tip);
        }
    }
}
