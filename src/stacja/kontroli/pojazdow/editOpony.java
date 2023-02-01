package stacja.kontroli.pojazdow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class editOpony extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton potwierdzButton;
    private JPanel panelEditOpony;
    private JComboBox comboBox1;
    private JButton button1;
    private JButton button2;
    private JLabel cisnienieOut;

    private double cisnienie = 1.0;

    public int index2;
    public editOpony(int index2) {
        super("edycja wybranej opony");
        this.index2 = index2;
        this.setContentPane(panelEditOpony);
        this.setSize(400,400);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("car-repair.png");
        this.setIconImage(icon.getImage());

        potwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opony opona5 = new Opony((String) comboBox1.getSelectedItem(), textField1.getText(), Integer.parseInt(textField2.getText()), Double.parseDouble(cisnienieOut.getText()));
                Main.oponki.set(index2, opona5);
                Main.ceny.add(300);
                dispose();
                JOptionPane.showMessageDialog(null, "dodano 300zl do rachunku");
            }
        });

        cisnienieOut.setText(String.valueOf(Math.round(cisnienie *100)/100.0));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cisnienie-=0.1;
                cisnienieOut.setText(String.valueOf(Math.round(cisnienie*100)/100.0));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cisnienie+=0.1;
                cisnienieOut.setText(String.valueOf(Math.round(cisnienie*100)/100.0));
            }
        });

    }

    public static void run(int index){
        editOpony frame = new editOpony(index);
        frame.setVisible(true);
    }
}
