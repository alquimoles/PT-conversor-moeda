package model;

import java.math.BigDecimal;

public class ConversorDeTemperatura {

    private BigDecimal valorConvertido;

    public BigDecimal converterCelsiusParaFahrenheit(double valor){
        valorConvertido = BigDecimal.valueOf(valor * 1.8 + 32);
        return valorConvertido;
    }

    public BigDecimal converterFahrenheitParaCelsius(double valor){
        valorConvertido = BigDecimal.valueOf((valor - 32) /1.8);
        return valorConvertido;
    }

    public BigDecimal converterCelsiusParaKelvin(double valor){
        valorConvertido = BigDecimal.valueOf(valor + 273);
        return valorConvertido;
    }

    public BigDecimal converterKelvinParaCelsius(double valor){
        valorConvertido = BigDecimal.valueOf(valor - 273);
        return valorConvertido;
    }

    public BigDecimal converterKelvinParaFahrenheit(double valor){
        valorConvertido = BigDecimal.valueOf(1.8*(valor-273)+32);
        return valorConvertido;
    }

    public BigDecimal converterFahrenheitParaKelvin(double valor){
        valorConvertido = BigDecimal.valueOf((valor + 459.67) *5/9);
        return valorConvertido;
    }
}
