package servicioCsv.primeraPractica.lectorCSV;

import com.opencsv.CSVReader;
import servicioCsv.primeraPractica.entidades.CalidadAireZonas;
import servicioCsv.primeraPractica.settings.Settings;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que procesa el archivo de calidad aire zonas.csv
 */
public class LectorCalidadZonas {
    
    public void procesarCalidadZonas() {
        try (CSVReader reader = new CSVReader(new FileReader(Settings.direcccion4))) {
            System.out.println("Estas leyendo CALIDAD-ZONAS");
            System.out.println("\n");
            List<String[]> fila = reader.readAll();
            List<CalidadAireZonas> listaZonas = new ArrayList();
            for (int i = 1; i < fila.size(); i++) {
                String[] p = fila.get(i)[0].split(";");
                CalidadAireZonas az = new CalidadAireZonas();
                az.setZonaCalidadAireCodigo(p[0]);
                az.setZonaCalidadAireDescripcion(p[1]);
                az.setZonaCalidadAireMunicipio(p[2]);
                listaZonas.add(az);
            }
            //listaZonas.forEach(System.out::println);
            System.out.println("Mostrando 10 priemras columnas");
            listaZonas.stream().limit(10).forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
