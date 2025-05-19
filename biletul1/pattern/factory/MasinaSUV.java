package biletul1.pattern.factory;

public class MasinaSUV extends Masina implements ITipMasina{
    public MasinaSUV() {
        super();
    }

    public MasinaSUV(String marca, String serieSasiu, int nrBoxe) {
        super(marca, serieSasiu, nrBoxe);
    }
}
