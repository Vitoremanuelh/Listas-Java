/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividade6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ControleDespesasApp {

    private double totalDespesas = 0;

    private JFrame frame;
    private JTextField valorField;
    private JLabel totalLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ControleDespesasApp app = new ControleDespesasApp();
            app.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Controle de Despesas Diárias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setBackground(new Color(240, 240, 240));

        JLabel valorLabel = new JLabel("Valor da Despesa:");
        valorField = new JTextField();

        JButton adicionarButton = new JButton("Adicionar Despesa");
        JButton totalButton = new JButton("Total de Despesas");

        totalLabel = new JLabel("Total: R$0.00");
        totalLabel.setForeground(new Color(0, 102, 204));

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarDespesa();
            }
        });

        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTotalDespesas();
            }
        });

        frame.add(valorLabel);
        frame.add(valorField);
        frame.add(adicionarButton);
        frame.add(totalButton);
        frame.add(totalLabel);

        frame.setVisible(true);
    }

    private void adicionarDespesa() {
        try {
            double valor = Double.parseDouble(valorField.getText());
            totalDespesas += valor;
            valorField.setText("");
            atualizarTotalLabel();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Digite um valor válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarTotalDespesas() {
        JOptionPane.showMessageDialog(frame, "Total de Despesas: " + formatarValor(totalDespesas));
    }

    private void atualizarTotalLabel() {
        totalLabel.setText("Total: " + formatarValor(totalDespesas));
    }

    private String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "R$" + df.format(valor);
    }
}
