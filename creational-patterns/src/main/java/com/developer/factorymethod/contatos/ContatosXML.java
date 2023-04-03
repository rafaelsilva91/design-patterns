package com.developer.factorymethod.contatos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class ContatosXML implements Contatos{

    private String fileName;

    public ContatosXML(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Contato> todos() {
        XStream xStream = new XStream();

        xStream.alias("contatos", List.class);
        xStream.alias("contato", Contato.class);

        URL arquivo = this.getClass().getResource("/" + fileName);
        return (List<Contato>) xStream.fromXML(arquivo);

    }
}
