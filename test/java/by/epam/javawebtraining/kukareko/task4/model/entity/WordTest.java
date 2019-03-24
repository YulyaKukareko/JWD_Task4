package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Yulya Kukareko
 * @version 1.0 24 Mar 2019
 */
public class WordTest {

    private static Letter[] letters;

    @BeforeClass
    public static void init() {
        letters = new Letter[]{new Letter('A'), new Letter('b')};
    }

    @Test
    public void testAdd() throws Exception {
        String expected = "A";
        Word word = new Word();

        word.add(letters[0]);

        assertEquals(expected, word.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        Letter letter = null;
        Word sentence = new Word();

        sentence.add(letter);
    }

    @Test
    public void testGetElements() {
        List<TextElement> expected = new ArrayList<>();
        Word word = new Word(Arrays.asList(letters));

        expected.addAll(Arrays.asList(letters));

        assertEquals(expected, word.getElements());
    }
}
