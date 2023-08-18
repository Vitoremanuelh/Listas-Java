/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade3;

import javax.swing.*;
import java.awt.*;

public class CadastroFamiliaApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Cadastro de Família");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new GridLayout(7, 2, 10, 10));
        frame.setBackground(new Color(240, 240, 240));

        String[] generos = {"Masculino", "Feminino"};

        addField(frame, "Nome do Pai:", new JTextField());
        addComboBox(frame, "Gênero do Pai:", generos);
        addField(frame, "Idade do Pai:", new JTextField());
        addField(frame, "Profissão do Pai:", new JTextField());

        addField(frame, "Nome da Mãe:", new JTextField());
        addComboBox(frame, "Gênero da Mãe:", generos);
        addField(frame, "Idade da Mãe:", new JTextField());
        addField(frame, "Profissão da Mãe:", new JTextField());

        addField(frame, "Nome do Filho:", new JTextField());
        addComboBox(frame, "Gênero do Filho:", generos);
        addField(frame, "Idade do Filho:", new JTextField());
        addField(frame, "Escola do Filho:", new JTextField());

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
