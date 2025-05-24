public class Rezervare {
    // Atribute obligatorii
    private String numeClient;
    private int numarPersoane;
    private String data;
    private String ora;

    // Atribute opționale
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    Rezervare(String numeClient, int numarPersoane, String data, String ora) {
        this.numeClient = numeClient;
        this.numarPersoane = numarPersoane;
        this.data = data;
        this.ora = ora;
        this.asezareLaGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = "Ambientala";
    }

    void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }
    void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }
    void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }
    void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }
    void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare pentru " + numeClient +
                ", " + numarPersoane + " persoane, în data de " + data +
                " la ora " + ora + "\nOpțiuni extra:" +
                "\n - Așezare la geam: " + (asezareLaGeam ? "Da" : "Nu") +
                "\n - Scaune ergonomice: " + (scauneErgonomice ? "Da" : "Nu") +
                "\n - Decorarea mesei: " + (decorareMasa ? "Da" : "Nu") +
                "\n - Muzică ambientală personalizată: " + (muzicaAmbientalaPersonalizata ? "Da" : "Nu") +
                (muzicaAmbientalaPersonalizata ? "\n - Gen muzică: " + genMuzica : "");
    }
}
