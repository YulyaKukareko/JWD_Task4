package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Letter implements TextElement {

    Character characters;

    public Letter() {
    }

    public Letter(Character characters) {
        this.characters = characters;
    }

    public String getTextElement() {
        return Character.toString(characters);
    }

    public void add(Character element) throws AddNullElementException {
        if (element != null) {
            characters = element;
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public List<TextElement> getElements() {
        List<TextElement> letter = new ArrayList<>();
        letter.add(new Letter(characters));
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(characters, letter.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characters);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "characters=" + characters +
                '}';
    }
}