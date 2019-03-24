package by.epam.javawebtraining.kukareko.task4.model.exception.logical;

/**
 * @author Yulya Kukareko
 * @version 1.0 24 Mar 2019
 */
public class AddNullElementException extends TextLogicException {

    public AddNullElementException() {
        super("You try add null element");
    }
}
