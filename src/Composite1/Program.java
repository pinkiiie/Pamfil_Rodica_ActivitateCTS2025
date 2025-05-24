package Composite1;

public class Program {
    public static void main(String[] args){
        Nod container=new Container(220);
        Nod cutie1=new Container(10);
        Nod cutie2=new Container(30);
        container.adaugaNod(cutie1);
        container.adaugaNod(cutie2);

        cutie1.adaugaNod(new Colet(2, false));
        cutie2.adaugaNod(new Colet(3,true));
    System.out.println(container.getGreutate());
    System.out.println(container.esteFragil());

    }

}
