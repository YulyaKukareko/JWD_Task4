package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class SentencesParserTest {

    private String text = "AngularJS makes working with JSON simple. When you request JSON data via Ajax, the response will "
            + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
            + " in the previous example when I used the $http.get method to get a JSON file from the web server? AngularJS "
            + "supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
            + " and angular.toJson! You can see both demonstrated in Listing 5-44.";
    private static Parser parser;

    @BeforeClass
    public static void init() {
        parser = SentencesParser.INSTANCE;
    }

    @Test
    public void testParsePoint() {
        String text = "AngularJS makes working with JSON simple. When you request JSON data via Ajax, the response will "
                + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
                + " in the previous example when I used the $http.get method to get a JSON file from the web server. AngularJS "
                + "supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
                + " and angular.toJson. You can see both demonstrated in Listing 5-44.\n";
        String[] expected = text.split("(?<=[.]\\s)");

        assertEquals(expected, parser.parse(text));
    }

    @Test
    public void testParseQuestionMark() {
        String text = "AngularJS makes working with JSON simple? When you request JSON data via Ajax, the response will "
                + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
                + " in the previous example when I used the $http.get method to get a JSON file from the web server? AngularJS "
                + "supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
                + " and angular.toJson? You can see both demonstrated in Listing 5-44.\n";
        String[] expected = text.split("(?<=[?]\\s)");

        assertEquals(expected, parser.parse(text));
    }

    @Test
    public void testParseExclamationMark() {
        String text = "AngularJS makes working with JSON simple! When you request JSON data via Ajax, the response will "
                + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
                + " in the previous example when I used the $http.get method to get a JSON file from the web server! AngularJS "
                + "supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
                + " and angular.toJson! You can see both demonstrated in Listing 5-44.\n";
        String[] expected = text.split("(?<=[!]\\s)");

        assertEquals(expected, parser.parse(text));
    }
}
