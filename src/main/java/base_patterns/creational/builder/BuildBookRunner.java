package main.java.base_patterns.creational.builder;

public class BuildBookRunner {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        publisher.setBuilder(new DetectiveBookBuilder());
        Book book = publisher.buildBook();

        System.out.println(book);

        publisher.setBuilder(new FictionBookBuilder());
        Book book1 = publisher.buildBook();

        System.out.println(book1);
    }
}
