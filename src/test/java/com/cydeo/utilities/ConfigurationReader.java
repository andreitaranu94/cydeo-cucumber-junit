package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1 - Create the object of Properties

    private static Properties properties = new Properties();

    static {

        try {
            //2- We need to open the file in java memory

            FileInputStream file = new FileInputStream("configuration.properties");

            //3 - load the properties obj using FileInputStream obj

            properties.load(file);

            //close file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the configurationReader class.");
            e.printStackTrace();

        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}
