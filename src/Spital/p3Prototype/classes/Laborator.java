package p3Prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Laborator {
    private Map<String, Reteta> retete = new HashMap<>();

    public void adaugaReteta(String nume, Reteta reteta) {
        retete.put(nume, reteta);
    }

    public Reteta obtineReteta(String nume) throws CloneNotSupportedException {
        Reteta reteta = retete.get(nume);
        if (reteta != null) {
            return reteta.clone();
        }
        throw new IllegalArgumentException("Reteta necunoscuta.");
    }
}