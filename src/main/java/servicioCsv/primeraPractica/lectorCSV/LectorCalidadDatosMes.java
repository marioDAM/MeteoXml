package servicioCsv.primeraPractica.lectorCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import servicioCsv.primeraPractica.entidades.CalidadAireDatosMes;
import servicioCsv.primeraPractica.settings.Settings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorCalidadDatosMes {
    List<CalidadAireDatosMes> calidadAire = new ArrayList();

    /**
     * Clase que procesa el archivo y lo lee correctamente llenando los atributos de la entidad CalidadAireDatosMes
     *
     * @return @List type of CalidadAireDatosMes
     * @throws IOException
     */
    public List<CalidadAireDatosMes> procesarCalidadDatosMes() throws IOException {
        System.out.println("Estas procesando el archivo CALIDAD DATOS MES");
        try (CSVReader reader = new CSVReader(new FileReader(Settings.direccion1))) {
            List<String[]> fila = reader.readAll();
            calidadAire = new ArrayList<>();
            for (int i = 1; i < fila.size(); i++) {
                CalidadAireDatosMes cADM = new CalidadAireDatosMes();
                String[] p = fila.get(i)[0].split(";");
                cADM.setProvincia(p[0]);
                cADM.setMunicipio(p[1]);
                cADM.setEstacion(p[2]);
                cADM.setMagnitud(p[3]);
                cADM.setPunto_muestreo(p[4]);
                cADM.setAno(Integer.parseInt(p[5]));
                cADM.setMes(Integer.parseInt(p[6]));
                cADM.setDia(Integer.parseInt(p[7]));
                cADM.setH01(p[8]);
                cADM.setV01(p[9]);
                cADM.setH02(p[10]);
                cADM.setV02(p[11]);
                cADM.setH03(p[12]);
                cADM.setV03(p[13]);
                cADM.setH04(p[14]);
                cADM.setV04(p[15]);
                cADM.setH05(p[16]);
                cADM.setV05(p[17]);
                cADM.setH06(p[18]);
                cADM.setV06(p[19]);
                cADM.setH07(p[20]);
                cADM.setV07(p[21]);
                cADM.setH08(p[22]);
                cADM.setV08(p[23]);
                cADM.setH09(p[24]);
                cADM.setV09(p[25]);
                cADM.setH10(p[26]);
                cADM.setV10(p[27]);
                cADM.setH11(p[28]);
                cADM.setV11(p[29]);
                cADM.setH12(p[30]);
                cADM.setV12(p[31]);
                cADM.setH13(p[32]);
                cADM.setV13(p[33]);
                cADM.setH14(p[34]);
                cADM.setV14(p[35]);
                cADM.setH15(p[36]);
                cADM.setV15(p[37]);
                cADM.setH16(p[38]);
                cADM.setV16(p[39]);
                cADM.setH17(p[40]);
                cADM.setV17(p[41]);
                cADM.setH18(p[42]);
                cADM.setV18(p[43]);
                cADM.setH19(p[44]);
                cADM.setV19(p[45]);
                cADM.setH20(p[46]);
                cADM.setV20(p[47]);
                cADM.setH21(p[48]);
                cADM.setV21(p[49]);
                cADM.setH22(p[50]);
                cADM.setV22(p[51]);
                cADM.setH23(p[52]);
                cADM.setV23(p[53]);
                cADM.setH24(p[54]);
                cADM.setV24(p[55]);
                calidadAire.add(cADM);
            }
        } catch (FileNotFoundException | CsvException e) {
            e.printStackTrace();
        }

        return calidadAire;
    }
}

