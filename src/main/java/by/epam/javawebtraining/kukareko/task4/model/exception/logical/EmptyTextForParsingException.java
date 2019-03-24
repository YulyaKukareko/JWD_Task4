package by.epam.javawebtraining.kukareko.task4.model.exception.logical;

/**
 * @author Yulya Kukareko
 * @version 1.0 24 Mar 2019
 */
public class EmptyTextForParsingException extends TextLogicException {

    public EmptyTextForParsingException() {
        super("You handed over empty text");
    }
}

