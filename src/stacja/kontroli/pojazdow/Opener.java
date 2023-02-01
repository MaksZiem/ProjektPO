package stacja.kontroli.pojazdow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opener extends JFrame{

    private JButton zatwierdzButton;
    private JPanel openPanel;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;


    public Opener() {
        super("Uzupelnij dane");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(openPanel);
        this.setSize(600,600);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("car-repair.png");
        this.setIconImage(icon.getImage());


        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main open1 = new Main((String) comboBox1.getSelectedItem(), (String) comboBox2.getSelectedItem(), (String) comboBox3.getSelectedItem(), (String) comboBox4.getSelectedItem(), Integer.parseInt(textField5.getText()), Integer.parseInt(textField6.getText()));
                open1.run(open1.marka, open1.model, open1.kolor,open1.paliwo, open1.rocznik, open1.przebieg);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Opener frame = new Opener();
        frame.setVisible(true);
    }
}
