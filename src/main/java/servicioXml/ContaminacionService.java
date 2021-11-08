package servicioXml;

import jdom.JDomControllerContaminacion;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import servicioCsv.primeraPractica.entidades.CalidadAireDatosMes;
import servicioCsv.primeraPractica.lectorCSV.LectorCalidadDatosMes;
import servicioCsv.primeraPractica.settings.Settings;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContaminacionService {

    public void crearArchivoContaminacion() throws IOException {
        LectorCalidadDatosMes lcdm = new LectorCalidadDatosMes();
        JDomControllerContaminacion controller = new JDomControllerContaminacion(Settings.contaminacion);
        controller.initData();
        lcdm.procesarCalidadDatosMes().forEach(calidadAireDatosMes -> controller.addElemento(calidadAireDatosMes));
        controller.writeXMLFile(Settings.contaminacion);
        System.out.println(controller.getCalidadAire().size());
        //controller.printXML();
    }

    public List<CalidadAireDatosMes> procesarArchivoContaminacion() {
        File file = new File(Settings.contaminacion);
        List<CalidadAireDatosMes> mediciones = new ArrayList<>();

        if (file.exists()) {

            try {
                //Creamos una instancia de document builder para que reconozca el xml
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = dbf.newDocumentBuilder();
                //Parseamos el documento xml a un objeto de tipo Document
                Document document = builder.parse(file);
                //Mejoramos el rendimineto del programa con normalize();
                document.getDocumentElement().normalize();
                //Creamos la lista y el nodo con el xml entero, es decir desde el elemento raiz
                NodeList nList = document.getElementsByTagName("Mediciones");
                for (int i = 0; i < nList.getLength(); i++) {
                    CalidadAireDatosMes c = new CalidadAireDatosMes();
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) nNode;


                        c.setProvincia(element.getElementsByTagName("provincia").item(0).getTextContent());
                        c.setMunicipio(element.getElementsByTagName("municipio").item(0).getTextContent());
                        c.setEstacion(element.getElementsByTagName("estacion").item(0).getTextContent());
                        c.setMagnitud(element.getElementsByTagName("magnitud").item(0).getTextContent());
                        c.setPunto_muestreo(element.getElementsByTagName("puntoMuestreo").item(0).getTextContent());

                        c.setAno(Integer.parseInt(element.getElementsByTagName("año").item(0).getTextContent()));
                        c.setMes(Integer.parseInt(element.getElementsByTagName("mes").item(0).getTextContent()));
                        c.setDia(Integer.parseInt(element.getElementsByTagName("año").item(0).getTextContent()));

//                        c.setAno(Integer.parseInt(eElement.getAttribute("año")));
//                        c.setMes(Integer.parseInt(eElement.getAttribute("mes")));
//                        c.setDia(Integer.parseInt(eElement.getAttribute("dia")));

                        c.setH01(element.getElementsByTagName("h01").item(0).getTextContent());
                        c.setV01(element.getElementsByTagName("v01").item(0).getTextContent());
                        c.setH02(element.getElementsByTagName("h02").item(0).getTextContent());
                        c.setV02(element.getElementsByTagName("v02").item(0).getTextContent());
                        c.setH03(element.getElementsByTagName("h03").item(0).getTextContent());
                        c.setV03(element.getElementsByTagName("v03").item(0).getTextContent());
                        c.setH04(element.getElementsByTagName("h04").item(0).getTextContent());
                        c.setV04(element.getElementsByTagName("v04").item(0).getTextContent());
                        c.setH05(element.getElementsByTagName("h05").item(0).getTextContent());
                        c.setV05(element.getElementsByTagName("v05").item(0).getTextContent());
                        c.setH06(element.getElementsByTagName("h06").item(0).getTextContent());
                        c.setV06(element.getElementsByTagName("v06").item(0).getTextContent());
                        c.setH07(element.getElementsByTagName("h07").item(0).getTextContent());
                        c.setV07(element.getElementsByTagName("v07").item(0).getTextContent());
                        c.setH08(element.getElementsByTagName("h08").item(0).getTextContent());
                        c.setV08(element.getElementsByTagName("v08").item(0).getTextContent());
                        c.setH09(element.getElementsByTagName("h09").item(0).getTextContent());
                        c.setV09(element.getElementsByTagName("v09").item(0).getTextContent());
                        c.setH10(element.getElementsByTagName("h10").item(0).getTextContent());
                        c.setV10(element.getElementsByTagName("v10").item(0).getTextContent());
                        c.setH11(element.getElementsByTagName("h11").item(0).getTextContent());
                        c.setV11(element.getElementsByTagName("v11").item(0).getTextContent());
                        c.setH12(element.getElementsByTagName("h12").item(0).getTextContent());
                        c.setV12(element.getElementsByTagName("v12").item(0).getTextContent());
                        c.setH13(element.getElementsByTagName("h13").item(0).getTextContent());
                        c.setV13(element.getElementsByTagName("v13").item(0).getTextContent());
                        c.setH14(element.getElementsByTagName("h14").item(0).getTextContent());
                        c.setV14(element.getElementsByTagName("v14").item(0).getTextContent());
                        c.setH15(element.getElementsByTagName("h15").item(0).getTextContent());
                        c.setV15(element.getElementsByTagName("v15").item(0).getTextContent());
                        c.setH16(element.getElementsByTagName("h16").item(0).getTextContent());
                        c.setV16(element.getElementsByTagName("v16").item(0).getTextContent());
                        c.setH17(element.getElementsByTagName("h17").item(0).getTextContent());
                        c.setV17(element.getElementsByTagName("v17").item(0).getTextContent());
                        c.setH18(element.getElementsByTagName("h18").item(0).getTextContent());
                        c.setV18(element.getElementsByTagName("v18").item(0).getTextContent());
                        c.setH19(element.getElementsByTagName("h19").item(0).getTextContent());
                        c.setV19(element.getElementsByTagName("v19").item(0).getTextContent());
                        c.setH20(element.getElementsByTagName("h20").item(0).getTextContent());
                        c.setV20(element.getElementsByTagName("v20").item(0).getTextContent());
                        c.setH21(element.getElementsByTagName("h21").item(0).getTextContent());
                        c.setV21(element.getElementsByTagName("v21").item(0).getTextContent());
                        c.setH22(element.getElementsByTagName("h22").item(0).getTextContent());
                        c.setV22(element.getElementsByTagName("v22").item(0).getTextContent());
                        c.setH23(element.getElementsByTagName("h23").item(0).getTextContent());
                        c.setV23(element.getElementsByTagName("v23").item(0).getTextContent());
                        c.setH24(element.getElementsByTagName("h24").item(0).getTextContent());
                        c.setV24(element.getElementsByTagName("v24").item(0).getTextContent());
                        mediciones.add(c);
                    }

                }

                //mediciones.forEach(System.out::println);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mediciones;
    }
}
