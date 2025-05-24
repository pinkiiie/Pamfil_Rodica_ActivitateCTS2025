package p2.classes;

public class ClientPersoanaFizicaFactory implements ClientFactory {
    @Override
    public Client createClient(String nume, String cnp) {
        return new ClientPersoanaFizica(nume, cnp);
    }
}