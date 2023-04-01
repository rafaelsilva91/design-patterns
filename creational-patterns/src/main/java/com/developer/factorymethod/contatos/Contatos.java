package com.developer.factorymethod.contatos;

import au.com.bytecode.opencsv.CSVReader;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Contatos {

    public List<Contato> recuperarContatosCSV(String fileName) {

        List<Contato> contatos = new ArrayList<>();
        CSVReader csvReader  = null;

        try{
            URI uri = this.getClass().getResource("/"+fileName).toURI();
            File arquivoCsv = new File(uri);
            FileReader fileReader = new FileReader(arquivoCsv);
            csvReader = new CSVReader(fileReader);

            String[] nextLine;

            while((nextLine = csvReader.readNext()) != null){
                contatos.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
            }

        } catch (URISyntaxException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                csvReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return contatos;
    }


    @SuppressWarnings("unchecked")
    public List<Contato> recuperarContatosXML(String fileName){

        XStream xStream = new XStream();

        xStream.alias("contatos", List.class);
        xStream.alias("contato", Contato.class);

        URL arquivo = this.getClass().getResource("/"+fileName);
        return (List<Contato>) xStream.fromXML(arquivo);

    }
}
