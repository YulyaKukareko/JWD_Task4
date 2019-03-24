package by.epam.javawebtraining.kukareko.task4.controller;

import by.epam.javawebtraining.kukareko.task4.model.entity.*;
import by.epam.javawebtraining.kukareko.task4.model.logic.*;
import by.epam.javawebtraining.kukareko.task4.util.config.ReadConfigProperties;
import by.epam.javawebtraining.kukareko.task4.util.io.Reader;
import by.epam.javawebtraining.kukareko.task4.view.*;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import static by.epam.javawebtraining.kukareko.task4.model.logic.TextBuilder.textBuilder;

/**
 * @author Yulya Kukareko
 * @version 1.0 22 Mar 2019
 */
public class Controller {

    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        try {
            Text text = textBuilder(Reader.read(ReadConfigProperties.getProp("book")));
            Renderer renderer = new FileRenderer();
            renderer.render(text.getTextElement(), ReadConfigProperties.getProp("writeFile"), false);

            Text reverseText = textBuilder(SentencesReverse.reverseText(text.getElements()));
            renderer.render(reverseText.getTextElement(), ReadConfigProperties.getProp("sentencesReverse"), false);

            Text removeLetterText = textBuilder(RemoveRepeatLetter.removeRepeatLetter(text.getElements()));
            renderer.render(removeLetterText.getTextElement(), ReadConfigProperties.getProp("removeRepeatLetter"), false);

            SortedMap<Integer, List<String>> sortedSentences = CountSentencesComparator.sentencesCounter(text.getElements());

            for (Map.Entry<Integer, List<String>> entry : sortedSentences.entrySet()) {

                for (String value : entry.getValue()) {
                    renderer.render(value, ReadConfigProperties.getProp("countWordSentencesSorter"), true);
                }
            }

        } catch (Exception ex) {
            LOGGER.error(ex);
        }
    }
}
