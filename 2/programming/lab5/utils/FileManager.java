package org.example.utils;

//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Marshaller;
//import jakarta.xml.bind.Unmarshaller;
import org.example.collections.City;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class FileManager {
    private final CollectionManager collectionManager;

    public FileManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void saveToXml(String filePath){
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Create JAXB context for the CollectionManager class
            JAXBContext context = JAXBContext.newInstance(CollectionManager.class);
            Marshaller marshaller = context.createMarshaller();

            // Format the output for better readability
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshal the CollectionManager object to XML and save it to the file
            marshaller.marshal(collectionManager, writer);

            System.out.println("Collection saved to " + filePath);
        } catch (JAXBException e) {
            System.out.println("Error saving collection: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void loadCollectionFromXml(String filePath) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))){
            // Create a JAXB context for City Collection class
            JAXBContext context = JAXBContext.newInstance(CollectionManager.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Deserialize from XML file
            CollectionManager collection = (CollectionManager) unmarshaller.unmarshal(inputStream);

            // Get the TreeSet of Persons
            ArrayDeque<City> loadedCollection = collection.getCities();
            collectionManager.setCities(loadedCollection);
            System.out.println("Collection loaded successfully!");
        } catch (JAXBException e) {
            System.out.println("Error loading collection: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }


    public ArrayList<String> loadCommandsFromScript(String filePath){
        ArrayList<String> commands = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String command;
            while ((command = bufferedReader.readLine()) != null) {
                commands.add(command);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return commands;
    }
}
