public class DecoratorFelicitare extends DecoratorNota {
    public DecoratorFelicitare(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeaza() {
        super.printeaza(); // printare normală
        printeazaFelicitare(); // funcționalitate nouă
    }

    private void printeazaFelicitare() {
        System.out.println("La mulți ani și sărbători fericite!");
    }
}
