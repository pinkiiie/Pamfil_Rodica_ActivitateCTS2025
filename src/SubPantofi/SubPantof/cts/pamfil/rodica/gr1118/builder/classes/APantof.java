package SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.classes;

import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipPantof;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipMaterial;

import java.util.List;

public abstract class APantof {
	protected ETipPantof tipPantof;
	protected int nrPantof;
	protected float dimensiuneToc;
	protected ETipMaterial material;
	protected List<ETipMaterial> materialeSuplimentare;
	protected List<String> listaMesajeText;
	
	public abstract float calculPret();
	protected abstract void addMesaj(String mesaj);
	protected abstract void addMaterial(ETipMaterial tipMaterial);
}
