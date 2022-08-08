package enums;

public enum TipoConversao {
    REAL_PARA_DOLAR("De Real para Dólar"),
    REAL_PARA_EURO("De Real para Euro"),
    REAL_PARA_LIBRA_ESTERLINA("De Real para Libra Esterlina"),
    REAL_PARA_PESO_ARGENTINO ("De Real para Peso Argentino"),
    REAL_PARA_PESO_CHILENO("De Real para Peso Chileno"),
    DOLAR_PARA_REAL("De Dólar para Real"),
    EURO_PARA_REAL("De Euro para Real"),
    LIBRA_ESTERLINA_PARA_REAL("De Libra Esterlina para Real"),
    PESO_ARGENTINO_PARA_REAL("De Peso Argentino para Real"),
    PESO_CHILENO_PARA_REAL("De Peso Chileno para Real"),


    CELSIUS_PARA_FAHRENHEIT("Celsius para Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius para Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin para Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin para Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit para Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit para Kelvin");

    private String descricao;

    TipoConversao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
