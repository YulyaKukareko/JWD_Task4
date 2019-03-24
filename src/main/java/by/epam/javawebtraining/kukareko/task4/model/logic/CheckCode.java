package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.util.RegexpConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yulya Kukareko
 * @version 1.0 21 Mar 2019
 */
public class CheckCode {

    public static boolean check(String paragraph) {
        Pattern pattern = Pattern.compile(RegexpConstants.CODE_CHECK);
        Matcher matcher = pattern.matcher(paragraph);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
