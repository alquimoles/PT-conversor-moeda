package conversorMoedas;

import conversorMoedas.ConverteMoedas;
import conversorMoedas.ConverteMoedasParaReais;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Funcao {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteMoedasParaReais reais = new ConverteMoedasParaReais();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();

        switch (opcao) {
            case "De Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais a Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "De Reais a Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais a Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "De Reais a Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;
            case "De Dólares a Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "De Euros a Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "De Libras a Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "De Peso Argentino a Reais":
                reais.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "De Peso Chileno a Reais":
                reais.converterPesosChilenosParaReais(valorRecebido);
                break;
        }
    }
}


