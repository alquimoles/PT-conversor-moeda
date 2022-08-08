package Conversor;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Funcao {
    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();
        if (opcao.equals("De Reais a Dólares")) {
            double moedaDolar = valorRecebido / 5.13;
            moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dolares");
        } else if (opcao.equals("De Reais a Euros")) {
            double moedaEuro = valorRecebido / 10.85;
            moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
        } else if (opcao.equals("De Reais a Libras")) {
            double moedaLibra = valorRecebido / 6.33;
            moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras Esterlinas");
        } else if (opcao.equals("De Reais a Peso Argentino")) {
            double moedaPesoArgentino = valorRecebido / 0.039;
            moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Peso Argentino");
        } else if (opcao.equals("De Reais a Peso Chileno")) {
            double moedaPesoChileno = valorRecebido / 0.0040;
            moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Wons");
        } else if (opcao.equals("De Dólares a Reais")) {
            double moedaDolar = valorRecebido * 5.13;
            moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Reais");
        } else if (opcao.equals("De Euros a Reais")) {
            double moedaEuro = valorRecebido * 10.85;
            moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");
        } else if (opcao.equals("De Libras a Reais")) {
            double moedaLibra = valorRecebido * 6.33;
            moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Reais");
        } else if (opcao.equals("De Peso Argentino a Reais")) {
            double moedaPesoArgentino = valorRecebido * 0.039;
            moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
        } else if (opcao.equals("De Peso Chileno a Reais")) {
            double moedaPesoChileno = valorRecebido * 0.0040;
            moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChileno + " Reais");
        }
    }

    public void converterTemperatura(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Graus Celsius a Fahrenheit", "Graus Celsius a Kelvin",
                "Graus Fahrenheit a Celsius",
                "Kelvin a Graus Celsius",
                "Kelvin a Graus Fahrenheit"}, "Escolha")).toString();
        if (Objects.equals(opcao, "Graus Celsius a Fahrenheit")) {
            double celsiusParaFahrenheit = valorRecebido * 1.8 + 32;
            celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
            JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + celsiusParaFahrenheit + " Graus Fahrenheit ");
        } else if (Objects.equals(opcao, "Graus Celsius a Kelvin")) {
            double celsiusParaKelvin = valorRecebido + 273.15;
            celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
            JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + celsiusParaKelvin + " Kelvin");
        } else if (Objects.equals(opcao, "Graus Fahrenheit a Celsius")) {
            double fahrenheitParaCelsius = (valorRecebido - 32) / 1.8;
            fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
            JOptionPane.showMessageDialog(null, valorRecebido + " Graus Fahrenheit são " + fahrenheitParaCelsius + " Celsius");
        } else if (Objects.equals(opcao, "Kelvin a Graus Celsius")) {
            double kelvinParaCelcius = valorRecebido - 273.15;
            kelvinParaCelcius = (double) Math.round(kelvinParaCelcius * 100d) / 100;
            JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são " + kelvinParaCelcius + " Celsius");
        } else if (Objects.equals(opcao, "Kelvin a Graus Fahrenheit")) {
            double kelvinParaFahrenheit = (valorRecebido - 273.15) * 9 / 5 + 32;
            kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
            JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são " + kelvinParaFahrenheit + " Fahrenheit");
        }
    }

    public boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
