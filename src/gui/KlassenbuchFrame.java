package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KlassenbuchFrame extends JFrame {

    public KlassenbuchFrame() {

        setTitle("Klassenbuch");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        add(panel);

        // Datum
        JTextField datumField = new JTextField();
        panel.add(new JLabel("Datum:"));
        panel.add(datumField);

        // Gruppe
        String[] gruppen = {"AE-29", "SI-28", "AE-30", "SI-29"};
        JComboBox<String> gruppeBox = new JComboBox<>(gruppen);
        panel.add(new JLabel("Gruppe:"));
        panel.add(gruppeBox);

        // Dozent
        JTextField dozentField = new JTextField();
        panel.add(new JLabel("Dozent:"));
        panel.add(dozentField);

        // Thema
        JTextField themaField = new JTextField();
        panel.add(new JLabel("Thema:"));
        panel.add(themaField);

        // Bemerkung
        JTextArea bemerkungArea = new JTextArea(3, 20);
        JScrollPane scroll = new JScrollPane(bemerkungArea);
        panel.add(new JLabel("Bemerkung:"));
        panel.add(scroll);

        // Methodik
        panel.add(new JLabel("Methodik:"));

        JCheckBox vortrag = new JCheckBox("Vortrag");
        JCheckBox uebung = new JCheckBox("Übung");
        JCheckBox gruppenarbeit = new JCheckBox("Gruppenarbeit");

        panel.add(vortrag);
        panel.add(uebung);
        panel.add(gruppenarbeit);

        // Button
        JButton saveButton = new JButton("Speichern");
        panel.add(saveButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KlassenbuchFrame();
    }
}