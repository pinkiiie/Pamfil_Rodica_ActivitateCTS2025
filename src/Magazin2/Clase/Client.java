package Magazin2.Clase;

import Magazin2.Interfaces.IClient;

public class Client implements IClient {
    private String nume;
    private String adresa;
    private String email;



    public Client (String nume, String adresa, String email ){
        this.nume=nume;
        this.adresa=adresa;
        this.email=email;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }
}


