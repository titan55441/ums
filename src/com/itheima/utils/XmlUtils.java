package com.itheima.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by batcave on 16/2/19.
 */
public class XmlUtils {
    // TODO: 16/2/19 location
    private static String xmlPath = "/Users/batcave/IdeaProjects/ums/web/user_db.xml";

    public static Document getDocument() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        return saxReader.read(new File(xmlPath));
    }

    public static void saveXML(Document document) throws IOException {
        FileOutputStream out = new FileOutputStream(new File(xmlPath));

        XMLWriter xmlWriter = new XMLWriter(out, OutputFormat.createPrettyPrint());

        xmlWriter.write(document);
        xmlWriter.close();

    }
}

