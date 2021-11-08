package jdom;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import servicioCsv.primeraPractica.entidades.CalidadAireDatosMes;
import servicioCsv.primeraPractica.lectorCSV.LectorCalidadDatosMes;
;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JDomControllerContaminacion {
    private Document document;
    private static JDomControllerContaminacion controller;
    private String uri;


    public JDomControllerContaminacion(String uri) {
        this.uri = uri;
    }

    public static JDomControllerContaminacion getInstance(String uri) {
        if (controller == null)
            controller = new JDomControllerContaminacion(uri);
        return controller;

    }

    public Element createElement(CalidadAireDatosMes calAireDatos) {
        Element element = new Element("Mediciones");
        element.addContent(new Element("provincia").setText(calAireDatos.getProvincia()));
        element.addContent(new Element("municipio").setText(calAireDatos.getMunicipio()));
        element.addContent(new Element("estacion").setText(calAireDatos.getEstacion()));
        element.addContent(new Element("magnitud").setText(calAireDatos.getMagnitud()));
        element.addContent(new Element("puntoMuestreo").setText(calAireDatos.getPunto_muestreo()));
        element.addContent(new Element("año").setText(Integer.toString(calAireDatos.getAno())));
        //element.setAttribute("año", Integer.toString(calAireDatos.getAno()));
        element.addContent(new Element("mes").setText(Integer.toString(calAireDatos.getMes())));
        //element.setAttribute("mes", Integer.toString(calAireDatos.getMes()));
        element.addContent(new Element("dia").setText(Integer.toString(calAireDatos.getDia())));

        //element.setAttribute("dia", Integer.toString(calAireDatos.getDia()));
        element.addContent(new Element("h01").setText(calAireDatos.getH01()));
        element.addContent(new Element("v01").setText(calAireDatos.getV01()));
        element.addContent(new Element("h02").setText(calAireDatos.getH02()));
        element.addContent(new Element("v02").setText(calAireDatos.getV02()));
        element.addContent(new Element("h03").setText(calAireDatos.getH03()));
        element.addContent(new Element("v03").setText(calAireDatos.getV03()));
        element.addContent(new Element("h04").setText(calAireDatos.getH04()));
        element.addContent(new Element("v04").setText(calAireDatos.getV04()));
        element.addContent(new Element("h05").setText(calAireDatos.getH05()));
        element.addContent(new Element("v05").setText(calAireDatos.getV05()));
        element.addContent(new Element("h06").setText(calAireDatos.getH06()));
        element.addContent(new Element("v06").setText(calAireDatos.getV06()));
        element.addContent(new Element("h07").setText(calAireDatos.getH07()));
        element.addContent(new Element("v07").setText(calAireDatos.getV07()));
        element.addContent(new Element("h08").setText(calAireDatos.getH08()));
        element.addContent(new Element("v08").setText(calAireDatos.getV08()));
        element.addContent(new Element("h09").setText(calAireDatos.getH09()));
        element.addContent(new Element("v09").setText(calAireDatos.getV09()));
        element.addContent(new Element("h10").setText(calAireDatos.getH10()));
        element.addContent(new Element("v10").setText(calAireDatos.getV10()));
        element.addContent(new Element("h11").setText(calAireDatos.getH11()));
        element.addContent(new Element("v11").setText(calAireDatos.getV11()));
        element.addContent(new Element("h12").setText(calAireDatos.getH12()));
        element.addContent(new Element("v12").setText(calAireDatos.getV12()));
        element.addContent(new Element("h13").setText(calAireDatos.getH13()));
        element.addContent(new Element("v13").setText(calAireDatos.getV13()));
        element.addContent(new Element("h14").setText(calAireDatos.getH14()));
        element.addContent(new Element("v14").setText(calAireDatos.getV14()));
        element.addContent(new Element("h15").setText(calAireDatos.getH15()));
        element.addContent(new Element("v15").setText(calAireDatos.getV15()));
        element.addContent(new Element("h16").setText(calAireDatos.getH16()));
        element.addContent(new Element("v16").setText(calAireDatos.getV16()));
        element.addContent(new Element("h17").setText(calAireDatos.getH17()));
        element.addContent(new Element("v17").setText(calAireDatos.getV17()));
        element.addContent(new Element("h18").setText(calAireDatos.getH18()));
        element.addContent(new Element("v18").setText(calAireDatos.getV18()));
        element.addContent(new Element("h19").setText(calAireDatos.getH19()));
        element.addContent(new Element("v19").setText(calAireDatos.getV19()));
        element.addContent(new Element("h20").setText(calAireDatos.getH20()));
        element.addContent(new Element("v20").setText(calAireDatos.getV20()));
        element.addContent(new Element("h21").setText(calAireDatos.getH21()));
        element.addContent(new Element("v21").setText(calAireDatos.getV21()));
        element.addContent(new Element("h22").setText(calAireDatos.getH22()));
        element.addContent(new Element("v22").setText(calAireDatos.getV22()));
        element.addContent(new Element("h23").setText(calAireDatos.getH23()));
        element.addContent(new Element("v23").setText(calAireDatos.getV23()));
        element.addContent(new Element("h24").setText(calAireDatos.getH24()));
        element.addContent(new Element("v24").setText(calAireDatos.getV24()));
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

    public List<CalidadAireDatosMes> getCalidadAire() throws IOException {
        Element root = document.getRootElement();
        List<Element> listCali = root.getChildren("Mediciones");
        //  inicializamos la lista de personas
        List<CalidadAireDatosMes> calidadList;
        LectorCalidadDatosMes l = new LectorCalidadDatosMes();
        calidadList = l.procesarCalidadDatosMes();
        listCali.forEach(calidadElenent -> {

            CalidadAireDatosMes calidad = new CalidadAireDatosMes();
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

    public void addElemento(CalidadAireDatosMes calidad) {
        Element root = document.getRootElement();
        root.addContent(createElement(calidad));
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
