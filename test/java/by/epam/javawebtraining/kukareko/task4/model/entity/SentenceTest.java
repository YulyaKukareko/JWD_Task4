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
public class SentenceTest {

    private static Letter[] letters;
    private static Word word;

    @BeforeClass
    public static void init() {
        letters = new Letter[]{new Letter('A'), new Letter('b')};
        word = new Word(Arrays.asList(letters));
    }

    @Test
    public void testAdd() throws Exception {
        String expected = "Ab";
        Sentence sentence = new Sentence();

        sentence.add(word);

        assertEquals(expected, sentence.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        Word word = null;
        Sentence sentence = new Sentence();

        sentence.add(word);
    }

    @Test
    public void testGetElements() {
        List<TextElement> expected = new ArrayList<>();
        Sentence sentence = new Sentence(Arrays.asList(word));

        expected.add(word);

        assertEquals(expected, sentence.getElements());
    }
}
