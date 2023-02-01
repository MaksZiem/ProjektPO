package stacja.kontroli.pojazdow;

public class Olej {
    public String marka, rodzaj, stanFiltra;
    public int ilosc, data;

    public Olej(String marka, String rodzaj, String stanFiltra, int ilosc, int data) {
        this.marka = marka;
        this.rodzaj = rodzaj;
        this.stanFiltra = stanFiltra;
        this.ilosc = ilosc;
        this.data = data;
    }
}
