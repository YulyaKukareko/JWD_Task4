package by.epam.javawebtraining.kukareko.task4.model.exception;

/**
 * @author Yulya Kukareko
 * @version 1.0 24 Mar 2019
 */
public class TextException extends Exception {

    public TextException() {
    }

    public TextException(String message) {
        super(message);
    }

    public TextException(Throwable cause) {
        super(cause);
    }
}
