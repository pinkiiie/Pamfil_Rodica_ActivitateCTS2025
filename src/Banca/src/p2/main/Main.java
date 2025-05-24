package p2.main;

import p2.classes.*;

public class Main {
    public static void main(String[] args) {
        ClientRegistry clientRegistry = new ClientRegistry();

        clientRegistry.registerFactory("fizica", new ClientPersoanaFizicaFactory());
        clientRegistry.registerFactory("juridica", new ClientPersoanaJuridicaFactory());

        Client clientFizic = clientRegistry.createClient("fizica", "Ion Popescu", "1234567890123");
        Client clientJuridic = clientRegistry.createClient("juridica", "Firma SRL", "RO12345678");

        clientFizic.descriere();
        clientJuridic.descriere();

        // Adăugarea unui nou tip de client la runtime
        clientRegistry.registerFactory("vip", new ClientFactory() {
            @Override
            public Client createClient(String nume, String identificator) {
                return new Client() {
                    @Override
                    public void descriere() {
                        System.out.println("Client VIP: " + nume + ", ID: " + identificator);
                    }

                    @Override
                    public String getNume() {
                        return nume;
                    }
                };
            }
        });

        Client clientVIP = clientRegistry.createClient("vip", "VIP Client", "VIP001");
        clientVIP.descriere();
    }
}