package stacja.kontroli.pojazdow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main extends JFrame {
    public String model, marka, kolor, paliwo;
    public int rocznik, przebieg;
    private JPanel panelMain;
    private JTabbedPane tabbedPane1;
    private JLabel markaOut;
    private JPanel LG;
    private JPanel PG;
    private JPanel PD;
    private JPanel LD;
    private JLabel outOp1;
    private JLabel outOp2;
    private JLabel outOp3;
    private JLabel outOp4;
    private JList list1;
    private JButton edytujButton;
    private JButton zatwierdzButton;
    private JProgressBar olejProgressBar;
    private JButton wylejButton;
    private JButton dolejButton;
    private JLabel olejDataOut;
    private JLabel olejMarkaOut;
    private JLabel olejRodzajOut;
    private JLabel olejFilterOut;
    private JButton wymienButton;
    private JButton zatwierdzButton1;
    public JLabel sumaOut;
    private JLabel intPodsumowanie;
    private JSlider slider1;
    private JSlider slider2;
    private JCheckBox dzialaCheckBox;
    private JCheckBox dzialaCheckBox1;
    private JLabel markaPraweOut;
    private JLabel markaLeweOut;
    private JLabel procentLewe;
    private JLabel procentPrawe;
    private JButton edytujButton1;
    private JButton zatwierdzButton2;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JProgressBar progressBar4;
    private JProgressBar progressBar5;
    private JProgressBar progressBar6;
    private JProgressBar progressBar7;
    private JProgressBar progressBar8;
    private JProgressBar progressBar9;
    private JProgressBar progressBar10;
    private JButton plus1;
    private JButton minus1;
    private JButton plus2;
    private JButton minus2;
    private JButton plus3;
    private JButton minus3;
    private JButton plus4;
    private JButton minus4;
    private JButton plus5;
    private JButton minus5;
    private JButton plus6;
    private JButton minus6;
    private JButton plus7;
    private JButton minus7;
    private JButton plus8;
    private JButton minus8;
    private JButton plus9;
    private JButton minus9;
    private JButton plus10;
    private JButton minus10;
    private JLabel outSumaTuning;
    private JButton zatwierdzButton3;
    private JLabel summary;
    private JButton zaplacButton;
    private JPanel panelAuto;
    private JLabel pgLabel;
    private JLabel pdLabel;
    private JLabel autoTop;
    private JLabel lgLabel;
    private JLabel ldLabel;
    private JLabel swiatloLewe;
    private JLabel swiatloPrawe;
    private JLabel paliwoOut;
    private JLabel lgOut;
    private JLabel pgOut;
    private JLabel ldOut;
    private JLabel pdOut;
    private JLabel olejOutSum;
    private JLabel swiatlaOutSum;
    private JLabel rocznikOut;
    private JLabel kolorOut;
    private JLabel przebiegOut;
    private JLabel modelOut;
    private JPanel leweSwiatloKolor;
    private JPanel praweSwiatloKolor;
    private JButton sprawdzButton;
    private JButton zatwierdzButton4;
    private JProgressBar progressBar11;
    private JProgressBar progressBar12;
    private JProgressBar progressBar13;
    private JProgressBar progressBar14;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JComboBox comboBox2;
    private JTextField textField3;
    private JComboBox comboBox3;
    private JTextField textField4;
    private JComboBox comboBox4;
    private JButton zmienButton;
    private JButton zmienButton1;
    private JButton zmienButton2;
    private JButton zmienButton3;
    private JLabel klocek1;
    private JLabel klocek2;
    private JLabel klocek3;
    private JLabel klocek4;
    private JButton sprawdzButton1;
    private JButton zatwierdzButton5;
    private JPanel klocek1Out;
    private JPanel klocek2Out;
    private JPanel klocek3Out;
    private JPanel klocek4Out;
    private JLabel olejIconOut;
    private JLabel markaOut2;
    private JLabel paliwoOut2;
    public int sumaTuning;
    public int sumaSwiatla;
    public int sumaOpony;
    public int sumaOlej;
    public int sumaHamulce;
    public int sumaAll;
    public int index;
    public int index5 = 0;
    public int min = 1;
    public int max = 100;
    public int iloscOleju;
    public String text = "";
    public String textNote = "";
    protected static ArrayList<Integer> swiatlaCeny = new ArrayList<>();
    protected static ArrayList<Integer> olejCeny = new ArrayList<>();
    protected static ArrayList<Integer> ceny = new ArrayList<>();
    protected static ArrayList<Opony> oponki = new ArrayList<>();
    protected static ArrayList<Olej> olejki = new ArrayList<>();
    protected static ArrayList<Swiatla> swiatla = new ArrayList<>();


    public Main(String marka, String model, String kolor, String paliwo, int rocznik, int przebieg) {
        super("glowny panel");
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.paliwo = paliwo;
        this.rocznik = rocznik;
        this.przebieg = przebieg;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.setSize(600,600);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("car-repair.png");
        this.setIconImage(icon.getImage());



        ImageIcon castrol = new ImageIcon("castrol.jpg");
        ImageIcon mobil = new ImageIcon("mobil.jpg");
        ImageIcon total = new ImageIcon("total.jpg");
        olejIconOut.setIcon(castrol);

        DefaultListModel modelOpona = new DefaultListModel<String>();



        if (this.kolor.equals("Niebieski")){
            panelAuto.setBackground(Color.BLUE);
        } else if (this.kolor.equals("Zielony")) {
            panelAuto.setBackground(Color.GREEN);
        } else if (this.kolor.equals("Czerwony")) {
            panelAuto.setBackground(Color.RED);
        } else if (this.kolor.equals("Bialy")) {
            panelAuto.setBackground(Color.WHITE);
        }

        markaOut2.setText(marka);
        paliwoOut2.setText(paliwo);
        modelOut.setText(model);
        rocznikOut.setText(String.valueOf(rocznik));
        przebiegOut.setText(String.valueOf(przebieg));
        kolorOut.setText(kolor);

        ImageIcon iconOponaPrawa = new ImageIcon("tire2.png");
        ImageIcon iconOponaLewa = new ImageIcon("tire2lewa.png");

        pgLabel.setIcon(iconOponaPrawa);
        pdLabel.setIcon(iconOponaPrawa);
        lgLabel.setIcon(iconOponaLewa);
        ldLabel.setIcon(iconOponaLewa);
        int range = max - min + 1;

        ImageIcon iconCarTop = new ImageIcon("car-top-view8.png");
        autoTop.setIcon(iconCarTop);

        ImageIcon swiatloLeweIcon = new ImageIcon("car-light-lewe.png");
        swiatloLewe.setIcon(swiatloLeweIcon);

        ImageIcon swiatloPraweIcon = new ImageIcon("car-light-prawe.png");
        swiatloPrawe.setIcon(swiatloPraweIcon);

        ImageIcon vwLogo = new ImageIcon("vwLogo.png");
        ImageIcon mercLogo = new ImageIcon("mercedesLogo.png");
        ImageIcon bmwLogo = new ImageIcon("bmwLogo.png");

        if (this.marka.equals("Volkswagen")){
            markaOut.setIcon(vwLogo);
        } else if (this.marka.equals("Mercedes")) {
            markaOut.setIcon(mercLogo);
        } else if (this.marka.equals("BMW")) {
            markaOut.setIcon(bmwLogo);
        }



        ImageIcon benzyna = new ImageIcon("benzyna.png");
        ImageIcon diesel = new ImageIcon("diesel.png");
        ImageIcon gas = new ImageIcon("gas.png");
        ImageIcon prad = new ImageIcon("prad.png");


        if (this.paliwo.equals("Benzyna")){
            paliwoOut.setIcon(benzyna);
        } else if (this.paliwo.equals("Diesel")) {
           paliwoOut.setIcon(diesel);
        } else if (this.paliwo.equals("Gaz")) {
            paliwoOut.setIcon(gas);
        } else if (this.paliwo.equals("Prad")) {
            paliwoOut.setIcon(prad);
        }

        ImageIcon hamulce = new ImageIcon("break2.png");
        klocek1.setIcon(hamulce);
        klocek2.setIcon(hamulce);
        klocek3.setIcon(hamulce);
        klocek4.setIcon(hamulce);

        Random r = new Random();



        Opony opona1 = new Opony("letnie", "Continental", (int)(Math.random()*range)+min, roundToDecimal(3*r.nextDouble(), 1));
        Opony opona2 = new Opony("letnie", "Continental", (int)(Math.random()*range)+min, roundToDecimal(3*r.nextDouble(), 1));
        Opony opona3 = new Opony("letnie", "Continental", (int)(Math.random()*range)+min, roundToDecimal(3*r.nextDouble(), 1));
        Opony opona4 = new Opony("letnie", "Continental", (int)(Math.random()*range)+min, roundToDecimal(3*r.nextDouble(), 1));


        oponki.add(opona1);
        oponki.add(opona2);
        oponki.add(opona3);
        oponki.add(opona4);

        modelOpona.addElement("Opona 1");
        modelOpona.addElement("Opona 2");
        modelOpona.addElement("Opona 3");
        modelOpona.addElement("Opona 4");

        list1.setModel(modelOpona);



        outOp1.setText("<html>"+oponki.get(0).rodzaj+"<br>"+oponki.get(0).marka+"<br>"+oponki.get(0).bieznik+"<br>"+oponki.get(0).cisnienie+"</html> ");
        outOp2.setText("<html>"+oponki.get(1).rodzaj+"<br>"+oponki.get(1).marka+"<br>"+oponki.get(1).bieznik+"<br>"+oponki.get(1).cisnienie+"</html> ");
        outOp3.setText("<html>"+oponki.get(2).rodzaj+"<br>"+oponki.get(2).marka+"<br>"+oponki.get(2).bieznik+"<br>"+oponki.get(2).cisnienie+"</html> ");
        outOp4.setText("<html>"+oponki.get(3).rodzaj+"<br>"+oponki.get(3).marka+"<br>"+oponki.get(3).bieznik+"<br>"+oponki.get(3).cisnienie+"</html> ");

//        lgOut.setText("<html>"+oponki.get(0).rodzaj+", "+oponki.get(0).marka+"<br></html> ");
//        pgOut.setText("<html>"+oponki.get(1).rodzaj+", "+oponki.get(1).marka+"<br></html> ");
//        pdOut.setText("<html>"+oponki.get(2).rodzaj+", "+oponki.get(2).marka+"<br></html> ");
//        ldOut.setText("<html>"+oponki.get(3).rodzaj+", "+oponki.get(3).marka+"<br></html> ");




        if (oponki.get(0).bieznik <=25){
            LG.setBackground(Color.red);
        } else if (oponki.get(0).bieznik <=50 &&  oponki.get(0).bieznik > 25) {
            LG.setBackground(Color.orange);
        } else if (oponki.get(0).bieznik <=75 && oponki.get(0).bieznik >50) {
            LG.setBackground(Color.YELLOW);
        } else {
            LG.setBackground(Color.GREEN);
        }

        if (oponki.get(1).bieznik <=25){
            PG.setBackground(Color.red);
        } else if (oponki.get(1).bieznik <=50 &&  oponki.get(1).bieznik > 25) {
            PG.setBackground(Color.orange);
        } else if (oponki.get(1).bieznik <=75 && oponki.get(1).bieznik >50) {
            PG.setBackground(Color.YELLOW);
        } else {
            PG.setBackground(Color.GREEN);
        }

        if (oponki.get(2).bieznik <=25){
            PD.setBackground(Color.red);
        } else if (oponki.get(2).bieznik <=50 &&  oponki.get(2).bieznik > 25) {
            PD.setBackground(Color.orange);
        } else if (oponki.get(2).bieznik <=75 && oponki.get(2).bieznik >50) {
            PD.setBackground(Color.YELLOW);
        } else {
            PD.setBackground(Color.GREEN);
        }

        if (oponki.get(3).bieznik <=25){
            LD.setBackground(Color.red);
        } else if (oponki.get(3).bieznik <=50 &&  oponki.get(3).bieznik > 25) {
            LD.setBackground(Color.orange);
        } else if (oponki.get(3).bieznik <=75 && oponki.get(3).bieznik >50) {
            LD.setBackground(Color.YELLOW);
        } else {
            LD.setBackground(Color.GREEN);
        }




        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = list1.getSelectedIndex();
            }
        });


        edytujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editOpony run = new editOpony(index);
                run.run(index);
            }
        });

        zatwierdzButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lgOut.setText("<html>"+oponki.get(0).rodzaj+", "+oponki.get(0).marka+"<br></html> ");
                pgOut.setText("<html>"+oponki.get(1).rodzaj+", "+oponki.get(1).marka+"<br></html> ");
                pdOut.setText("<html>"+oponki.get(2).rodzaj+", "+oponki.get(2).marka+"<br></html> ");
                ldOut.setText("<html>"+oponki.get(3).rodzaj+", "+oponki.get(3).marka+"<br></html> ");

                sumaOpony=0;

                for (int i = index5; i < ceny.size(); i++) {
                    if (ceny.get(i)>0){
                        sumaOpony+= ceny.get(i);
                        text+="<html> 300zl - opona <br><html>";
                        textNote+="300zl - opona\n";
                        index5++;
                    }
                }

                sumaAll += sumaOpony;
                intPodsumowanie.setText(String.valueOf(sumaAll));
                summary.setText(text);

                zatwierdzButton4.setEnabled(false);
            }
        });

        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oponki.get(0).cisnienie == oponki.get(1).cisnienie && oponki.get(3).cisnienie == oponki.get(2).cisnienie && oponki.get(0).bieznik>75 && oponki.get(1).bieznik>75 && oponki.get(2).bieznik>75 && oponki.get(3).bieznik> 75){
                    zatwierdzButton4.setEnabled(true);
                }
            }
        });

        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outOp1.setText("<html>"+oponki.get(0).rodzaj+"<br>"+oponki.get(0).marka+"<br>"+oponki.get(0).bieznik+"<br>"+oponki.get(0).cisnienie+"</html> ");
                outOp2.setText("<html>"+oponki.get(1).rodzaj+"<br>"+oponki.get(1).marka+"<br>"+oponki.get(1).bieznik+"<br>"+oponki.get(1).cisnienie+"</html> ");
                outOp3.setText("<html>"+oponki.get(2).rodzaj+"<br>"+oponki.get(2).marka+"<br>"+oponki.get(2).bieznik+"<br>"+oponki.get(2).cisnienie+"</html> ");
                outOp4.setText("<html>"+oponki.get(3).rodzaj+"<br>"+oponki.get(3).marka+"<br>"+oponki.get(3).bieznik+"<br>"+oponki.get(3).cisnienie+"</html> ");




                if (oponki.get(0).bieznik <=25){
                    LG.setBackground(Color.red);
                } else if (oponki.get(0).bieznik <=50 &&  oponki.get(0).bieznik > 25) {
                    LG.setBackground(Color.orange);
                } else if (oponki.get(0).bieznik <=75 && oponki.get(0).bieznik >50) {
                    LG.setBackground(Color.YELLOW);
                } else {
                    LG.setBackground(Color.GREEN);
                }

                if (oponki.get(1).bieznik <=25){
                    PG.setBackground(Color.red);
                } else if (oponki.get(1).bieznik <=50 &&  oponki.get(1).bieznik > 25) {
                    PG.setBackground(Color.orange);
                } else if (oponki.get(1).bieznik <=75 && oponki.get(1).bieznik >50) {
                    PG.setBackground(Color.YELLOW);
                } else {
                    PG.setBackground(Color.GREEN);
                }

                if (oponki.get(2).bieznik <=25){
                    PD.setBackground(Color.red);
                } else if (oponki.get(2).bieznik <=50 &&  oponki.get(2).bieznik > 25) {
                    PD.setBackground(Color.orange);
                } else if (oponki.get(2).bieznik <=75 && oponki.get(2).bieznik >50) {
                    PD.setBackground(Color.YELLOW);
                } else {
                    PD.setBackground(Color.GREEN);
                }

                if (oponki.get(3).bieznik <=25){
                    LD.setBackground(Color.red);
                } else if (oponki.get(3).bieznik <=50 &&  oponki.get(3).bieznik > 25) {
                    LD.setBackground(Color.orange);
                } else if (oponki.get(3).bieznik <=75 && oponki.get(3).bieznik >50) {
                    LD.setBackground(Color.YELLOW);
                } else {
                    LD.setBackground(Color.GREEN);
                }

            }
        });




        Olej olej1 = new Olej("Castrol", "Syntetyczny", "dobry",(int)(Math.random()*range)+min, 2);

        olejki.add(olej1);

        olejMarkaOut.setText(olejki.get(0).marka);
        olejRodzajOut.setText(olejki.get(0).rodzaj);
        olejFilterOut.setText(olejki.get(0).stanFiltra);
        olejDataOut.setText(String.valueOf(olejki.get(0).data));

        olejOutSum.setText(olej1.marka+", "+olej1.rodzaj);

        if (olej1.ilosc<60){
            olejProgressBar.setForeground(Color.red);
        }
        else {
            olejProgressBar.setForeground(Color.GREEN);
        }
        olejProgressBar.setStringPainted(true);
        olejProgressBar.setValue(olej1.ilosc);


        iloscOleju = olej1.ilosc;

        Timer t1 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                olejProgressBar.setValue(iloscOleju);
                iloscOleju+=2;
            }
        });

        Timer t2 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                olejProgressBar.setValue(iloscOleju);
                iloscOleju-=2;
            }
        });


        wylejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.start();
                wymienButton.setEnabled(true);
            }
        });
        dolejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        wymienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.stop();
                editOlej.run();
            }
        });
        zatwierdzButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (olejki.get(0).marka.equals("Castrol")){
                    olejIconOut.setIcon(castrol);
                } else if (olejki.get(0).marka.equals("M0bil")) {
                    olejIconOut.setIcon(mobil);
                } else if (olejki.get(0).marka.equals("Total")) {
                    olejIconOut.setIcon(total);
                }

                olejMarkaOut.setText(olejki.get(0).marka);
                olejRodzajOut.setText(olejki.get(0).rodzaj);
                olejFilterOut.setText(olejki.get(0).stanFiltra);
                olejDataOut.setText(String.valueOf(olejki.get(0).data));
                olejProgressBar.setValue(olejki.get(0).ilosc);

                sumaOlej = 0;

                for (int i = 0; i < olejCeny.size(); i++) {
                    sumaOlej+=olejCeny.get(i);

                }
                olejOutSum.setText(olejki.get(0).marka+", "+olejki.get(0).rodzaj);
                text+="<html>"+sumaOlej+"zl - olej<br><html>";
                textNote+=sumaOlej+"zl - olej\n";
                sumaAll+=sumaOlej;
                intPodsumowanie.setText(String.valueOf(sumaAll));
                summary.setText(text);
                olejProgressBar.setForeground(Color.GREEN);
            }
        });

        Hamulce hamulec1 = new Hamulce("Bosch","Ceramiczne",(int)(Math.random()*range)+min);
        Hamulce hamulec2 = new Hamulce("Bosch", "Ceramiczne", (int)(Math.random()*range)+min);
        Hamulce hamulec3 = new Hamulce("Bosch", "Ceramiczne", (int)(Math.random()*range)+min);
        Hamulce hamulec4 = new Hamulce("Bosch", "Ceramiczne", (int)(Math.random()*range)+min);

        comboBox1.addItem(hamulec1.rodzaj);
        comboBox1.addItem("Metaliczne");
        comboBox1.addItem("Organiczne");
        textField1.setText(hamulec1.marka);
        progressBar11.setValue(hamulec1.poziomStarcia);
        progressBar11.setStringPainted(true);
        if (hamulec1.poziomStarcia>50){
            progressBar11.setForeground(Color.red);
            klocek1Out.setBackground(Color.red);
        } else {
            progressBar11.setForeground(Color.green);
            klocek1Out.setBackground(Color.green);
        }

        comboBox2.addItem(hamulec2.rodzaj);
        comboBox2.addItem("Metaliczne");
        comboBox2.addItem("Organiczne");
        textField2.setText(hamulec2.marka);
        progressBar12.setValue(hamulec2.poziomStarcia);
        progressBar12.setStringPainted(true);
        if (hamulec2.poziomStarcia>50){
            progressBar12.setForeground(Color.red);
            klocek2Out.setBackground(Color.red);
        } else {
            progressBar12.setForeground(Color.green);
            klocek2Out.setBackground(Color.green);
        }

        comboBox3.addItem(hamulec3.rodzaj);
        comboBox3.addItem("Metaliczne");
        comboBox3.addItem("Organiczne");
        textField3.setText(hamulec3.marka);
        progressBar13.setValue(hamulec3.poziomStarcia);
        progressBar13.setStringPainted(true);
        if (hamulec3.poziomStarcia>50){
            progressBar13.setForeground(Color.red);
            klocek3Out.setBackground(Color.red);
        } else {
            progressBar13.setForeground(Color.green);
            klocek3Out.setBackground(Color.green);
        }

        comboBox4.addItem(hamulec4.rodzaj);
        comboBox4.addItem("Metaliczne");
        comboBox4.addItem("Organiczne");
        textField4.setText(hamulec4.marka);
        progressBar14.setValue(hamulec4.poziomStarcia);
        progressBar14.setStringPainted(true);
        if (hamulec4.poziomStarcia>50){
            progressBar14.setForeground(Color.red);
            klocek4Out.setBackground(Color.red);
        } else {
            progressBar14.setForeground(Color.green);
            klocek4Out.setBackground(Color.green);
        }

        zmienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaHamulce=0;
                hamulec1.poziomStarcia = 0;
                hamulec1.marka = textField1.getText();
                hamulec1.rodzaj = comboBox1.getSelectedItem().toString();

                progressBar11.setValue(hamulec1.poziomStarcia);
                klocek1Out.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "dodano 200zl do rachunku");
                sumaHamulce+=200;
                sumaAll+=sumaHamulce;
                text+="<html>"+200+"zl - hamulce<br><html>";
                textNote+=200+"zl - olej\n";
            }
        });
        zmienButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaHamulce=0;
                hamulec2.poziomStarcia = 0;
                hamulec2.marka = textField2.getText();
                hamulec2.rodzaj = comboBox2.getSelectedItem().toString();

                progressBar12.setValue(hamulec2.poziomStarcia);
                klocek2Out.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "dodano 200zl do rachunku");
                sumaHamulce+=200;
                sumaAll+=sumaHamulce;
                text+="<html>"+200+"zl - hamulce<br><html>";
                textNote+=200+"zl - olej\n";
            }
        });
        zmienButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaHamulce=0;
                hamulec3.poziomStarcia = 0;
                hamulec3.marka = textField3.getText();
                hamulec3.rodzaj = comboBox3.getSelectedItem().toString();

                progressBar13.setValue(hamulec3.poziomStarcia);
                klocek3Out.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "dodano 200zl do rachunku");
                sumaHamulce+=200;
                sumaAll+=sumaHamulce;
                text+="<html>"+200+"zl - hamulce<br><html>";
                textNote+=200+"zl - olej\n";
            }
        });
        zmienButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaHamulce=0;
                hamulec4.poziomStarcia = 0;
                hamulec4.marka = textField4.getText();
                hamulec4.rodzaj = comboBox4.getSelectedItem().toString();

                progressBar14.setValue(hamulec4.poziomStarcia);
                klocek4Out.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "dodano 200zl do rachunku");
                sumaHamulce+=200;
                sumaAll+=sumaHamulce;
                text+="<html>"+200+"zl - hamulce<br><html>";
                textNote+=200+"zl - olej\n";
            }
        });

        sprawdzButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hamulec1.poziomStarcia<50 && hamulec2.poziomStarcia<50 && hamulec3.poziomStarcia<50 && hamulec4.poziomStarcia<50 && hamulec1.rodzaj.equals(hamulec2.rodzaj) && hamulec3.rodzaj.equals(hamulec4.rodzaj)){
                    zatwierdzButton5.setEnabled(true);
                }
            }
        });

        zatwierdzButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intPodsumowanie.setText(String.valueOf(sumaAll));
                summary.setText(text);

            }
        });

        Swiatla swiatla1 = new Swiatla("Bosch", (int)(Math.random()*range)+min, (int)(Math.random()*range)+min, true, false);

        swiatla.add(swiatla1);

        if (swiatla1.leweDziala){
            leweSwiatloKolor.setBackground(Color.YELLOW);
        } else {
            leweSwiatloKolor.setBackground(Color.DARK_GRAY);
        }

        if (swiatla1.praweDziala){
            praweSwiatloKolor.setBackground(Color.YELLOW);
        } else {
            praweSwiatloKolor.setBackground(Color.DARK_GRAY);
        }

        swiatlaOutSum.setText(swiatla.get(0).marka);

        markaLeweOut.setText(swiatla.get(0).marka);
        markaPraweOut.setText(swiatla.get(0).marka);

        slider1.setPaintTrack(true);
        slider1.setMajorTickSpacing(10);
        slider1.setPaintLabels(true);
        slider1.setValue(swiatla.get(0).lewePoziom);

        slider2.setPaintTrack(true);
        slider2.setMajorTickSpacing(10);
        slider2.setPaintLabels(true);
        slider2.setValue(swiatla.get(0).prawePoziom);

        if (swiatla.get(0).leweDziala){
            dzialaCheckBox.setSelected(true);
        } else {
            dzialaCheckBox.setSelected(false);
        }

        if (swiatla.get(0).praweDziala){
            dzialaCheckBox1.setSelected(true);
        } else {
            dzialaCheckBox1.setSelected(false);
        }


        procentLewe.setText(String.valueOf(swiatla.get(0).lewePoziom));
        procentPrawe.setText(String.valueOf(swiatla.get(0).prawePoziom));

        edytujButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editSwiatla.run();
            }
        });
        zatwierdzButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (swiatla.get(0).leweDziala){
                    leweSwiatloKolor.setBackground(Color.YELLOW);
                } else {
                    leweSwiatloKolor.setBackground(Color.DARK_GRAY);
                }

                if (swiatla.get(0).praweDziala){
                    praweSwiatloKolor.setBackground(Color.YELLOW);
                } else {
                    praweSwiatloKolor.setBackground(Color.DARK_GRAY);
                }


                if (swiatla.get(0).leweDziala){
                    dzialaCheckBox.setSelected(true);
                } else {
                    dzialaCheckBox.setSelected(false);
                }

                if (swiatla.get(0).praweDziala){
                    dzialaCheckBox1.setSelected(true);
                } else {
                    dzialaCheckBox1.setSelected(false);
                }

                swiatlaOutSum.setText(swiatla.get(0).marka);

                markaLeweOut.setText(swiatla.get(0).marka);
                markaPraweOut.setText(swiatla.get(0).marka);
                slider1.setValue(swiatla.get(0).lewePoziom);
                slider2.setValue(swiatla.get(0).prawePoziom);
                procentLewe.setText(String.valueOf(swiatla.get(0).lewePoziom));
                procentPrawe.setText(String.valueOf(swiatla.get(0).prawePoziom));

                sumaSwiatla = 0;

                for (int i = 0; i < swiatlaCeny.size(); i++) {
                    sumaSwiatla+=swiatlaCeny.get(i);
                }
                sumaAll+=sumaSwiatla;
                text+="<html>"+sumaSwiatla+"zl - swiatla<br><html>";
                textNote+=sumaSwiatla+"zl - swiatla\n";
                summary.setText(text);
                intPodsumowanie.setText(String.valueOf(sumaAll));

            }
        });

        Osiagi osiagi1 = new Osiagi((int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min,(int)(Math.random()*range)+min);

        progressBar1.setValue(osiagi1.konie);
        progressBar1.setStringPainted(true);


        plus1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p1 = progressBar1.getValue();
                p1++;
                progressBar1.setValue(p1);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p1 = progressBar1.getValue();
                p1--;
                progressBar1.setValue(p1);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar2.setValue(osiagi1.newton);
        progressBar2.setStringPainted(true);

        plus2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p2 = progressBar2.getValue();
                p2++;
                progressBar2.setValue(p2);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p2 = progressBar2.getValue();
                p2--;
                progressBar2.setValue(p2);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar3.setValue(osiagi1.pojemnoscSilnika);
        progressBar3.setStringPainted(true);


        plus3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p3 = progressBar3.getValue();
                p3++;
                progressBar3.setValue(p3);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p3 = progressBar3.getValue();
                p3--;
                progressBar3.setValue(p3);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar4.setValue(osiagi1.przyspieszenie);
        progressBar4.setStringPainted(true);


        plus4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p4 = progressBar4.getValue();
                p4++;
                progressBar4.setValue(p4);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p4 = progressBar4.getValue();
                p4--;
                progressBar4.setValue(p4);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar5.setValue(osiagi1.skretnosc);
        progressBar5.setStringPainted(true);


        plus5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p5 = progressBar5.getValue();
                p5++;
                progressBar5.setValue(p5);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p5 = progressBar5.getValue();
                p5--;
                progressBar5.setValue(p5);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar6.setValue(osiagi1.przyczepnosc);
        progressBar6.setStringPainted(true);


        plus6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p6 = progressBar6.getValue();
                p6++;
                progressBar6.setValue(p6);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p6 = progressBar6.getValue();
                p6--;
                progressBar6.setValue(p6);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar7.setValue(osiagi1.aerodynamika);
        progressBar7.setStringPainted(true);


        plus7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p7 = progressBar7.getValue();
                p7++;
                progressBar7.setValue(p7);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p7 = progressBar7.getValue();
                p7--;
                progressBar7.setValue(p7);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar8.setValue(osiagi1.predkoscMax);
        progressBar8.setStringPainted(true);


        plus8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p8 = progressBar8.getValue();
                p8++;
                progressBar8.setValue(p8);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p8 = progressBar8.getValue();
                p8--;
                progressBar8.setValue(p8);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar9.setValue(osiagi1.prowadzenieSie);
        progressBar9.setStringPainted(true);


        plus9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p9 = progressBar9.getValue();
                p9++;
                progressBar9.setValue(p9);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p9 = progressBar9.getValue();
                p9--;
                progressBar9.setValue(p9);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        progressBar10.setValue(osiagi1.wygoda);
        progressBar10.setStringPainted(true);


        plus10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p10 = progressBar10.getValue();
                p10++;
                progressBar10.setValue(p10);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });
        minus10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p10 = progressBar10.getValue();
                p10--;
                progressBar10.setValue(p10);
                sumaTuning+=10;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        zatwierdzButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaAll+=sumaTuning;
                text+="<html>"+sumaTuning+"zl - Tuning<br><html>";
                textNote+=sumaTuning+"zl - tuning\n";
                summary.setText(text);
                intPodsumowanie.setText(String.valueOf(sumaAll));
                sumaTuning = 0;
                outSumaTuning.setText(String.valueOf(sumaTuning));
            }
        });

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("plik1.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        zaplacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("plik1.txt"));
                    writer.write("PARAGON FISKALNY\n \nKwota - Nazwa przedmiotu\n \n"+textNote+"\nSuma: "+sumaAll);
                    writer.close();
                } catch (IOException k) {
                    throw new RuntimeException(k);
                }
                ImageIcon payment = new ImageIcon("check.png");
                JOptionPane.showMessageDialog(
                        null,
                        "Platnosc zaakceptowana!",
                        "Platnosc", JOptionPane.INFORMATION_MESSAGE,
                        payment);
                dispose();
            }
        });
    }

    public static double roundToDecimal(double num, int dec) {
        int multi = (int) Math.pow(10, dec);
        int temp = (int) Math.round(num * multi);
        return (double) temp / multi;
    }
    public  void run(String marka, String model, String kolor, String paliwo, int rocznik, int przebieg){
        Main example = new Main(marka, model, kolor, paliwo, rocznik, przebieg);
        example.setVisible(true);
    }
}
