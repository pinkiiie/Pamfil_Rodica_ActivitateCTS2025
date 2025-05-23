package p2.classes;

import java.util.HashMap;
import java.util.Map;

public class ClientRegistry {
    private Map<String, ClientFactory> registry = new HashMap<>();

    public void registerFactory(String tip, ClientFactory factory) {
        registry.put(tip, factory);
    }

    public Client createClient(String tip, String nume, String identificator) {
        ClientFactory factory = registry.get(tip);
        if (factory != null) {
            return factory.createClient(nume, identificator);
        }
        throw new IllegalArgumentException("Tip de client necunoscut: " + tip);
    }
}