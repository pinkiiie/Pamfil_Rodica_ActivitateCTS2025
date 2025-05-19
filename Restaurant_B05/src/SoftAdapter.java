
public class SoftAdapter extends SoftVechi implements ISoftNou {

    @Override
    public void exportaFactura(ComandaBar comandaBar) {
        String comandaString = String.join(", ", comandaBar.getProduse());
        this.printareFactura(comandaString);
    }
}

