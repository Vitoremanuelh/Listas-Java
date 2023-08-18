/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade4;

import javax.swing.*;
import java.awt.*;

public class CarroDosSonhosApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Carro dos Sonhos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        frame.setBackground(new Color(240, 240, 240));

        String[] combustiveis = {"Gasolina", "Etanol", "Diesel", "Elétrico"};

        addField(frame, "Marca:", new JTextField());
        addField(frame, "Modelo:", new JTextField());
        addComboBox(frame, "Combustível:", combustiveis);
        addField(frame, "Ano:", new JTextField());
        addField(frame, "Potência (CV):", new JTextField());
        addButton(frame, "Cadastrar");

        frame.setVisible(true);
    }

    private static void addField(Container container, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        label.setForeground(new Color(0, 102, 204));
        textField.setBackground(Color.white);
        container.add(label);
        container.add(textField);
    }

    private static void addComboBox(Container container, String labelText, String[] options) {
        JLabel label = new JLabel(labelText);
        label.setForeground(new Color(0, 102, 204));
        JComboBox<String> comboBox = new JComboBox<>(options);
        container.add(label);
        container.add(comboBox);
    }

    private static void addButton(Container container, String buttonText) {
        JButton button = new JButton(buttonText);
        button.setBackground(new Color(0, 102, 204));
        button.setForeground(Color.white);
        container.add(new JLabel()); // Espaço vazio
        container.add(button);
    }
}

