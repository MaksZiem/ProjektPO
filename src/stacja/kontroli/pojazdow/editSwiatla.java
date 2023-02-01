package stacja.kontroli.pojazdow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class editSwiatla extends JFrame {

    private JPanel panelMain;
    private JButton zatwierdzButton;
    private JSlider slider1;
    private JSlider slider2;
    private JTextField textField1;
    private JButton sprawdzButton;
    private JButton naprawLeweSwiatloButton;
    private JButton naprawPraweSwiatloButton;

    public boolean leweDziala, praweDziala;

    public editSwiatla(){
        super("Regulacja poziomu swiatel");
        this.setContentPane(panelMain);
        this.setSize(500,500);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("car-repair.png");
        this.setIconImage(icon.getImage());



        leweDziala = Main.swiatla.get(0).leweDziala;
        praweDziala = Main.swiatla.get(0).praweDziala;

        slider1.setPaintTrack(true);
        slider1.setMajorTickSpacing(10);
        slider1.setPaintLabels(true);
        slider1.setValue(Main.swiatla.get(0).lewePoziom);

        slider2.setPaintTrack(true);
        slider2.setMajorTickSpacing(10);
        slider2.setPaintLabels(true);
        slider2.setValue(Main.swiatla.get(0).prawePoziom);

        if (Main.swiatla.get(0).leweDziala){
            naprawLeweSwiatloButton.setEnabled(false);
        }

        if (Main.swiatla.get(0).praweDziala){
            naprawLeweSwiatloButton.setEnabled(false);
        }

        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Swiatla swiatla2 = new Swiatla(textField1.getText(), slider1.getValue(), slider2.getValue(), leweDziala, praweDziala);
                Main.swiatla.set(0, swiatla2);
                Main.swiatlaCeny.add(100);
                JOptionPane.showMessageDialog(null, "dodano 100zl do rachunku");
                dispose();
            }
        });

        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(leweDziala + " "+praweDziala);
                if (slider1.getValue()>=45 && slider1.getValue()<=55 && slider2.getValue()>=45 && slider2.getValue()<=55 && leweDziala && praweDziala) {
                    zatwierdzButton.setEnabled(true);
                }
            }
        });

        naprawLeweSwiatloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leweDziala = true;
                naprawLeweSwiatloButton.setEnabled(false);
            }
        });

        naprawPraweSwiatloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                praweDziala = true;
                naprawPraweSwiatloButton.setEnabled(false);
            }
        });
    }

    public static void run() {
        editSwiatla frame = new editSwiatla();
        frame.setVisible(true);
    }
}
