package consultas;

import servicioCsv.primeraPractica.entidades.CalidadAireDatosMeteoMes;
import servicioXml.TemperaturaService;

import java.util.List;
import java.util.stream.Collectors;


public class ConsultasTemperatura {

    public void consultasTemp(String municipio, String magnitud) {
        List<CalidadAireDatosMeteoMes> mediciones;
        TemperaturaService servicio = new TemperaturaService();
        mediciones = servicio.procesarArchivoTemperatura();
        List<CalidadAireDatosMeteoMes> medicionesLocalidad = mediciones.stream().filter(p -> p.getMunicipio().equals(municipio)
                && p.getMagnitud().equals(magnitud)).collect(Collectors.toList());
        medicionesLocalidad.forEach(System.out::println);


    }
}
