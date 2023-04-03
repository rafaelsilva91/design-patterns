package com.developer.factorymethod.contatos;

import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ContatosCSV implements Contatos{

    private String fileName;

    public ContatosCSV(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Contato> todos() {

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
}
