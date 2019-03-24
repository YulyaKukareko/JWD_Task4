package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class WordParserTest {

    private static String sentence;
    private static Parser parser;

    @BeforeClass
    public static void init() {
        sentence = "When you request JSON data via Ajax, the response will be parsed automatically into JavaScript "
                + "objects and passed to the success function, as demonstrated";
        parser = WordParser.INSTANCE;
    }

    @Test
    public void testWordParser() {
        String[] expected = sentence.split("(?<=\\s)");

        assertEquals(expected, parser.parse(sentence));
    }

    @Test
    public void testWordParserWithoutSplitSymbol() {
        String testData = sentence.split(" ")[0];
        String[] expected = {"When"};

        assertEquals(expected, parser.parse(testData));
    }
}
