package by.epam.javawebtraining.kukareko.task4.model.entity;

import static org.junit.Assert.*;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yulya Kukareko
 * @version 1.0 24 Mar 2019
 */
public class CodeTest {

    @Test
    public void testAdd() throws Exception {
        String expected = "int i = 2;";
        String addElement = "int i = 2;";
        Code code = new Code();

        code.add(addElement);

        assertEquals(expected, code.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        String addElement = null;
        Code code = new Code();

        code.add(addElement);
    }

    @Test
    public void testGetElements() throws Exception {
        List<TextElement> expected = new ArrayList<>();
        Code code = new Code("int i = 2;");
        expected.add(code);

        assertEquals(expected, code.getElements());
    }
}
