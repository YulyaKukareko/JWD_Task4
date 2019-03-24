package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.Code;
import by.epam.javawebtraining.kukareko.task4.model.entity.TextElement;

import java.util.List;

/**
 * @author Yulya Kukareko
 * @version 1.0 22 Mar 2019
 */
public class RemoveRepeatLetter {

    public static String removeRepeatLetter(List<TextElement> list) {
        StringBuilder text = new StringBuilder();

        for (TextElement listElement : list) {
            if (!(listElement instanceof Code)) {
                for (TextElement sentence : listElement.getElements()) {
                    for (TextElement word : sentence.getElements()) {
                        StringBuilder sb = new StringBuilder(word.getTextElement());
                        removeLetter(sb, sb.charAt(0));
                        text.append(sb);
                    }
                }
            } else {
                text.append(listElement.getTextElement());
            }
        }
        return text.toString();
    }

    private static void removeLetter(StringBuilder sb, Character letter) {
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == letter) {
                sb.deleteCharAt(i);
            }
        }
    }

}
