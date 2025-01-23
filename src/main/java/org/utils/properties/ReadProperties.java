package org.utils.properties;

import org.constants.IConstant;
import org.utils.repository.IConfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Mohammad Shahnawaz
 */
public class ReadProperties {
    public static final String get(final String key){
        Properties properties=new Properties();
        try {
            properties.load(file());
        }catch (IOException ie){
            System.out.println("File exception found");
            ie.printStackTrace();
        }
        if(properties.containsKey(key))
            return properties.getProperty(key);
        else
            return "keys not found";
    }
    private static FileInputStream file(){
        FileInputStream inputStream=null;
        try {
            inputStream= new FileInputStream(IConstant.TEST_PROPERTIES_FILE + "config.properties");
        }catch (IOException ie){
            System.out.println("File not found");
            ie.printStackTrace();
        }
        return inputStream;
    }

}
