package main.java.base_patterns.behavioral.visitor;

public class TalantedAuthor implements Author{
    @Override
    public void write(DetectiveBook detectiveBook) {
        System.out.println("writing good detective book");
    }

    @Override
    public void write(FictionBook fictionBook) {
        System.out.println("writing good fiction book");
    }

    @Override
    public void write(AutobiographyBook autobiographyBook) {
        System.out.println("writing good autobiography book");
    }

    @Override
    public void write(CollectionClass collectionClass) {
        System.out.println("writing collection of books");
    }
}
