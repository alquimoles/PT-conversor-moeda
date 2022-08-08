import enums.TipoConversao;
import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversaoDeMoeda = "Converter moeda";
        String conversaoDeTemperatura = "Converter temperatura";

        boolean executa = true;

        Repetidor repetidor = new Repetidor();

        while(executa){
            String operacao = JOptionPane.showInputDialog(null, "Escolha a operação",
                    "Conversões", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversaoDeMoeda, conversaoDeTemperatura}, "Escolha").toString();

            if (operacao.equals(conversaoDeMoeda)) {
                InicializadorConversaoMoedas inicializadorConversaoMoedas = new InicializadorConversaoMoedas();
                String operacaoMoedas = JOptionPane.showInputDialog(null, "Escolha uma moeda",
                        "Moedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversao.REAL_PARA_DOLAR.getDescricao(),
                                TipoConversao.REAL_PARA_EURO.getDescricao(),
                                TipoConversao.REAL_PARA_LIBRA_ESTERLINA.getDescricao(),
                                TipoConversao.REAL_PARA_PESO_ARGENTINO.getDescricao(),
                                TipoConversao.REAL_PARA_PESO_CHILENO.getDescricao(),
                                TipoConversao.DOLAR_PARA_REAL.getDescricao(),
                                TipoConversao.EURO_PARA_REAL.getDescricao(),
                                TipoConversao.LIBRA_ESTERLINA_PARA_REAL.getDescricao(),
                                TipoConversao.PESO_ARGENTINO_PARA_REAL.getDescricao(),
                                TipoConversao.PESO_CHILENO_PARA_REAL.getDescricao()},
                        "Escolha").toString();

                String valorString = JOptionPane.showInputDialog("Insira um valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEmDouble(valorString);
                    BigDecimal valorConvertido = inicializadorConversaoMoedas.operarConversao(operacaoMoedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacao.equals(conversaoDeTemperatura)){
                InicializadorConversaoTemperatura inicializadorConversaoTemperatura = new InicializadorConversaoTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "Escolha uma moeda",
                        "Moedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversao.CELSIUS_PARA_FAHRENHEIT.getDescricao(),
                                TipoConversao.CELSIUS_PARA_KELVIN.getDescricao(),
                                TipoConversao.FAHRENHEIT_PARA_CELSIUS.getDescricao(),
                                TipoConversao.FAHRENHEIT_PARA_KELVIN.getDescricao(),
                                TipoConversao.KELVIN_PARA_CELSIUS.getDescricao(),
                                TipoConversao.KELVIN_PARA_FAHRENHEIT.getDescricao(),},
                        "Escolha").toString();

                String valorString = JOptionPane.showInputDialog("Insira um valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEmDouble(valorString);
                    double valorConvertido = inicializadorConversaoTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            executa = repetidor.tentaRepetir();
        }

    }
}
