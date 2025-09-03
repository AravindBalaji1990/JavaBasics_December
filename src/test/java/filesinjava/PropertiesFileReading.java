package filesinjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReading {

    public static void main(String[] args) throws IOException {
        //creat a object for the items inside the properties file
        Properties prop = new Properties();


        // laod file
        FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data/config.properties");
        prop.load(fi);
        fi.close();

        System.out.println(prop.get("username"));
        System.out.println(prop.get("password"));
        System.out.println(prop.get("url"));


    }
}
