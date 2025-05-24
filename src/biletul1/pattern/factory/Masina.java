package biletul1.pattern.factory;

public class Masina extends AMasina {

    public Masina() {
    }

    public Masina(String marca, String serieSasiu, int nrBoxe) {
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.nrBoxe = nrBoxe;
    }


    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                '}';
    }
}
