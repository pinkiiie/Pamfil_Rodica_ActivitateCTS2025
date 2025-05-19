public class NotaDePlata implements INotaDePlata {
    private double suma;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plată: " + suma + " RON");
    }
}
