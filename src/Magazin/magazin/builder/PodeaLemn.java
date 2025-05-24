package magazin.builder;

public class PodeaLemn implements IPodea {
    private float duritate;

    public PodeaLemn(float duritate){
        super();
        this.duritate=duritate;
    }
    public float getDuritate(){
        return this.duritate;
    }

    public String toString(){
        return "PodeaLemn [duritate="+duritate+"]";
    }
}
