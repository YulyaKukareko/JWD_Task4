package by.epam.javawebtraining.kukareko.task4.model.entity;

import by.epam.javawebtraining.kukareko.task4.model.exception.logical.AddNullElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 17 Mar 2019
 */
public class Code implements TextElement {

    String code;

    public Code() {
    }

    public Code(String code) {
        this.code = code;
    }

    @Override
    public List<TextElement> getElements() {
        List<TextElement> listCode = new ArrayList<>();
        listCode.add(new Code(code));
        return listCode;
    }

    public String getTextElement() {
        return code;
    }

    public void add(String element) throws AddNullElementException {
        if (element != null) {
            this.code = element;
        } else {
            throw new AddNullElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code1 = (Code) o;
        return Objects.equals(code, code1.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Code{" +
                "code='" + code + '\'' +
                '}';
    }
}
