package Composite1;

public abstract class Nod {

    public abstract float getGreutate();
    public abstract boolean esteFragil();

    public abstract void adaugaNod(Nod copil);
    public abstract void stergeNod(Nod copil);
    public abstract Nod getCopil(int index);

}
