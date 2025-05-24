import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        SoftVechi softVechi = new SoftVechi();
        softVechi.printareFactura("Pizza, Paste");

        SoftNou softNou = new SoftNou();
        ComandaBar comandaBar = new ComandaBar(List.of("Cappuccino", "Ceai verde"));
        softNou.exportaFactura(comandaBar);

        SoftAdapter adapter = new SoftAdapter();
        adapter.exportaFactura(comandaBar);
    }
}