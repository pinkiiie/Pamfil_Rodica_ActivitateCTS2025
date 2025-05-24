package p1.classes;

public class CreditNevoiPersonale implements Credit {
    private double suma;
    private double dobanda;

    public CreditNevoiPersonale(double suma, double dobanda) {
        this.suma = suma;
        this.dobanda = dobanda;
    }

    @Override
    public void descriere() {
        System.out.println("Credit de Nevoi Personale: Suma - " + suma + ", Dobanda - " + dobanda + "%");
    }

    @Override
    public double getSuma() {
        return suma;
    }

    @Override
    public double getDobanda() {
        return dobanda;
    }
}
