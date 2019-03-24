package by.epam.javawebtraining.kukareko.task4.view;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class FileRenderer implements Renderer {

    public static final Logger LOGGER_CHARACTER_RENDER;

    static {
        LOGGER_CHARACTER_RENDER = Logger.getLogger(FileRenderer.class);
    }

    @Override
    public void render(String data, String filePath, boolean isAppend) {

        try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath, isAppend))) {

            br.write(data);
            br.flush();

        } catch (IOException ex) {
            LOGGER_CHARACTER_RENDER.error(ex.getMessage());
        }
    }
}
