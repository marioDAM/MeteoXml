package servicioCsv.primeraPractica.settings;

import java.io.File;

/**
 * Clase Settings donde creamos atributos estáticos y finales donde está la direccion relativa de los diferentes archivos a procesar
 */
public class Settings {
    public static final String direccion1 = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "calidad_aire_datos_mes.csv";
    public static final String direccion2 = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "calidad_aire_datos_meteo_mes.csv";
    public static final String direccion3 = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "calidad_aire_estaciones.csv";
    public static final String direcccion4 = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "calidad_aire_zonas.csv";

    //Añadimos la direccion donde se crea el xml de Contaminacion
    public static final String contaminacion = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Contaminacion.xml";
    //Añadimos la direccion donde se crea el xml de temperatura
    public static final String temperatura = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "Temperatura.xml";


}
