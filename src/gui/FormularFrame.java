package gui;

import javax.swing.JFrame;

public class FormularFrame extends JFrame {

    public FormularFrame() {
        setTitle("Formularverwaltung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(760, 460);
        setLocationRelativeTo(null);

        setContentPane(new FormularPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularFrame();
    }
}