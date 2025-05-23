package Magazin2.Decorator;

import Magazin2.Interfaces.*;

public abstract class DecoratorMagazin implements IMagazin{
    protected IMagazin magazin;

   public DecoratorMagazin(IMagazin magazin){ this.magazin=magazin;}

    @Override
    public double getTotal(ICosCumparaturi cos, IClient client) {
        return magazin.getTotal(cos, client);
    }
    public abstract void aplicaDiscount(ICosCumparaturi cos, IClient client);

}
