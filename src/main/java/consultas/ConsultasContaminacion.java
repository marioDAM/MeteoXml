package consultas;

import servicioCsv.primeraPractica.entidades.CalidadAireDatosMes;
import servicioXml.ContaminacionService;
import java.util.List;

public class ConsultasContaminacion {

    public void consultasCont(String municipio, String magnitud) {

        List<CalidadAireDatosMes> mediciones;
        CalidadAireDatosMes calidad = new CalidadAireDatosMes();
        ContaminacionService servicio = new ContaminacionService();
        mediciones = servicio.procesarArchivoContaminacion();
        mediciones.stream().filter(p -> p.getMunicipio().equals(municipio) && p.getMagnitud().equals(magnitud)).forEach(System.out::println);

    }

}
