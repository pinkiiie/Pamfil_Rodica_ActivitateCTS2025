package classes;

public class Fundas implements Jucator {
    private String nume;

    public Fundas(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("classes.Fundas: " + nume);
    }
}