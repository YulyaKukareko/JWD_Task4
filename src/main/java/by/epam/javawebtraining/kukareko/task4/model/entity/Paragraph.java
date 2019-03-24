package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Paragraph implements TextElement {

    private List<Sentence> sentences;

    public Paragraph() {
        sentences = new ArrayList<>();
    }

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public List<TextElement> getElements() {
        List<TextElement> sentenceList = new ArrayList<>();
        for (Sentence sentence : sentences) {
            sentenceList.add(sentence);
        }
        return sentenceList;
    }

    public String getTextElement() {
        String sentencesStr = "";

        for (Sentence sentence : sentences) {
            sentencesStr += sentence.getTextElement();
        }
        return sentencesStr;
    }

    public void add(Sentence element) throws AddNullElementException {
        if (element != null) {
            sentences.add(element);
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "paragraphs=" + sentences +
                '}';
    }
}
