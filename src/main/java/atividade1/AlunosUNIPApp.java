/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade1;

import javax.swing.*;
import java.awt.*;

public class AlunosUNIPApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI()); //EXPRESSÃO LAMBDA PARA ENCAPSULAR
        //GARANTINDO QUE A INTERFACE (GUI) SEJA EXECUTADO DE FORMA SEGURA NA THREAD DE DESPACHO DE EVENTOS (EDT) 
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Dados Cadastrais de Alunos - UNIP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Idade:");
        JTextField ageField = new JTextField();

        JLabel courseLabel = new JLabel("Curso:");
        JTextField courseField = new JTextField();

        JLabel semesterLabel = new JLabel("Semestre:");
        JTextField semesterField = new JTextField();

        JButton submitButton = new JButton("Cadastrar");

        // DEFININDO CORES
        Color backgroundColor = new Color(220, 220, 220);
        Color labelColor = new Color(70, 130, 180);
        nameLabel.setForeground(labelColor);
        ageLabel.setForeground(labelColor);
        courseLabel.setForeground(labelColor);
        semesterLabel.setForeground(labelColor);
        frame.setBackground(backgroundColor);

        // DEFININDO CORES DO FUNDO DO TEXTO
        nameField.setBackground(Color.white);
        ageField.setBackground(Color.white);
        courseField.setBackground(Color.white);
        semesterField.setBackground(Color.white);

        // DEFININDO AS CORES DO BOTÃO
        submitButton.setBackground(labelColor);
        submitButton.setForeground(Color.white);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(semesterLabel);
        frame.add(semesterField);
        frame.add(new JLabel());
        frame.add(submitButton);

        frame.setVisible(true); // FECHA O PROGRAMA CLICANDO NO (X) DA JANELA
    }
}

