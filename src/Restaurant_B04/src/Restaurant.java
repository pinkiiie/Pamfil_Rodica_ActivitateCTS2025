import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        // Creăm un client existent
        Client clientOriginal = new Client("Ion Popescu", "ion@email.com", "0723456789");
        clientOriginal.setPreferinteCulinare(List.of("Pizza", "Sushi"));
        clientOriginal.setAlergeni(List.of("Arahide"));

        // Clientul revine la restaurant - clonăm obiectul existent
        Client clientNou = clientOriginal.clone();
        clientNou.setPreferinteCulinare(List.of("Burger", "Paste"));

        // Afișăm obiectele pentru a vedea că sunt independente
        System.out.println("Client Original: " + clientOriginal);
        System.out.println("Client Nou (Clonat): " + clientNou);
    }
}
