package biletul1.pattern.factory;

public class MasinaFactory {

    public ITipMasina creareMasina(ETipMasina masina){
        switch(masina){
            case SUV -> {
                return new MasinaSUV();
            }
            case VAN -> {
                return new MasinaVan();
            }
            case SEDAN -> {
                return new MasinaSedan();
            }
            default -> {
                return null;
            }
        }
    }

}
