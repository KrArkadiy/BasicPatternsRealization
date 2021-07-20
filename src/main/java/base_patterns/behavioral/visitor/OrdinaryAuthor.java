package main.java.base_patterns.behavioral.visitor;

public class OrdinaryAuthor implements Author{
    @Override
    public void write(DetectiveBook detectiveBook) {
        System.out.println("Writing not good detective book");
    }

    @Override
    public void write(FictionBook fictionBook) {
        System.out.println("Writing not good fiction book");
    }

    @Override
    public void write(AutobiographyBook autobiographyBook) {
        System.out.println("Writing good autobiography book");
    }

    @Override
    public void write(CollectionClass collectionClass) {
        System.out.println("Writing not good collection of books");
    }
}
