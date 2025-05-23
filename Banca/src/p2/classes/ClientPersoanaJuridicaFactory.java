package p2.classes;

public class ClientPersoanaJuridicaFactory implements ClientFactory {
    @Override
    public Client createClient(String nume, String cui) {
        return new ClientPersoanaJuridica(nume, cui);
    }
}