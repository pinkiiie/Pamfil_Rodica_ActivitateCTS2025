import java.util.ArrayList;
import java.util.List;

public class Client implements Cloneable {
    private String nume;
    private String email;
    private String telefon;
    private List<String> preferinteCulinare;
    private List<String> alergeni;

    public Client(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    public void setPreferinteCulinare(List<String> preferinteCulinare) {
        this.preferinteCulinare = new ArrayList<>(preferinteCulinare);
    }

    public void setAlergeni(List<String> alergeni) {
        this.alergeni = new ArrayList<>(alergeni);
    }

    @Override
    public Client clone()  {
        try {
            Client clientClonat = (Client) super.clone();
//          vers 1 de copiere liste
//          pentru ca sunt liste de string se asigaura deep copy
            clientClonat.preferinteCulinare = new ArrayList<>(this.preferinteCulinare);
            clientClonat.alergeni = new ArrayList<>(this.alergeni);

//          vers 2 de copiere liste -
//          face deep copy pt ca avem o lista de string,
//          altfel daca era o lista de obiecte se facea shallow copy
//          clientClonat.preferinteCulinare = List.copyOf(this.preferinteCulinare);
//          clientClonat.alergeni = List.copyOf(this.alergeni);

//          vers 3 de copiere liste
//          la fel ca in versiunea 2 cu mentiunea ca:
//          List.copyOf() creează o copie imutabilă, pe când
//          addAll() creează o copie mutabilă.
//          clientClonat.preferinteCulinare.addAll(this.preferinteCulinare);
//          clientClonat.alergeni.addAll(this.alergeni);

//          daca avem lista de obiecte atunci folosim un for loop
//          si clonam fiecare obiect din lista

            return clientClonat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", preferinte=" + preferinteCulinare +
                ", alergeni=" + alergeni +
                '}';
    }
}
