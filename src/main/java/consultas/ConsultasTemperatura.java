package consultas;

import servicioCsv.primeraPractica.entidades.CalidadAireDatosMeteoMes;
import servicioXml.TemperaturaService;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConsultasTemperatura {

    public void mediaTemperatura(String municipio, String magnitud) {
        List<CalidadAireDatosMeteoMes> mediciones;
        CalidadAireDatosMeteoMes calidad = new CalidadAireDatosMeteoMes();
        TemperaturaService servicio = new TemperaturaService();
        mediciones = servicio.procesarArchivoTemperatura();
        List<CalidadAireDatosMeteoMes> medicionesLocalidad = mediciones.stream().filter(p -> p.getMunicipio().equals(municipio)
                && p.getMagnitud().equals(magnitud)).collect(Collectors.toList());
        //medicionesLocalidad.stream().collect(Collectors.averagingDouble(calidad.getH01()));


        Optional<CalidadAireDatosMeteoMes> product = medicionesLocalidad.stream().max(Comparator.comparing(CalidadAireDatosMeteoMes::getH01));
        System.out.println(product.get());
        System.out.println();

    }
}
