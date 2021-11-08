package servicioCsv.primeraPractica.lectorCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import servicioCsv.primeraPractica.entidades.CalidadAireEstaciones;
import servicioCsv.primeraPractica.settings.Settings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que procesa el archivo de las estaciones, lo hemos parseado con CSVParser debido a que realizarlo como los otros nos daba error
 * con el split, asique le hemos indicado el separador ;
 * Me hubiese gustado recorrerlo de la manera de @for(String[] f: fila) pero no me funcionaba asique finalmente lo dejé asi
 */
public class LectorCalidadEstaciones {

    public void procesarCalidadEstaciones() throws FileNotFoundException {
        System.out.println("Estas procesando el archivo CALIDAD DE ESTACIONES");
        try {
            CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
            CSVReader reader = new CSVReaderBuilder(new FileReader(Settings.direccion3)).withCSVParser(conPuntoYComa).build();
            List<String[]> fila = reader.readAll();
            List<CalidadAireEstaciones> listaEstaciones = new ArrayList();
            for (int i = 0; i < fila.size(); i++) {
                CalidadAireEstaciones calidadEstaciones = new CalidadAireEstaciones();
                calidadEstaciones.setEstacionCodigo(fila.get(i)[0]);
                calidadEstaciones.setZonaCalidadAire(fila.get(i)[1]);
                calidadEstaciones.setEstacionMunicipio(fila.get(i)[2]);
                calidadEstaciones.setEstacionFechaAlta(fila.get(i)[3]);
                calidadEstaciones.setEstacionTipoArea(fila.get(i)[4]);
                calidadEstaciones.setEstacionTipoEstacion(fila.get(i)[5]);
                calidadEstaciones.setEstacionSubareaRural(fila.get(i)[6]);
                calidadEstaciones.setEstacionDireccionPostal(fila.get(i)[7]);
                calidadEstaciones.setEstacionCoordUTMETRS89X(fila.get(i)[8]);
                calidadEstaciones.setEstacionCoordUTMETRS89Y(fila.get(i)[9]);
                calidadEstaciones.setEstacionCoordLongitud(fila.get(i)[10]);
                calidadEstaciones.setEstacionCorrdLatitud(fila.get(i)[11]);
                calidadEstaciones.setEstacionAltitud(fila.get(i)[12]);
                calidadEstaciones.setEstacionAnalizadorNO(fila.get(i)[13]);
                calidadEstaciones.setEstacionAnalizadorNO2(fila.get(i)[14]);
                calidadEstaciones.setEstacionAnalizadorPM10(fila.get(i)[15]);
                calidadEstaciones.setEstacionAnalizadorPM25(fila.get(i)[16]);
                calidadEstaciones.setEstacionAnalizadorO3(fila.get(i)[17]);
                calidadEstaciones.setEstacionAnalizadorTOL(fila.get(i)[18]);
                calidadEstaciones.setEstacionAnalizadorBEN(fila.get(i)[19]);
                calidadEstaciones.setEstacionAnalizadorXIL(fila.get(i)[20]);
                calidadEstaciones.setEstacionAnalizadorCO(fila.get(i)[21]);
                calidadEstaciones.setEstacionAnalizadorSO2(fila.get(i)[22]);
                calidadEstaciones.setEstacionAnalizadorHCT(fila.get(i)[23]);
                calidadEstaciones.setEstacionAnalizadorHNM(fila.get(i)[24]);
                listaEstaciones.add(calidadEstaciones);

            }
            /**
             * En este caso realizo un conteo de todos los elementos
             * y mostramos unicamente las q0 primeras columnas, pero simplemente por legibilidad, comodidad.
             */
            System.out.println("Número de columnas");
            listaEstaciones.stream().count();
            System.out.println("Mostrando las 10 primeras columnas");
            listaEstaciones.stream().limit(10).forEach(System.out::println);


        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

    }
}
