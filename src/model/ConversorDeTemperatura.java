package model;

public class ConversorDeTemperatura {

    private double valorConvertido;

    public double converterCelsiusParaFahrenheit(double valor){
        valorConvertido = valor * 1.8 + 32;
        return valorConvertido;
    }

    public double converterFahrenheitParaCelsius(double valor){
        valorConvertido = (valor - 32) /1.8;
        return valorConvertido;
    }

    public double converterCelsiusParaKelvin(double valor){
        valorConvertido = valor + 273;
        return valorConvertido;
    }

    public double converterKelvinParaCelsius(double valor){
        valorConvertido = valor - 273;
        return valorConvertido;
    }

    public double converterKelvinParaFahrenheit(double valor){
        valorConvertido = converterKelvinParaCelsius(valor);
        valorConvertido = converterCelsiusParaFahrenheit(valorConvertido);
        return valorConvertido;
    }

    public double converterFahrenheitParaKelvin(double valor){
        valorConvertido = converterFahrenheitParaCelsius(valor);
        valorConvertido = converterCelsiusParaKelvin(valorConvertido);
        return valor;
    }
}
