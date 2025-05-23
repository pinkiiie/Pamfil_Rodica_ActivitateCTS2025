package Magazin2.Clase;

import Magazin2.Interfaces.IProdus;

public class Produs implements IProdus {
    private float pret;
    private int cantitate;
    private String denumire;

    public Produs(float pret, int cantitate, String denumire) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public float getPret() {
        return this.pret;
    }

    @Override
    public int getCantitate() {
        return this.cantitate;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "pret=" + pret +
                ", cantitate=" + cantitate +
                ", denumire='" + denumire + '\'' +
                '}';


    }
}
