package p1Builder.main;

import p1Builder.classes.Pacient;

public class Main {
    public static void main(String[] args) {


        Pacient pacient = new Pacient.PacientBuilder("Bogdan Dima")
                .withPatRabatabil(true)
                .withMicDejunInclus(false)
                .withPapuciCamera(true)
                .withHalatInterior(true)
                .build();

        // Utilizare obiect pacient
    }


}