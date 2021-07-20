package main.java.base_patterns.behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        CollectionOfBooks collectionOfBooks = new CollectionOfBooks();
        Author talented = new TalantedAuthor();
        Author ordinary = new OrdinaryAuthor();

        System.out.println("Ordinary author in action");

        collectionOfBooks.beWritten(ordinary);

        System.out.println();

        System.out.println("Talented author int action");

        collectionOfBooks.beWritten(talented);
    }
}
