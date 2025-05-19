public class VerificatorMasaFacade {
    private VerificareDisponibilitate disponibilitate;
    private VerificareDebarasare debarasare;
    private VerificareServetele servetele;

    public VerificatorMasaFacade() {
        this.disponibilitate = new VerificareDisponibilitate();
        this.debarasare = new VerificareDebarasare();
        this.servetele = new VerificareServetele();
    }

    public void verificaMasa(int numarMasa) {
        boolean esteLibera = disponibilitate.esteLibera(numarMasa)
                && debarasare.esteDebarasata(numarMasa)
                && servetele.areServetele(numarMasa);

        if (esteLibera) {
            System.out.println("Masa " + numarMasa + " poate fi ocupată.");
        } else {
            System.out.println("Masa " + numarMasa + " NU este pregătită.");
        }
    }
}
