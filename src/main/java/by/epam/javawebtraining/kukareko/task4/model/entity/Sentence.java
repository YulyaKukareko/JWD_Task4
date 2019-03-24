package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Sentence implements TextElement {

    List<Word> words;

    public Sentence() {
        words = new ArrayList<>();
    }

    public Sentence(List<Word> words) {
        this.words = words;
    }

    @Override
    public List<TextElement> getElements() {
        List<TextElement> wordsList = new ArrayList<>();
        for (Word word : words) {
            wordsList.add(word);
        }
        return wordsList;
    }

    public String getTextElement() {
        String sentenceStr = "";

        for (Word word : words) {
            sentenceStr += word.getTextElement();
        }

        return sentenceStr;
    }

    public void add(Word element) throws AddNullElementException {
        if (element != null) {
            words.add(element);
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}
