

public class Restaurant {
    public static void main(String[] args) {
        ISupa supaLegume = SupaFactory.createSupa(TipSupa.LEGUME);
        supaLegume.prepara();
        supaLegume.serveste();

        ISupa supaCiuperci = SupaFactory.createSupa(TipSupa.CIUPERCI);
        supaCiuperci.prepara();
        supaCiuperci.serveste();
    }
}
