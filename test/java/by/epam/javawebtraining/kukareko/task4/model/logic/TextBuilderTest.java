package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.EmptyTextForParsingException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class TextBuilderTest {

    @Test
    public void textBuilderTest() throws Exception {
        String textBook = "AngularJS makes working with JSON simple. When you request JSON data via Ajax, the response will "
                + "be parsed automatically into JavaScript objects and passed to the success function, as demonstrated"
                + " in the previous example when I used the $http.get method to get a JSON file from the web server.\n"
                + "AngularJS supplements this with two methods that explicitly encode and decode JSON: angular.fromJson"
                + " and angular.toJson. You can see both demonstrated in Listing 5-44.\n"
                + "$http.get(\"todo.json\").success(function (data) {\n"
                + " var jsonString = angular.toJson(data);\n"
                + " console.log(jsonString);\n"
                + " $scope.todos = angular.fromJson(jsonString);\n"
                + " });\n";

        Assert.assertEquals(textBook, TextBuilder.textBuilder(textBook).getTextElement());
    }

    @Test(expected = EmptyTextForParsingException.class)
    public void textBuilderNullTest() throws Exception {
        String textBook = null;

        Assert.assertEquals(textBook, TextBuilder.textBuilder(textBook).getTextElement());
    }
}
