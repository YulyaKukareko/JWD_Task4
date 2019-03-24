package by.epam.javawebtraining.kukareko.task4.util.io;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Reader {

    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(Reader.class);
    }

    public static String read(String filePath) {
        StringBuilder result = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            result = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                result.append(line + "\n");
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
        }
        return result.toString();
    }
}
