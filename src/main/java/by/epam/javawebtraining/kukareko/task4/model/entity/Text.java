package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Text implements TextElement {

    private List<TextElement> paragraphs;

    public Text() {
        paragraphs = new ArrayList<>();
    }

    public Text(List<TextElement> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public List<TextElement> getElements() {
        return paragraphs;
    }

    public String getTextElement() {
        String paragraphsStr = "";

        for (TextElement element : paragraphs) {
            paragraphsStr += element.getTextElement();
        }

        return paragraphsStr;
    }

    public void add(TextElement element) throws AddNullElementException {
        if (element != null) {
            paragraphs.add(element);
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(paragraphs, text.paragraphs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphs);
    }

    @Override
    public String toString() {
        return "Text{" +
                "paragraphs=" + paragraphs +
                '}';
    }
}
