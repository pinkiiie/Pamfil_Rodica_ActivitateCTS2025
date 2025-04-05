package SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.main;

import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.classes.Pantof;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.classes.PantofBuilder;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipPantof;
import SubPantofi.SubPantof.cts.pamfil.rodica.gr1118.builder.ennumerations.ETipMaterial;

public class ProgramBuilder {
    public static void main(String[] args) throws Exception {
        PantofBuilder pantofBuilder = new PantofBuilder(ETipPantof.GHETE, 38, 10f, ETipMaterial.PIELE_ECOLOGICA);
        Pantof pantof = pantofBuilder.build();

        PantofBuilder pantofBuilder1 = new PantofBuilder(ETipPantof.GHETE, 38, 10.25f, ETipMaterial.PIELE_INTOARSA);
        Pantof pantof1 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PANZA).setMesajeTextSuplimentar("Cu floricele").build();

        System.out.println(pantof);
        System.out.println(pantof1);

    }
}