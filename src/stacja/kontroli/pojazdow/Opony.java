package stacja.kontroli.pojazdow;

import javax.swing.*;

public class Opony extends JFrame {
    public String rodzaj, marka;
    public int bieznik;

    public double cisnienie;

    public Opony(String rodzaj, String marka, int bieznik, double cisnienie) {
        this.rodzaj = rodzaj;
        this.bieznik = bieznik;
        this.marka = marka;
        this.cisnienie = cisnienie;
    }


}
