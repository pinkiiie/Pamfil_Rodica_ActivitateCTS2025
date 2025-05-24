package SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.classes;

import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipPantof;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipMaterial;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.interfaces.Builder;

import java.util.List;

public class PantofBuilder implements Builder {
    private Pantof pantof;

    public PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial tipMaterial) {
        this.pantof = new Pantof(tipPantof, nrPantof, dimensiuneToc, tipMaterial);
    }

    public PantofBuilder setMaterialSuplimentar(ETipMaterial materialSuplimentar) {
        pantof.addMaterial(materialSuplimentar);
        return this;
    }

    public PantofBuilder setMesajeTextSuplimentar(String mesajeTextSuplimentar) {
        pantof.addMesaj(mesajeTextSuplimentar);
        return this;
    }

    @Override
    public Pantof build() throws Exception {

        if (pantof.nrPantof < 35 || pantof.nrPantof > 45) {
            throw new Exception("Marime gresita\n");
        }

        if (pantof.dimensiuneToc < 0.5f || pantof.dimensiuneToc > 12.5f) {
            throw new Exception("Dimensiunea tocului este gresita\n");
        }


        int sumaLungimiMesaje = 0;

        for (String mesaj : pantof.listaMesajeText) {
            sumaLungimiMesaje += mesaj.length();
        }

        return this.pantof;
    }
}