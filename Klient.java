import java.util.ArrayList;

public class Klient {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Wydazenie> listaRezerwacji;



    public Klient(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }
    public Klient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void dodajRezerwacje(Wydazenie wydazenie){
        listaRezerwacji.add(wydazenie);
    }
    public void wyswietlRezerwacje(){

        for (int i = 0; i < listaRezerwacji.size(); i++) {
            System.out.println(listaRezerwacji.get(i));
        }
        //problem
    }
    public void anulujRezerwacje(Wydazenie wydazenie){
        if (listaRezerwacji.contains(wydazenie)) {
            listaRezerwacji.remove(wydazenie);
            System.out.println("Anulowano rezerwację na wydarzenie: " + wydazenie.getNazwa());
        } else {
            System.out.println("Brak rezerwacji na wydarzenie: " + wydazenie.getNazwa());
        }
    }

}
