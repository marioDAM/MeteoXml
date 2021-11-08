package jdom;

import lombok.NoArgsConstructor;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import servicioCsv.primeraPractica.entidades.CalidadAireDatosMeteoMes;
import servicioCsv.primeraPractica.lectorCSV.LectorCalidadDatosMeteoMes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@NoArgsConstructor
public class JDomControllerTemperatura {
    private Document document;
    private static JDomControllerTemperatura controller;
    private String uri;

    public JDomControllerTemperatura(String uri) {
        this.uri = uri;
    }

    public static JDomControllerTemperatura getInstance(String uri) {
        if (controller == null)
            controller = new JDomControllerTemperatura(uri);
        return controller;

    }

    /**
     * Hemos decicio generar el xml usando JDom, debido a que era con el mejor nos familiarizabamos.
     * En un principio se ve como habiamos generado atributos, pero luego al tener un complicacion decidimos das marcha atrás
     * y y volver a generar el xml pero estos datos siendo elementos.
     * @param calAireMeteoDatos
     * @return Element
     */
    public Element createElementContaminacion(CalidadAireDatosMeteoMes calAireMeteoDatos) {
        Element element = new Element("Mediciones");
        element.addContent(new Element("provincia").setText(calAireMeteoDatos.getProvincia()));
        element.addContent(new Element("municipio").setText(calAireMeteoDatos.getMunicipio()));
        element.addContent(new Element("estacion").setText(calAireMeteoDatos.getEstacion()));
        element.addContent(new Element("magnitud").setText(calAireMeteoDatos.getMagnitud()));
        element.addContent(new Element("puntoMuestreo").setText(calAireMeteoDatos.getPunto_muestreo()));
        element.addContent(new Element("año").setText(Integer.toString(calAireMeteoDatos.getAno())));
        //element.setAttribute("año", Integer.toString(calAireMeteoDatos.getAno()));
        element.addContent(new Element("mes").setText(Integer.toString(calAireMeteoDatos.getMes())));
        //element.setAttribute("mes", Integer.toString(calAireMeteoDatos.getMes()));
        element.addContent(new Element("dia").setText(Integer.toString(calAireMeteoDatos.getDia())));
        //element.setAttribute("dia", Integer.toString(calAireMeteoDatos.getDia()));
        element.addContent(new Element("h01").setText(calAireMeteoDatos.getH01()));
        element.addContent(new Element("v01").setText(calAireMeteoDatos.getV01()));
        element.addContent(new Element("h02").setText(calAireMeteoDatos.getH02()));
        element.addContent(new Element("v02").setText(calAireMeteoDatos.getV02()));
        element.addContent(new Element("h03").setText(calAireMeteoDatos.getH03()));
        element.addContent(new Element("v03").setText(calAireMeteoDatos.getV03()));
        element.addContent(new Element("h04").setText(calAireMeteoDatos.getH04()));
        element.addContent(new Element("v04").setText(calAireMeteoDatos.getV04()));
        element.addContent(new Element("h05").setText(calAireMeteoDatos.getH05()));
        element.addContent(new Element("v05").setText(calAireMeteoDatos.getV05()));
        element.addContent(new Element("h06").setText(calAireMeteoDatos.getH06()));
        element.addContent(new Element("v06").setText(calAireMeteoDatos.getV06()));
        element.addContent(new Element("h07").setText(calAireMeteoDatos.getH07()));
        element.addContent(new Element("v07").setText(calAireMeteoDatos.getV07()));
        element.addContent(new Element("h08").setText(calAireMeteoDatos.getH08()));
        element.addContent(new Element("v08").setText(calAireMeteoDatos.getV08()));
        element.addContent(new Element("h09").setText(calAireMeteoDatos.getH09()));
        element.addContent(new Element("v09").setText(calAireMeteoDatos.getV09()));
        element.addContent(new Element("h10").setText(calAireMeteoDatos.getH10()));
        element.addContent(new Element("v10").setText(calAireMeteoDatos.getV10()));
        element.addContent(new Element("h11").setText(calAireMeteoDatos.getH11()));
        element.addContent(new Element("v11").setText(calAireMeteoDatos.getV11()));
        element.addContent(new Element("h12").setText(calAireMeteoDatos.getH12()));
        element.addContent(new Element("v12").setText(calAireMeteoDatos.getV12()));
        element.addContent(new Element("h13").setText(calAireMeteoDatos.getH13()));
        element.addContent(new Element("v13").setText(calAireMeteoDatos.getV13()));
        element.addContent(new Element("h14").setText(calAireMeteoDatos.getH14()));
        element.addContent(new Element("v14").setText(calAireMeteoDatos.getV14()));
        element.addContent(new Element("h15").setText(calAireMeteoDatos.getH15()));
        element.addContent(new Element("v15").setText(calAireMeteoDatos.getV15()));
        element.addContent(new Element("h16").setText(calAireMeteoDatos.getH16()));
        element.addContent(new Element("v16").setText(calAireMeteoDatos.getV16()));
        element.addContent(new Element("h17").setText(calAireMeteoDatos.getH17()));
        element.addContent(new Element("v17").setText(calAireMeteoDatos.getV17()));
        element.addContent(new Element("h18").setText(calAireMeteoDatos.getH18()));
        element.addContent(new Element("v18").setText(calAireMeteoDatos.getV18()));
        element.addContent(new Element("h19").setText(calAireMeteoDatos.getH19()));
        element.addContent(new Element("v19").setText(calAireMeteoDatos.getV19()));
        element.addContent(new Element("h20").setText(calAireMeteoDatos.getH20()));
        element.addContent(new Element("v20").setText(calAireMeteoDatos.getV20()));
        element.addContent(new Element("h21").setText(calAireMeteoDatos.getH21()));
        element.addContent(new Element("v21").setText(calAireMeteoDatos.getV21()));
        element.addContent(new Element("h22").setText(calAireMeteoDatos.getH22()));
        element.addContent(new Element("v22").setText(calAireMeteoDatos.getV22()));
        element.addContent(new Element("h23").setText(calAireMeteoDatos.getH23()));
        element.addContent(new Element("v23").setText(calAireMeteoDatos.getV23()));
        element.addContent(new Element("h24").setText(calAireMeteoDatos.getH24()));
        element.addContent(new Element("v24").setText(calAireMeteoDatos.getV24()));
        return element;
    }


    public void loadData() throws IOException, JDOMException {
        SAXBuilder saxBuilder = new SAXBuilder();
        File file = new File(uri);
        document = saxBuilder.build(file);
    }

    public void initData() {
        // Documento vacío
        document = new Document();
        //Indicamos desde donde queremos empezar a recorrer el archivo
        //Inicializa y guarda el objeto Document
        document.setRootElement(new Element("Mediciones"));
    }

    public List<CalidadAireDatosMeteoMes> getCalidadAire() throws IOException {
        Element root = document.getRootElement();
        List<Element> listCali = root.getChildren("Mediciones");
        //  inicializamos la lista de personas
        List<CalidadAireDatosMeteoMes> calidadList;
        LectorCalidadDatosMeteoMes l = new LectorCalidadDatosMeteoMes();
        calidadList = l.procesarCalidadDatosMeteoMes();
        listCali.forEach(calidadElenent -> {

            CalidadAireDatosMeteoMes calidad = new CalidadAireDatosMeteoMes();
            calidad.setProvincia(calidadElenent.getChildText("provincia"));
            calidad.setMunicipio(calidadElenent.getChildText("municipio"));
            calidad.setEstacion(calidadElenent.getChildText("estacion"));
            calidad.setMagnitud(calidadElenent.getChildText("magnitud"));
            calidad.setPunto_muestreo(calidadElenent.getChildText("puntoMuestreo"));
            calidad.setAno(Integer.parseInt(calidadElenent.getChildText("año")));
            calidad.setMes(Integer.parseInt(calidadElenent.getChildText("mes")));
            calidad.setDia(Integer.parseInt(calidadElenent.getChildText("dia")));
            calidad.setH01(calidadElenent.getChildText("h01"));
            calidad.setV01(calidadElenent.getChildText("v01"));
            calidad.setH02(calidadElenent.getChildText("h02"));
            calidad.setV02(calidadElenent.getChildText("v02"));
            calidad.setH03(calidadElenent.getChildText("h03"));
            calidad.setV03(calidadElenent.getChildText("v03"));
            calidad.setH04(calidadElenent.getChildText("h04"));
            calidad.setV04(calidadElenent.getChildText("v04"));
            calidad.setH05(calidadElenent.getChildText("h05"));
            calidad.setV05(calidadElenent.getChildText("v05"));
            calidad.setH06(calidadElenent.getChildText("h06"));
            calidad.setV06(calidadElenent.getChildText("v06"));
            calidad.setH07(calidadElenent.getChildText("h07"));
            calidad.setV07(calidadElenent.getChildText("v07"));
            calidad.setH08(calidadElenent.getChildText("h08"));
            calidad.setV08(calidadElenent.getChildText("v08"));
            calidad.setH09(calidadElenent.getChildText("h09"));
            calidad.setV09(calidadElenent.getChildText("v09"));
            calidad.setH10(calidadElenent.getChildText("h10"));
            calidad.setV10(calidadElenent.getChildText("v10"));
            calidad.setH11(calidadElenent.getChildText("h11"));
            calidad.setV11(calidadElenent.getChildText("v11"));
            calidad.setH12(calidadElenent.getChildText("h12"));
            calidad.setV12(calidadElenent.getChildText("v12"));
            calidad.setH13(calidadElenent.getChildText("h13"));
            calidad.setV13(calidadElenent.getChildText("v13"));
            calidad.setH14(calidadElenent.getChildText("h14"));
            calidad.setV14(calidadElenent.getChildText("v14"));
            calidad.setH15(calidadElenent.getChildText("h15"));
            calidad.setV15(calidadElenent.getChildText("v15"));
            calidad.setH16(calidadElenent.getChildText("h16"));
            calidad.setV16(calidadElenent.getChildText("v16"));
            calidad.setH17(calidadElenent.getChildText("h17"));
            calidad.setV17(calidadElenent.getChildText("v17"));
            calidad.setH18(calidadElenent.getChildText("h18"));
            calidad.setV18(calidadElenent.getChildText("v18"));
            calidad.setH19(calidadElenent.getChildText("h19"));
            calidad.setV19(calidadElenent.getChildText("v19"));
            calidad.setH20(calidadElenent.getChildText("h20"));
            calidad.setV20(calidadElenent.getChildText("v20"));
            calidad.setH21(calidadElenent.getChildText("h21"));
            calidad.setV21(calidadElenent.getChildText("v21"));
            calidad.setH22(calidadElenent.getChildText("h22"));
            calidad.setV22(calidadElenent.getChildText("v22"));
            calidad.setH23(calidadElenent.getChildText("h23"));
            calidad.setV23(calidadElenent.getChildText("v23"));
            calidad.setH24(calidadElenent.getChildText("h24"));
            calidad.setV24(calidadElenent.getChildText("v24"));


            calidadList.add(calidad);
        });
        return calidadList;
    }

    public void addElement(CalidadAireDatosMeteoMes calidad) {
        Element root = document.getRootElement();
        root.addContent(createElementContaminacion(calidad));
    }

    private XMLOutputter preProcess() {
        XMLOutputter xmlOutput = new XMLOutputter();
        xmlOutput.setFormat(Format.getPrettyFormat());
        return xmlOutput;
    }

    public void writeXMLFile(String uri) throws IOException {
        XMLOutputter xmlOutput = preProcess();
        xmlOutput.output(document, new FileWriter(uri));
        System.out.println("Fichero XML generado con éxito");
    }

    public void printXML() throws IOException {
        XMLOutputter xmlOutput = preProcess();
        xmlOutput.output(document, System.out);
    }

}
