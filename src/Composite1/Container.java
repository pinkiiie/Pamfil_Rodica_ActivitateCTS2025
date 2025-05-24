package Composite1;
import Composite1.*;
import java.util.ArrayList;
import java.util.List;

public class Container extends Nod{
private float greutateProprie;
private List<Nod> listaCopii;

    @Override
    public float getGreutate() {
        float greutateTotala=this.greutateProprie;
        if(listaCopii!=null){
            for(Nod copil:this.listaCopii){
                greutateTotala+= copil.getGreutate();
            }
        }
        return greutateTotala;
    }

    public Container(float greutateProprie){
        super();
        this.greutateProprie=greutateProprie;
        this.listaCopii=new ArrayList<Nod>();
    }

    @Override
    public boolean esteFragil() {
        if(listaCopii!=null){
            for(Nod copil:this.listaCopii){
                if(copil.esteFragil()){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void adaugaNod(Nod copil) {
        if(copil!=null&&listaCopii!=null){
            this.listaCopii.add(copil);
        }

    }

    @Override
    public void stergeNod(Nod copil) {
        if(copil!=null&&listaCopii!=null){
            this.listaCopii.remove(copil);
        }

    }

    @Override
    public Nod getCopil(int index) {
        if(listaCopii!=null&&index>0&&index<this.listaCopii.size()){
            return this.listaCopii.get(index);
        }
        return null;
    }

}
