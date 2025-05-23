package Magazin2.Main;

import Magazin2.Interfaces.*;
import Magazin2.Decorator.*;
import Magazin2.Clase.*;

public class MainDecorator {
    public static void main(String[] args){
        IClient client1= new Client("Elena","Buftea", "elena@yahoo.com");
        IClient client2= new Client("Ion", "Ploiesti", "ion@gmail.com");

        ICosCumparaturi Cos1=new CosCumparaturi();
        ICosCumparaturi Cos2=new CosCumparaturi();
        ICosCumparaturi Cos3=new CosCumparaturi();

       Cos1.adaugaProdus(new Produs(12,2,"apa"));
       Cos1.adaugaProdus(new Produs(2,7,"Pepsi"));

        Cos2.adaugaProdus(new Produs(3, 4,"Corn"));

        IMagazin magazin=new Magazin();
        DecoratorMagazin magazinDecorat=new MagazinDecorat(magazin);
        magazinDecorat.aplicaDiscount(Cos1, client1);

    }




}
