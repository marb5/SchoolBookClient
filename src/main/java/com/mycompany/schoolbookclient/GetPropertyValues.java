package com.mycompany.schoolbookclient;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author marcin
 */
public class GetPropertyValues {
    private InputStream inputStream;
    private String host;
    private int port;
    
    GetPropertyValues() throws IOException {
        Properties prop = new Properties();
	String propFileName = "config.properties";
        
        try {
            //to reading from configuration file
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            host = prop.getProperty("host");
            try {
                port = Integer.parseInt(prop.getProperty("port"));
            }
            catch (NumberFormatException e) {
                System.out.println("Exception: " + e);
            }
        }
        catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
        finally {
            inputStream.close();
        }
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
    
    
}
