package stacja.kontroli.pojazdow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class editOlej extends JFrame {
    private JTextField markaField;
    private JTextField rodzajField;
    private JComboBox comboBox1;
    private JTextField dataField;
    private JButton nalejButton;
    private JProgressBar progressBar1;
    private JButton zatwierdzButton;
    private JPanel panelMain;
    private JLabel filterCount;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    public int sumaOlej;

    public editOlej() {
        super("Wymiana oleju");
        this.setContentPane(panelMain);
        this.setSize(400,400);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("car-repair.png");
        this.setIconImage(icon.getImage());


        progressBar1.setStringPainted(true);

        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaOlej = 200;
                if (Objects.equals(comboBox1.getSelectedItem(), "tak")){
                    System.out.println("tak");
                    sumaOlej+=100;
                }

                String stanFiltra = "";

                if (comboBox1.getSelectedItem().equals("tak")){
                    stanFiltra = "Nowy";
                } else {
                    stanFiltra = "Niezmieniony";
                }

                Olej olej2 = new Olej(String.valueOf(comboBox2.getSelectedItem()), String.valueOf(comboBox3.getSelectedItem()), stanFiltra, 100, Integer.parseInt(dataField.getText()));
                Main.olejki.set(0, olej2);
                System.out.println(sumaOlej);
                Main.olejCeny.add(sumaOlej);
                dispose();
                JOptionPane.showMessageDialog(null, "dodano "+sumaOlej+" do rachunku");
            }
        });


        Timer t1 = new Timer(100, new ActionListener() {
        int i = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(i);
                i+=5;
            }
        });

        nalejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
                zatwierdzButton.setEnabled(true);
            }
        });
    }

    public static void run() {
        editOlej frame = new editOlej();
        frame.setVisible(true);
    }
}
