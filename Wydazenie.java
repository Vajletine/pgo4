public class Wydazenie {

    private String nazwa;
    private String data;
    private String miejsc;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;


    public Wydazenie( String nazwa , double cena ) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydazenie( String nazwa , double cena , String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydazenie( String nazwa , double cena , String data , String miejsc ) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsc = miejsc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsc() {
        return miejsc;
    }

    public void setMiejsc(String miejsc) {
        this.miejsc = miejsc;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Wydazenie o nazwie " + nazwa + data + " o cenie " + cena ;
    }
    public void zarezerwujMiejsce(){
        dostepneMiejsca = dostepneMiejsca - 1;
    }
}
