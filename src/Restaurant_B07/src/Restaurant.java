public class Restaurant {
    public static void main(String[] args) {
        INotaDePlata nota = new NotaDePlata(120.5);
        INotaDePlata notaCuFelicitare = new DecoratorFelicitare(nota);

        notaCuFelicitare.printeaza();
    }
}