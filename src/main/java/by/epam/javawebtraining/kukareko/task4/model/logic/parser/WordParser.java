package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import by.epam.javawebtraining.kukareko.task4.util.RegexpConstants;

/**
 * @author Yulya Kukareko
 * @version 1.0 21 Mar 2019
 */
public enum WordParser implements Parser {

    INSTANCE;

    public String[] parse(String sentence) {
        return sentence.split(RegexpConstants.WORD_SPLIT);
    }
}
