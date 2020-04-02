package com.dev;

import com.dev.model.Record;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbMain {


    public static void main(String[] args) throws JAXBException {

        File file = new File("src/main/resources/test.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Record.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Record record = (Record) unmarshaller.unmarshal(file);
        System.out.println(record);


    }

}
