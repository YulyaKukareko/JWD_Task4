package by.epam.javawebtraining.kukareko.task4.model.logic.parser;

import by.epam.javawebtraining.kukareko.task4.model.util.RegexpConstants;

/**
 * @author Yulya Kukareko
 * @version 1.0 21 Mar 2019
 */
public enum SentencesParser implements Parser {

    INSTANCE;

    public String[] parse(String data) {
        return data.split(RegexpConstants.SENTENCES_SPLIT);
    }
}

