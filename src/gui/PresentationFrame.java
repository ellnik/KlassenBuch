package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PresentationFrame extends JFrame{
	
	public PresentationFrame(){
		
	setTitle("Presentattion");
	setSize(400, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0, 1));
    add(panel);

    //Präsentationstitel
    JTextField present = new JTextField();
    present.setBackground(new Color(200, 150, 255)); // lila
    panel.add(new JLabel("Präsentationstitel:"));
    panel.add(present);
    
    //Datum
    JTextField datum = new JTextField();
    panel.add(new JLabel("Datum:"));
    panel.add(datum);
   
    
    // Gruppe
    String[] gruppen = {"AE-29", "SI-28", "AE-30", "SI-29"};
    JComboBox<String> gruppeBox = new JComboBox<>(gruppen);
    panel.add(new JLabel("Gruppe:"));
    panel.add(gruppeBox);
    
    
    //Name
    JTextField name = new JTextField();
    panel.add(new JLabel("Name:"));
    panel.add(name);
    
    //Dozent
    JTextField dozent = new JTextField();
    panel.add(new JLabel("Dozent:"));
    panel.add(dozent);
    
    //Kurz Beschreibung
    JTextArea beschreibung = new JTextArea(5, 20);
    JScrollPane scroll = new JScrollPane(beschreibung);
    panel.add(new JLabel("Beschreibung:"));
    panel.add(scroll);
    
    
  //Unterschreibung
    JTextField unterschreibung = new JTextField();
    panel.add(new JLabel("Unterschreibung:"));
    panel.add(unterschreibung);
    
    // Button
    JButton button = new JButton("Speichern");
    button.setBackground(Color.MAGENTA);
    panel.add(button);
    
    
    setVisible(true);
    
	}

	

	public static void main(String[] args) {
		new PresentationFrame();
	}
}
