package p3Prototype.classes;

public class RetetaConcreta implements Reteta {
    private String nume;
    private int cantitateIngredient1;
    private int cantitateIngredient2;

    public RetetaConcreta(String nume, int cantitateIngredient1, int cantitateIngredient2) {
        this.nume = nume;
        this.cantitateIngredient1 = cantitateIngredient1;
        this.cantitateIngredient2 = cantitateIngredient2;
    }

    @Override
    public Reteta clone() throws CloneNotSupportedException {
        return (Reteta) super.clone();
    }

    @Override
    public void descriere() {
        System.out.println("Reteta: " + nume + ", Ingrediente: [" + cantitateIngredient1 + ", " + cantitateIngredient2 + "]");
    }
}
