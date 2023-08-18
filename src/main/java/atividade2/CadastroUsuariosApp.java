/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package atividade2;

import javax.swing.*;
import java.awt.*;

public class CadastroUsuariosApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Cadastro de Usuários - Sistema XYZ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(8, 2, 10, 10));

        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField();

        JLabel usernameLabel = new JLabel("Nome de Usuário:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Senha:");
        JPasswordField passwordField = new JPasswordField();

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField();

        JLabel roleLabel = new JLabel("Função:");
        JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"Administrador", "Usuário Comum"});

        JButton submitButton = new JButton("Cadastrar");

        // Definindo cores
        Color backgroundColor = new Color(240, 240, 240);
        Color labelColor = new Color(0, 102, 204);
        nameLabel.setForeground(labelColor);
        usernameLabel.setForeground(labelColor);
        passwordLabel.setForeground(labelColor);
        emailLabel.setForeground(labelColor);
        roleLabel.setForeground(labelColor);
        frame.setBackground(backgroundColor);

        // Definindo cores de fundo dos campos de texto
        nameField.setBackground(Color.white);
        usernameField.setBackground(Color.white);
        passwordField.setBackground(Color.white);
        emailField.setBackground(Color.white);

        // Definindo cores do botão
        submitButton.setBackground(labelColor);
        submitButton.setForeground(Color.white);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(roleLabel);
        frame.add(roleComboBox);
        frame.add(new JLabel());
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
