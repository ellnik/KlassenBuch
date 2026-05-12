package gui;

import javax.swing.*;
import java.awt.*;

public class FormularPanel extends JPanel {

    private JTextField titleField;
    private JTextArea descriptionArea;
    private JCheckBox newsletterCheck;
    private JCheckBox datenschutzCheck;
    private JComboBox<String> categoryBox;
    private JButton saveButton;
    private JButton deleteButton;

    public FormularPanel() {

        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Titel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        add(new JLabel("Titel:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        titleField = new JTextField();
        add(titleField, gbc);

        // Beschreibung
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        add(new JLabel("Beschreibung:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        descriptionArea = new JTextArea(5, 20);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        add(new JScrollPane(descriptionArea), gbc);

        // Optionen
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        add(new JLabel("Optionen:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        newsletterCheck = new JCheckBox("Newsletter abonnieren");
        datenschutzCheck = new JCheckBox("Datenschutz akzeptiert");
        optionPanel.add(newsletterCheck);
        optionPanel.add(datenschutzCheck);
        add(optionPanel, gbc);

        // Kategorie
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        add(new JLabel("Kategorie:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        categoryBox = new JComboBox<>(new String[]{
                "Bitte wählen",
                "Allgemein",
                "AE",
                "SI"
        });
        add(categoryBox, gbc);

        //Buttons
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;

        JPanel buttonPanel = new JPanel();
        saveButton = new JButton("Speichern");
        deleteButton = new JButton("Löschen");

        buttonPanel.add(deleteButton);
        buttonPanel.add(saveButton);

        add(buttonPanel, gbc);
    }
}