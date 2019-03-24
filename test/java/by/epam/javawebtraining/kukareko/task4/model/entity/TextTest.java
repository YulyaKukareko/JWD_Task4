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
public class TextTest {

    private static Letter[] letters;
    private static Word[] words;
    private static Sentence[] sentences;
    private static Paragraph paragraph;

    @BeforeClass
    public static void init() {
        letters = new Letter[]{new Letter('A'), new Letter('b')};
        words = new Word[]{new Word(Arrays.asList(letters))};
        sentences = new Sentence[]{new Sentence(Arrays.asList(words))};
        paragraph = new Paragraph(Arrays.asList(sentences));
    }

    @Test
    public void testAdd() throws Exception {
        String expected = "Ab";
        Text text = new Text();

        text.add(paragraph);

        assertEquals(expected, text.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        Paragraph sentence = null;
        Text paragraph = new Text();

        paragraph.add(sentence);
    }

    @Test
    public void testGetElements() {
        List<TextElement> expected = new ArrayList<>();
        Text text = new Text(Arrays.asList(paragraph));

        expected.add(paragraph);

        assertEquals(expected, text.getElements());
    }
}
