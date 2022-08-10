package model;

import enums.Moeda;
import enums.TipoConversao;

import java.math.BigDecimal;

public class InicializadorConversaoMoedas {

    private static final String REAL_PARA_DOLAR = "De Real para Dólar";
    private static final String REAL_PARA_EURO = "De Real para Euro";
    private static final String REAL_PARA_LIBRA_ESTERLINA = "De Real para Libra Esterlina";
    private static final String REAL_PARA_PESO_ARGENTINO = "De Real para Peso Argentino";
    private static final String REAL_PARA_PESO_CHILENO = "De Real para Peso Chileno";
    private static final String DOLAR_PARA_REAL = "De Dólar para Real";
    private static final String EURO_PARA_REAL = "De Euro para Real";
    private static final String LIBRA_ESTERLINA_PARA_REAL = "De Libra Esterlina para Real";
    private static final String PESO_ARGENTINO_PARA_REAL = "De Peso Argentino para Real";
    private static final String PESO_CHILENO_PARA_REAL = "De Peso Chileno para Real";
    private ConversorDeMoeda conversorDeMoedaDolar = new ConversorDeMoedaDolar();
    private ConversorDeMoeda conversorDeMoedaEuro = new ConversorDeMoedaEuro();
    private ConversorDeMoeda conversorDeMoedaLibraEsterlina = new ConversorDeMoedaLibraEsterlina();
    private ConversorDeMoeda conversorDeMoedaPesoArgentino = new ConversorDeMoedaPesoArgentino();
    private ConversorDeMoeda conversorDeMoedaPesoChileno = new ConversorDeMoedaPesoChileno();

    private Moeda moeda;

    public BigDecimal operarConversao(String operacaoMoedas, double valorInicial) throws Exception {

        switch (operacaoMoedas) {
            case REAL_PARA_DOLAR -> {
                return conversorDeMoedaDolar.converterParaMoeda(moeda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_EURO -> {
                return conversorDeMoedaEuro.converterParaMoeda(moeda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_LIBRA_ESTERLINA -> {
                return conversorDeMoedaLibraEsterlina.converterParaMoeda(moeda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO_ARGENTINO -> {
                return conversorDeMoedaPesoArgentino.converterParaMoeda(moeda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO_CHILENO -> {
                return conversorDeMoedaPesoChileno.converterParaMoeda(moeda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_REAL -> {
                return conversorDeMoedaDolar.converterParaReal(moeda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_REAL -> {
                return conversorDeMoedaEuro.converterParaReal(moeda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_REAL -> {
                return conversorDeMoedaLibraEsterlina.converterParaReal(moeda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_REAL -> {
                return  conversorDeMoedaPesoArgentino.converterParaReal(moeda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_REAL -> {
                return conversorDeMoedaPesoChileno.converterParaReal(moeda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ESCOLHA INVÁLIDA");
        }

    }

}
