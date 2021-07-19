package main.java.base_patterns.creational.prototype;

public class EditionControlRunner {
    public static void main(String[] args) {
        Book firstEdition = new Book(1, "firstBookEdition", "AST");

        System.out.println(firstEdition);

        BookFactory bookFactory = new BookFactory(firstEdition);
        Book firstEdition2 = bookFactory.cloneBook();
        System.out.println(firstEdition2);
    }
}
