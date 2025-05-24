package Composite1;

public class Colet extends Nod{
    private float greutate;
    private boolean esteFragil;

    public Colet(float greutate, boolean esteFragil) {
        this.greutate = greutate;
        this.esteFragil = esteFragil;
    }


    @Override
    public float getGreutate() {
        return this.greutate;
    }

    @Override
    public boolean esteFragil() {
        return this.esteFragil;
    }


    @Override
    public void adaugaNod(Nod copil) {
        throw new UnsupportedOperationException("Nu se poate adauga un colet");

    }

    @Override
    public void stergeNod(Nod copil) {
        throw new UnsupportedOperationException("Nu se poate sterge");

    }

    @Override
    public Nod getCopil(int index) {
        throw new UnsupportedOperationException("Nu se poate obtine un colet");
    }
}
