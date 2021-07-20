package main.java.base_patterns.behavioral.visitor;

public class FictionBook implements CollectionOfBooksElement{

    @Override
    public void beWritten(Author author) {
        author.write(this);
    }
}
