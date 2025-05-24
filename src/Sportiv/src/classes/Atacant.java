package classes;

public class Atacant implements Jucator {
    private String nume;

    public Atacant(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("classes.Atacant: " + nume);
    }
}