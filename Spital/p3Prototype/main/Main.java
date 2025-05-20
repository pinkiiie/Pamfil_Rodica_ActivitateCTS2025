package p3Prototype.main;

import p3Prototype.classes.Laborator;
import p3Prototype.classes.Reteta;
import p3Prototype.classes.RetetaConcreta;

public class Main {
    public static void main(String[] args) {
        Laborator laborator = new Laborator();

        Reteta reteta1 = new RetetaConcreta("Reteta1", 50, 100);
        laborator.adaugaReteta("Reteta1", reteta1);

        try {
            Reteta retetaClonata1 = laborator.obtineReteta("Reteta1");
            retetaClonata1.descriere();

            // Adăugăm și folosim o altă rețetă
            Reteta reteta2 = new RetetaConcreta("Reteta2", 30, 70);
            laborator.adaugaReteta("Reteta2", reteta2);

            Reteta retetaClonata2 = laborator.obtineReteta("Reteta2");
            retetaClonata2.descriere();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
