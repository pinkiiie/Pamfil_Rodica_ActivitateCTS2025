public class Restaurant {
    public static void main(String[] args) {
        int masa = 5;

        //fara facade
        VerificareDisponibilitate disponibilitate = new VerificareDisponibilitate();
        VerificareDebarasare debarasare = new VerificareDebarasare();
        VerificareServetele servetele = new VerificareServetele();

        boolean esteLibera = disponibilitate.esteLibera(masa);
        boolean esteDebarasata = debarasare.esteDebarasata(masa);
        boolean areServetele = servetele.areServetele(masa);

        if (esteLibera && esteDebarasata && areServetele) {
            System.out.println("Masa " + masa + " poate fi ocupată.");
        } else {
            System.out.println("Masa " + masa + " NU este pregătită.");
        }

        // cu facade
        masa = 6;
        System.out.println("Testare cu DP Facade.....");
        VerificatorMasaFacade verificator = new VerificatorMasaFacade();
        verificator.verificaMasa(masa);
    }
}