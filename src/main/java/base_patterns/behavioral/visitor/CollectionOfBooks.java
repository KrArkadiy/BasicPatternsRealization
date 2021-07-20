package main.java.base_patterns.behavioral.visitor;

public class CollectionOfBooks implements CollectionOfBooksElement{
    CollectionOfBooksElement[] collectionOfBooksElements;

    public CollectionOfBooks(){
        this.collectionOfBooksElements = new CollectionOfBooksElement[]{
                new AutobiographyBook(),
                new DetectiveBook(),
                new FictionBook()
        };
    }

    @Override
    public void beWritten(Author author) {
        for(CollectionOfBooksElement element : collectionOfBooksElements){
            element.beWritten(author);
        }
    }
}
