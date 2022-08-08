package model;

public class Validador {
    public boolean verificar(String operacao){
;
        boolean ehNumerico =  operacao.matches("[+-]?\\d*(\\.\\d+)?");

        return ehNumerico;
    }

    public double transformarEmDouble(String operacao){
        double valorNumerico = Double.parseDouble(operacao);
        return valorNumerico;
    }
}
