package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Word implements TextElement {

    List<Letter> letters;

    public Word() {
        letters = new ArrayList<>();
    }

    public Word(List<Letter> letters) {
        this.letters = letters;
    }

    @Override
    public List<TextElement> getElements() {
        List<TextElement> lettersList = new ArrayList<>();
        for (Letter letter : letters) {
            lettersList.add(letter);
        }
        return lettersList;
    }

    public String getTextElement() {
        String wordStr = "";

        for (Letter letter : letters) {
            wordStr += letter.getTextElement();
        }
        return wordStr;
    }

    public void add(Letter element) throws AddNullElementException {
        if (element != null) {
            letters.add(element);
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(letters, word.letters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letters);
    }

    @Override
    public String toString() {
        return "Word{" +
                "letters=" + letters +
                '}';
    }
}
