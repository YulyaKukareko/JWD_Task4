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
public class LetterTest {

    @Test
    public void testAdd() throws Exception {
        String expected = "A";
        Letter letter = new Letter();
        Character character = 'A';

        letter.add(character);

        assertEquals(expected, letter.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        Letter letter = new Letter();
        Character character = null;

        letter.add(character);
    }

    @Test
    public void testGetElements() {
        List<TextElement> expected = new ArrayList<>();
        Letter letter = new Letter('A');

        expected.add(letter);

        assertEquals(expected, letter.getElements());
    }
}
