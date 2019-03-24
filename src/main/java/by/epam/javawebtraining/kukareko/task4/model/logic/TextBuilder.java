package by.epam.javawebtraining.kukareko.task4.model.logic;

import by.epam.javawebtraining.kukareko.task4.model.entity.*;
import by.epam.javawebtraining.kukareko.task4.model.exception.logical.*;
import by.epam.javawebtraining.kukareko.task4.model.logic.parser.*;

/**
 * @author Yulya Kukareko
 * @version 1.0 21 Mar 2019
 */
public class TextBuilder {

    public static Text textBuilder(String data) throws EmptyTextForParsingException, AddNullElementException {
        if (data != null) {
            Text text = new Text();
            for (String paragraph : ParagraphParser.INSTANCE.parse(data)) {
                Paragraph newParagraph = new Paragraph();

                if (CheckCode.check(paragraph)) {
                    text.add(new Code(paragraph));
                } else {
                    for (String sentence : SentencesParser.INSTANCE.parse(paragraph)) {
                        Sentence newSentence = new Sentence();

                        for (String word : WordParser.INSTANCE.parse(sentence)) {
                            Word newWord = new Word();

                            for (String letter : CharacterParser.INSTANCE.parse(word)) {
                                Letter newLetter = new Letter(letter.toCharArray()[0]);

                                newWord.add(newLetter);
                            }
                            newSentence.add(newWord);
                        }
                        newParagraph.add(newSentence);
                    }
                    text.add(newParagraph);
                }
            }
            return text;
        } else {
            throw new EmptyTextForParsingException();
        }
    }
}
