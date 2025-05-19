public class Restaurant {
    public static void main(String[] args) {
        RezervareBuilder rBuilder = new RezervareBuilder("John Doe", 2, "22.03.2025", "15:00");
        Rezervare rezervare1 = rBuilder.build();
        System.out.println(rezervare1);

        RezervareBuilder rBuilder2 = new RezervareBuilder("Chris Doe", 4, "25.03.2025", "12:00");
        Rezervare rezervare2 = rBuilder2.setDecorareMasa(true)
                .setMuzicaAmbientala(true, "jazz")
                .build();
        System.out.println(rezervare2);

    }
}
