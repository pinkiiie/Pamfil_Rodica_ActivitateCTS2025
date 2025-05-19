import java.util.List;

public class ComandaBar {

    private List<String> produse;

    public ComandaBar(List<String> produse) {
        this.produse = produse;
    }

    public List<String> getProduse() {
        return produse;
    }

    @Override
    public String toString() {
        return String.join(", ", produse);
    }
}
