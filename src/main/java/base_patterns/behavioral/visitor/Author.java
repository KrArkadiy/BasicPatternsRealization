package main.java.base_patterns.behavioral.visitor;

public interface Author {

    void write(DetectiveBook detectiveBook);

    void write(FictionBook fictionBook);

    void write(AutobiographyBook autobiographyBook);

    void write(CollectionClass collectionClass);
}
