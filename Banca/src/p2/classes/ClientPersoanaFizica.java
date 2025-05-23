package p2.classes;

public class ClientPersoanaFizica implements Client {
    private String nume;
    private String cnp;

    public ClientPersoanaFizica(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    @Override
    public void descriere() {
        System.out.println("Client Persoana Fizica: " + nume + ", CNP: " + cnp);
    }

    @Override
    public String getNume() {
        return nume;
    }
}
