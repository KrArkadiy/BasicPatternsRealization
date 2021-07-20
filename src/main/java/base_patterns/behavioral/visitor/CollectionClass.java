package main.java.base_patterns.behavioral.visitor;

public class CollectionClass implements CollectionOfBooksElement{
    @Override
    public void beWritten(Author author) {
        author.write(this);
    }
}
