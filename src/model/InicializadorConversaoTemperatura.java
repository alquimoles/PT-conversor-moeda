package model;

import interfaces.InicializadorConversao;

import java.math.BigDecimal;

public class InicializadorConversaoTemperatura implements InicializadorConversao {

    ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();
    private static final String CELSIUS_PARA_FAHRENHEIT = "Celsius para Fahrenheit";
    private static final String CELSIUS_PARA_KELVIN = "Celsius para Kelvin";
    private static final String KELVIN_PARA_FAHRENHEIT = "Kelvin para Fahrenheit";
    private static final String KELVIN_PARA_CELSIUS = "Kelvin para Celsius";
    private static final String FAHRENHEIT_PARA_CELSIUS = "Fahrenheit para Celsius";
    private static final String FAHRENHEIT_PARA_KELVIN = "Fahrenheit para Kelvin";


    public BigDecimal operarConversao(String operacaoTemperatura, double valorInicial) throws Exception {
        switch (operacaoTemperatura){
            case CELSIUS_PARA_FAHRENHEIT -> {
                return conversorDeTemperatura.converterCelsiusParaFahrenheit(valorInicial);
            }
            case CELSIUS_PARA_KELVIN -> {
                return conversorDeTemperatura.converterCelsiusParaKelvin(valorInicial);
            }
            case KELVIN_PARA_CELSIUS -> {
                return conversorDeTemperatura.converterKelvinParaCelsius(valorInicial);
            }
            case KELVIN_PARA_FAHRENHEIT -> {
                return conversorDeTemperatura.converterKelvinParaFahrenheit(valorInicial);
            }
            case FAHRENHEIT_PARA_CELSIUS -> {
                return conversorDeTemperatura.converterFahrenheitParaCelsius(valorInicial);
            }
            case FAHRENHEIT_PARA_KELVIN -> {
                return conversorDeTemperatura.converterFahrenheitParaKelvin(valorInicial);
            }
            default -> throw new Exception("Escolha Inválida");
        }
    }
}
