package p2.classes;

public class ClientPersoanaJuridica implements Client {
    private String nume;
    private String cui;

    public ClientPersoanaJuridica(String nume, String cui) {
        this.nume = nume;
        this.cui = cui;
    }

    @Override
    public void descriere() {
        System.out.println("Client Persoana Juridica: " + nume + ", CUI: " + cui);
    }

    @Override
    public String getNume() {
        return nume;
    }
}