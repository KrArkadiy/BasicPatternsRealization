package main.java.base_patterns.behavioral.visitor;

public class DetectiveBook implements CollectionOfBooksElement{
    @Override
    public void beWritten(Author author) {
        author.write(this);
    }
}
