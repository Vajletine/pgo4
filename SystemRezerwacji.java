import java.util.ArrayList;

    public class SystemRezerwacji {
        private ArrayList<Wydazenie> wydazenia;
        private ArrayList<Klient> klienci;

        public SystemRezerwacji() {
            wydazenia = new ArrayList<>();
            klienci = new ArrayList<>();
        }

        // Metody dodawania wydarzeń
        public void dodajWydarzenie(Wydazenie wydarzenie) {
            wydazenia.add(wydarzenie);
        }

        public void dodajWydarzenie(String nazwa, double cena) {
            wydazenia.add(new Wydazenie(nazwa, cena));
        }

        public void dodajWydarzenie(String nazwa, double cena, String data) {
            wydazenia.add(new Wydazenie(nazwa, cena, data));
        }




        public void dodajWydarzenie(String nazwa, double cena, String data, String miejsce) {
            wydazenia.add(new Wydazenie(nazwa, cena, data, miejsce));
        }

        // Metody dodawania klientów
        public void dodajKlienta(Klient klient) {
            klienci.add(klient);
        }

        public void dodajKlienta(String imie, String nazwisko, String email) {
            klienci.add(new Klient(imie, nazwisko, email));
        }

        public void dodajKlienta(String imie, String nazwisko) {
            klienci.add(new Klient(imie, nazwisko));
        }

        // Metoda dokonania rezerwacji
        public void dokonajRezerwacji(Klient klient, Wydazenie wydarzenie) {
            if (wydarzenie.getDostepneMiejsca() > 0) {
                klient.dodajRezerwacje(wydarzenie);
                System.out.println("Rezerwacja dokonana dla klienta: " + klient.getFirstName() + " " + klient.getLastName() + " na wydarzenie: " + wydarzenie.getNazwa());
            } else {
                System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
            }
        }

        // Metoda znajdź wydarzenie
        public Wydazenie znajdzWydarzenie(String nazwa) {
            for (Wydazenie wydarzenie : wydazenia) {
                if (wydarzenie.getNazwa().equals(nazwa)) {
                    return wydarzenie;
                }
            }
            return null;
        }

        // Metoda znajdź klienta
        public Klient znajdzKlienta(String nazwisko) {
            for (Klient klient : klienci) {
                if (klient.getLastName().equals(nazwisko)) {
                    return klient;
                }
            }
            return null;
        }

        // Metoda zmień cenę wydarzenia
        public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
            Wydazenie wydarzenie = znajdzWydarzenie(nazwa);
            if (wydarzenie != null) {
                wydarzenie.setCena(nowaCena);
                System.out.println("Cena wydarzenia " + nazwa + " została zmieniona na: " + nowaCena);
            } else {
                System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
            }
        }
    }




