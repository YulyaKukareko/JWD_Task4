package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class CharParagraphParserTest {

    private String textBook;
    private static Parser parser;

    @BeforeClass
    public static void init() {
        parser = CharacterParser.INSTANCE;
    }

    @Before
    public void initEach() {
        textBook = "AngularJS makes working with JSON simple. When you request JSON data via Ajax, the response will "
                + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
                + " in the previous example when I used the $http.get method to get a JSON file from the web server.\n"
                + "AngularJS supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
                + " and angular.toJson. You can see both demonstrated in Listing 5-44.\n"
                + "$http.get(\"todo.json\").success(function (data) {\n"
                + " var jsonString = angular.toJson(data);\n"
                + " console.log(jsonString);\n"
                + " $scope.todos = angular.fromJson(jsonString);\n"
                + " });\n";
    }

    @Test
    public void testParse() {
        String[] expected = textBook.split("(?<=\\n)");

        assertEquals(expected, parser.parse(textBook));
    }

    @Test
    public void testParseWithoutSplitSymbols() {
        textBook.replaceAll("\\n", "");
        String[] expected = textBook.split("(?<=\\n)");

        assertEquals(expected, parser.parse(textBook));
    }
}
