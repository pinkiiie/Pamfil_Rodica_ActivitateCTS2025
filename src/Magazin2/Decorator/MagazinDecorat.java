package Magazin2.Decorator;

import Magazin2.Interfaces.*;

import java.util.HashMap;
import java.util.Map;

public class MagazinDecorat extends DecoratorMagazin{
 private Map<IClient, ICosCumparaturi> comenzi;

 public MagazinDecorat(IMagazin magazin){
    super(magazin);
    this.comenzi=new HashMap<>();
}

    @Override
    public void aplicaDiscount(ICosCumparaturi cos, IClient client) {
        if(this.comenzi.containsKey(client)){
            super.getTotal(cos, client);
            return;
        }

        double costTotalFaraDiscount=super.getTotal(cos,client);
        double costTotalCuDiscount=costTotalFaraDiscount-0.1*costTotalFaraDiscount;
        this.comenzi.put(client,cos);

    }

    public void afisareComenziCuDiscount(){
     for(Map.Entry<IClient, ICosCumparaturi> entry:comenzi.entrySet()){
         System.out.println(entry.getKey()+" a primit reducere pentru: "+entry.getValue());
     }
    }
}
