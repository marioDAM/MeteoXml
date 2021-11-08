
import consultas.ConsultasContaminacion;
import consultas.ConsultasTemperatura;
import servicioXml.ContaminacionService;
import servicioXml.TemperaturaService;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        //Creando xml de contaminacion
        ContaminacionService servicio = new ContaminacionService();
        //servicio.crearArchivoContaminacion();
        //Procesando y leyendo archivo de contaminacion
        //servicio.procesarArchivoContaminacion();

        //Creando xml de temperatura
        TemperaturaService service = new TemperaturaService();
        //service.crearArchivoTemperatura();
        //Mostrando y procesando archivo de temperatura
        //service.procesarArchivoTemperatura();

        String localidad = args[0];
        String magnitud = args[1];
        ConsultasContaminacion c = new ConsultasContaminacion();
        //c.mediaContaminacion(localidad, magnitud);
        ConsultasTemperatura t = new ConsultasTemperatura();
        t.mediaTemperatura(localidad, magnitud);

    }
}

