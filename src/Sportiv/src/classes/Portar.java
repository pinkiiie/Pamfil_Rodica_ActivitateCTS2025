package classes;

public class Portar implements Jucator {
    private String nume;

    public Portar(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("classes.Portar: " + nume);
    }
}