package p1Builder.classes;



public class Pacient
{
    // Pacient.java

    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    private Pacient(PacientBuilder builder) {
        this.nume = builder.nume;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }

    // Getteri pentru fiecare atribut (opțional)

    public static class PacientBuilder {
        private String nume;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciCamera = false;
        private boolean halatInterior = false;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

        public PacientBuilder withPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder withMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder withPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        public PacientBuilder withHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        public Pacient build() {
            return new Pacient(this);
        }
    }
}