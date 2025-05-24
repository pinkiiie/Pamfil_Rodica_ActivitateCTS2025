public abstract class DecoratorNota implements INotaDePlata {
    protected INotaDePlata nota;

    public DecoratorNota(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza(); // comportamentul original
    }
}

