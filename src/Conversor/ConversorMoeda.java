package Conversor;

import javax.swing.*;

public class ConversorMoeda {
    public static void main(String[] args) {

        Funcao funcao = new Funcao();


        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

            if (opcao.equals("Conversor de Moeda")) {
                String input = JOptionPane.showInputDialog("Insira um valor: ");
                if (funcao.checar(input)) {
                    double valorRecebido = Double.parseDouble(input);
                    funcao.converterMoeda(valorRecebido);

                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if ((resposta == 0) && (funcao.checar(input))) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcao.equals("Conversor de Temperatura")) {
                String input = JOptionPane.showInputDialog("Insira um valor de temperatura para converter");
                if (funcao.checar(input)) {
                    double valorRecebido = Double.parseDouble(input);
                    funcao.converterTemperatura(valorRecebido);

                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if ((resposta == 0) && (funcao.checar(input))) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            }
        }
    }
}
