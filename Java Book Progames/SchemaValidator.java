/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author hp
 */
public class SchemaValidator {

    public static void main(String[]args){
        try {
            String xmlFile = "C://Users//hp//Documents//NetBeansProjects//XML//src//xml/question.xml", schemaFile = "C://Users//hp//Documents//NetBeansProjects//XML//src//xml/question.xml";
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            //get xsd schema specifying the required format for the xml files.
            Schema schemaXsd = schemaFactory.newSchema(new File(schemaFile));
            //Get a Validator that can validate XML files according to the schema.
            Validator validator = schemaXsd.newValidator();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Get a parser Capable of parsing XML into a DOM tree.
            DocumentBuilder parser = factory.newDocumentBuilder();
            //parse the XML purely as XML and get a DOM tree representation.
            Document doc = parser.parse(new File(xmlFile));
            //parse the XML DOM tree againts the XSD schema
            validator.validate(new DOMSource(doc));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
