package p1.classes;

public class CreditIpotecar implements Credit{
    private double suma;
    private double dobanda;

    public CreditIpotecar(double suma, double dobanda) {
        this.suma = suma;
        this.dobanda = dobanda;
    }

    @Override
    public void descriere() {
        System.out.println("Credit Ipotecar: Suma - " + suma + ", Dobanda - " + dobanda + "%");
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
