package Magazin2.Clase;

import Magazin2.Interfaces.ICosCumparaturi;
import Magazin2.Interfaces.IProdus;

import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi implements ICosCumparaturi{
private List<IProdus> produse;
public CosCumparaturi(){ this.produse=new ArrayList<>();}

    @Override
    public void adaugaProdus(IProdus produs){ this.produse.add(produs);}

    @Override
    public double getTotal() {
        if(this.produse.isEmpty()){
            return 0.0;
        }
        double costTotal=0.0;
        for(IProdus produs:produse){
            costTotal+= produs.getCantitate()*produs.getPret();
        }
        return costTotal;
    }

    @Override
    public String toString() {
        return "CosCumparaturi{" +
                "produse=" + produse +
                '}';
    }
}
