public class SoftNou implements  ISoftNou {

    @Override
    public void exportaFactura(ComandaBar comandaBar) {
        System.out.println("Printare factura din soft nou.");
        System.out.println("Comanda: "+ comandaBar);
    }
}
