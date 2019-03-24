package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.Code;
import by.epam.javawebtraining.kukareko.task4.model.entity.TextElement;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Yulya Kukareko
 * @version 1.0 22 Mar 2019
 */
public class CountSentencesComparator {

    public static SortedMap<Integer, List<String>> sentencesCounter(List<TextElement> list) {
        SortedMap<Integer, List<String>> map = new TreeMap<>();

        for (TextElement element : list) {
            for (TextElement nestedElement : element.getElements()) {
                if (!(nestedElement instanceof Code)) {
                    int size = nestedElement.getElements().size();
                    String addStr = nestedElement.getTextElement() + (nestedElement.getTextElement().contains("\n") ? "" : "\n");

                    if (map.containsKey(size)) {
                        map.get(size).add(addStr);
                    } else {
                        List<String> listElements = new ArrayList<>();

                        listElements.add(addStr);
                        map.put(size, listElements);
                    }
                }
            }
        }

        return map;
    }
}
