package by.epam.javawebtraining.kukareko.task4.util;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class RegexpConstants {

    public static final String CHARACTER_SPLIT = "(?!^)";
    public static final String WORD_SPLIT = "(?<=\\s)";
    public static final String SENTENCES_SPLIT = "(?<=[.!?]\\s)";
    public static final String PARAGRAPH_SPLIT = "(?<=\n)";
    public static final String CODE_CHECK = "(?!-)(\\s*|\\n )((.*(;|\\)|}|\\{|\\()\\s*(\\n*|\\/.*\\n*))+)|(\\/.*\\n*)|([}{]\\n*)";
}
