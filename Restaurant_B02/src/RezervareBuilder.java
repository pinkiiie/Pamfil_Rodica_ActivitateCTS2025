public class RezervareBuilder implements IRezervareBuilder {
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient, int numarPersoane, String data, String ora) {
        this.rezervare = new Rezervare(numeClient, numarPersoane, data, ora);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean personalizata, String genMuzica) {
        rezervare.setMuzicaAmbientalaPersonalizata(personalizata);
        if (personalizata) {
            rezervare.setGenMuzica(genMuzica);
        }
        return this;
    }

    public Rezervare build() {
        return this.rezervare;
    }
}
