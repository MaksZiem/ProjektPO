package stacja.kontroli.pojazdow;

public class Swiatla {
    public String marka;
    public int lewePoziom, prawePoziom;
    public boolean leweDziala, praweDziala;

    public Swiatla(String marka, int lewePoziom, int prawePoziom, boolean leweDziala, boolean praweDziala) {
        this.marka = marka;
        this.lewePoziom = lewePoziom;
        this.prawePoziom = prawePoziom;
        this.leweDziala = leweDziala;
        this.praweDziala = praweDziala;
    }
}
