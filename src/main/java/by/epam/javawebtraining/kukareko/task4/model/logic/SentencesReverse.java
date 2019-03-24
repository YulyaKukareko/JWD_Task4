package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.TextElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yulya Kukareko
 * @version 1.0 21 Mar 2019
 */
public class SentencesReverse {

    public static String reverseText(List<TextElement> elements) {
        List<String> reverseElements = new ArrayList<>();
        String result = "";
        int indexRemoveCharacter;

        for (TextElement paragraph : elements) {
            for (TextElement sentence : paragraph.getElements()) {
                StringBuilder textElement = new StringBuilder(sentence.getTextElement());
                if ((indexRemoveCharacter = textElement.lastIndexOf("\n")) != -1) {
                    textElement.deleteCharAt(indexRemoveCharacter);
                    textElement.insert(0, "\n");
                }
                reverseElements.add(textElement.toString());
            }
        }
        Collections.reverse(reverseElements);

        for (String element : reverseElements) {
            result += element;
        }
        return result;
    }
}