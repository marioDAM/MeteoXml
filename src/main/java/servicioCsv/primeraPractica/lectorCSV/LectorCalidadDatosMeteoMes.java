package servicioCsv.primeraPractica.lectorCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import servicioCsv.primeraPractica.entidades.CalidadAireDatosMeteoMes;
import servicioCsv.primeraPractica.settings.Settings;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que procesa el archivo y lo lee correctamente llenando los atributos de la entidad CalidadAireDatosMeteoMes
 *
 * @return @List type of CalidadAireDatosMeteoMes
 * @throws IOException
 */
public class LectorCalidadDatosMeteoMes {
    List<CalidadAireDatosMeteoMes> listaCalidad = new ArrayList();

    public List<CalidadAireDatosMeteoMes> procesarCalidadDatosMeteoMes() {

        try {
            CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
            CSVReader reader = new CSVReaderBuilder(new FileReader(Settings.direccion2)).withCSVParser(conPuntoYComa).build();
            List<String[]> fila = reader.readAll();
            for (int i = 1; i < fila.size(); i++) {

                CalidadAireDatosMeteoMes cadm = new CalidadAireDatosMeteoMes();
                String[] separador = fila.get(i)[0].split(";");
                cadm.setProvincia(fila.get(i)[0]);
                cadm.setMunicipio(fila.get(i)[1]);
                cadm.setEstacion(fila.get(i)[2]);
                cadm.setMagnitud(fila.get(i)[3]);
                cadm.setPunto_muestreo(fila.get(i)[4]);
                cadm.setAno(Integer.parseInt(fila.get(i)[5]));
                cadm.setMes(Integer.parseInt(fila.get(i)[6]));
                cadm.setDia(Integer.parseInt(fila.get(i)[7]));
                cadm.setH01(fila.get(i)[8]);
                cadm.setV01(fila.get(i)[9]);
                cadm.setH02(fila.get(i)[10]);
                cadm.setV02(fila.get(i)[11]);
                cadm.setH03(fila.get(i)[12]);
                cadm.setV03(fila.get(i)[13]);
                cadm.setH04(fila.get(i)[14]);
                cadm.setV04(fila.get(i)[15]);
                cadm.setH05(fila.get(i)[16]);
                cadm.setV05(fila.get(i)[17]);
                cadm.setH06(fila.get(i)[18]);
                cadm.setV06(fila.get(i)[19]);
                cadm.setH07(fila.get(i)[20]);
                cadm.setV07(fila.get(i)[21]);
                cadm.setH08(fila.get(i)[22]);
                cadm.setV08(fila.get(i)[23]);
                cadm.setH09(fila.get(i)[24]);
                cadm.setV09(fila.get(i)[25]);
                cadm.setH10(fila.get(i)[26]);
                cadm.setV10(fila.get(i)[27]);
                cadm.setH11(fila.get(i)[28]);
                cadm.setV11(fila.get(i)[29]);
                cadm.setH12(fila.get(i)[30]);
                cadm.setV12(fila.get(i)[31]);
                cadm.setH13(fila.get(i)[32]);
                cadm.setV13(fila.get(i)[33]);
                cadm.setH14(fila.get(i)[34]);
                cadm.setV14(fila.get(i)[35]);
                cadm.setH15(fila.get(i)[36]);
                cadm.setV15(fila.get(i)[37]);
                cadm.setH16(fila.get(i)[38]);
                cadm.setV16(fila.get(i)[39]);
                cadm.setH17(fila.get(i)[40]);
                cadm.setV17(fila.get(i)[41]);
                cadm.setH18(fila.get(i)[42]);
                cadm.setV18(fila.get(i)[43]);
                cadm.setH19(fila.get(i)[44]);
                cadm.setV19(fila.get(i)[45]);
                cadm.setH20(fila.get(i)[46]);
                cadm.setV20(fila.get(i)[47]);
                cadm.setH21(fila.get(i)[48]);
                cadm.setV21(fila.get(i)[49]);
                cadm.setH22(fila.get(i)[50]);
                cadm.setV22(fila.get(i)[51]);
                cadm.setH23(fila.get(i)[52]);
                cadm.setV23(fila.get(i)[53]);
                cadm.setH24(fila.get(i)[54]);
                cadm.setV24(fila.get(i)[55]);

                listaCalidad.add(cadm);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCalidad;
    }
}