package servicioCsv.primeraPractica.codigos;

import lombok.Data;

@Data
/**
 * class that implements the {@link Data}
 *
 */

public class CodigoMagnitud {
    /**
     * Clase que trata de hacer referencia los codigos de las magnitudes que tienen en el arhcivo csv
     */

    String velocidadViento = "81";
    String direccionViento = "82";
    String temperatura = "83";
    String humedadRelativa = "86";
    String presionAtmosferica = "87";
    String radiacionSolar="88";
    String precipitacion = "89";
    String dioxidoAzufre="1";
    String mmonoxidoCarbono = "6";
    String monoxidoNitrogeno="7";
    String dioxidoNitrogeno = "8";
    String pm25 = "9";
    String pm10 = "10";
    String oxidoNitrogeno = "12";
    String ozono = "14";
    String tolueno = "20";
    String carbonNegro="22";
    String benceno = "30";
    String hidrocarburos="42";
    String hidrocarburosNoMetanicos = "44";
    String metaParaXieno="431";
}
