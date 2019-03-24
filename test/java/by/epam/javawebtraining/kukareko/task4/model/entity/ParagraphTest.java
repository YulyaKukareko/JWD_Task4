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
public class ParagraphTest {

    private static Letter[] letters;
    private static Word[] words;
    private static Sentence sentence;

    @BeforeClass
    public static void init() {
        letters = new Letter[]{new Letter('A'), new Letter('b')};
        words = new Word[]{new Word(Arrays.asList(letters))};
        sentence = new Sentence(Arrays.asList(words));
    }

    @Test
    public void testAdd() throws Exception {
        String expected = "Ab";
        Paragraph paragraph = new Paragraph();

        paragraph.add(sentence);

        assertEquals(expected, sentence.getTextElement());
    }

    @Test(expected = AddNullElementException.class)
    public void testAddNull() throws Exception {
        Sentence sentence = null;
        Paragraph paragraph = new Paragraph();

        paragraph.add(sentence);
    }

    @Test
    public void testGetElements() {
        List<TextElement> expected = new ArrayList<>();
        Paragraph paragraph = new Paragraph(Arrays.asList(sentence));

        expected.add(sentence);

        assertEquals(expected, paragraph.getElements());
    }
}
