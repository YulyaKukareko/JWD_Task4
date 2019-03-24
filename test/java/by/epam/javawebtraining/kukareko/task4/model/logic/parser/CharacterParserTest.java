package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class CharacterParserTest {

    private static Parser parser;

    @BeforeClass
    public static void init() {
        parser = CharacterParser.INSTANCE;
    }

    @Test
    public void parseTest() {
        String testData = "Word";
        String[] expected = testData.split("(?!^)");

        assertEquals(expected, parser.parse(testData));
    }

    @Test
    public void parseTestWithoutSplitSymbol() {
        String testData = "W";
        String[] expected = {"W"};

        assertEquals(expected, parser.parse(testData));
    }
}
