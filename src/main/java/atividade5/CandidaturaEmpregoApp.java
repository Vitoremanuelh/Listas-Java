/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade5;

import javax.swing.*;
import java.awt.*;

public class CandidaturaEmpregoApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Qualidades para Emprego/Estágio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(7, 2, 10, 10));
        frame.setBackground(new Color(240, 240, 240));

        String[] niveisHabilidade = {"Iniciante", "Intermediário", "Avançado", "Expert"};

        addField(frame, "Comunicação:", new JComboBox<>(niveisHabilidade));
        addField(frame, "Trabalho em Equipe:", new JComboBox<>(niveisHabilidade));
        addField(frame, "Resolução de Problemas:", new JComboBox<>(niveisHabilidade));
        addField(frame, "Adaptabilidade:", new JComboBox<>(niveisHabilidade));
        addField(frame, "Criatividade:", new JComboBox<>(niveisHabilidade));
        addField(frame, "Liderança:", new JComboBox<>(niveisHabilidade));
        addButton(frame, "Enviar Candidatura");

        frame.setVisible(true);
    }

    private static void addField(Container container, String labelText, JComboBox<String> comboBox) {
        JLabel label = new JLabel(labelText);
        label.setForeground(new Color(0, 102, 204));
        comboBox.setBackground(Color.white);
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

