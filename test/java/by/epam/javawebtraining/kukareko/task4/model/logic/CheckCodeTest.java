package by.epam.javawebtraining.kukareko.task4.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 23 Mar 2019
 */
public class CheckCodeTest {

    @Test
    public void testCheckDeclarationDesign() {
        String testData = "int value = 2; ";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckForCircle() {
        String testData = "for(int i = 2; i < 20; i++) { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckEndlessForCircle() {
        String testData = "for(;;) { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckWhileCircle() {
        String testData = "while( i < 20 ) { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckFunctionDeclaration() {
        String testData = "public void test(int value1, boolean value2) { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckAddElement() {
        String testData = "list.add(3);";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckTryBlock() {
        String testData = "try (InputStream stream = new InputStream(fileName)) { } catch (Exception ex) { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckComments() {
        String testData = "// These are comments strings";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckReturn() {
        String testData = "return ;";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckConditional() {
        String testData = "if ( 2 < 4) i = 2 ; else { }";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckShortConditional() {
        String testData = "2 == 4 ? return 3 : return 4;";

        assertTrue(CheckCode.check(testData));
    }

    @Test
    public void testCheckListText() {
        String testData = "-angularJS makes working with JSON simple;";

        assertFalse(CheckCode.check(testData));
    }

    @Test
    public void testCheckText() {
        String testData = "AngularJS makes working with JSON simple.";

        assertFalse(CheckCode.check(testData));
    }

    @Test
    public void testCheckEndColon() {
        String testData = "AngularJS makes working with JSON simple:";

        assertFalse(CheckCode.check(testData));
    }
}
