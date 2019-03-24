package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class RemoveRepeatLetterTest {

    @Test
    public void removeRepeatLetter() {
        String expected = "This exampl have cirulation letters";

        Letter[] letters = new Letter[]{
                new Letter('T'), new Letter('h'), new Letter('i'), new Letter('s'),
                new Letter(' ')};
        Letter[] lettersB = new Letter[]{new Letter('e'), new Letter('x'), new Letter('a'),
                new Letter('m'), new Letter('p'), new Letter('l'), new Letter('e'),
                new Letter(' ')};
        Letter[] lettersC = new Letter[]{new Letter('h'), new Letter('a'), new Letter('v'),
                new Letter('e'), new Letter(' ')};
        Letter[] lettersD = new Letter[]{new Letter('c'), new Letter('i'), new Letter('r'),
                new Letter('c'), new Letter('u'), new Letter('l'), new Letter('a'),
                new Letter('t'), new Letter('i'), new Letter('o'), new Letter('n'),
                new Letter(' ')};
        Letter[] lettersF = new Letter[]{new Letter('l'), new Letter('e'), new Letter('t'),
                new Letter('t'), new Letter('e'), new Letter('r'), new Letter('s')};

        Word[] wordsA = new Word[]{new Word(Arrays.asList(letters)), new Word(Arrays.asList(lettersB)), new Word(Arrays.asList(lettersC)),
                new Word(Arrays.asList(lettersD)), new Word(Arrays.asList(lettersF))};

        Sentence[] sentences = new Sentence[]{new Sentence(Arrays.asList(wordsA))};

        Paragraph[] paragraph = new Paragraph[]{new Paragraph(Arrays.asList(sentences))};

        Text text = new Text(Arrays.asList(paragraph));

        Assert.assertEquals(expected, RemoveRepeatLetter.removeRepeatLetter(text.getElements()));
    }
}
