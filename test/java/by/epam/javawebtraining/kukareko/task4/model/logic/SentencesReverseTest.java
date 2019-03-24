package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class SentencesReverseTest {

    @Test
    public void testReverseText() {
        String expected = "My second task.My.About all.";

        Letter[] letters = new Letter[]{
                new Letter('A'), new Letter('b'), new Letter('o'), new Letter('u'),
                new Letter('t'), new Letter(' ')};
        Letter[] lettersB = new Letter[]{new Letter('a'), new Letter('l'), new Letter('l'),
                new Letter('.')};
        Letter[] lettersC = new Letter[]{new Letter('M'), new Letter('y'), new Letter('.')};
        Letter[] lettersD = new Letter[]{new Letter('M'), new Letter('y'), new Letter(' ')};
        Letter[] lettersF = new Letter[]{new Letter('s'), new Letter('e'), new Letter('c'),
                new Letter('o'), new Letter('n'), new Letter('d'), new Letter(' ')};
        Letter[] lettersG = new Letter[]{new Letter('t'), new Letter('a'), new Letter('s'),
                new Letter('k'), new Letter('.')};

        Word[] wordsA = new Word[]{new Word(Arrays.asList(letters)), new Word(Arrays.asList(lettersB))};
        Word[] wordsB = new Word[]{new Word(Arrays.asList(lettersC))};
        Word[] wordsC = new Word[]{new Word(Arrays.asList(lettersD)), new Word(Arrays.asList(lettersF)), new Word(Arrays.asList(lettersG))};

        Sentence[] sentences = new Sentence[]{new Sentence(Arrays.asList(wordsA)), new Sentence(Arrays.asList(wordsB)),
                new Sentence(Arrays.asList(wordsC))};

        Paragraph[] paragraph = new Paragraph[]{new Paragraph(Arrays.asList(sentences))};

        Text text = new Text(Arrays.asList(paragraph));

        Assert.assertEquals(expected, SentencesReverse.reverseText(text.getElements()));
    }
}
