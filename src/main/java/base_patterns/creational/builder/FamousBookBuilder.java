package main.java.base_patterns.creational.builder;

public abstract class FamousBookBuilder {
    Book book;

    void createFamousBook(){
        book = new Book();
    }

    abstract void buildName();

    abstract void buildPublishingHouse();

    abstract void buildPrice();

    Book getBook(){
        return book;
    }

}
