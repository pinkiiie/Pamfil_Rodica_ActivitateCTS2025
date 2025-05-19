package biletul1.pattern.main;


import biletul1.pattern.factory.*;
import biletul1.pattern.singleton.Service;

public class Main {
    public static void main(String[] args) {

        Service service = Service.getInstance();

        AMasina masina = new Masina("Mazda", "M123", 4);
        service.preluareMasina(masina);
        System.out.println(service.getMasinaAflataInService());

        AMasina masina2 = new Masina("Mercedes", "M345", 2);
        AMasina masina3 = new Masina("Dacia", "D222", 0);
        AMasina masina4 = new Masina("Renault", "R345", 4);

        service.preluareMasina(masina2);
        System.out.println(service.getMasinaAflataInService());

        service.preluareMasina(masina3);
        service.preluareMasina(masina4);

        System.out.println(service.getMasinaAflataInService());

        MasinaFactory masinaFactory = new MasinaFactory();

        ITipMasina masinaSUV = masinaFactory.creareMasina(ETipMasina.SUV);
        ITipMasina masinaSUV2 = masinaFactory.creareMasina(ETipMasina.SUV);
        ITipMasina masinaVAN = masinaFactory.creareMasina(ETipMasina.VAN);
        ITipMasina masinaSEDAN = masinaFactory.creareMasina(ETipMasina.SEDAN);

    }
}