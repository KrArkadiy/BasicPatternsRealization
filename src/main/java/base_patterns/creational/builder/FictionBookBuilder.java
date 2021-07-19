package main.java.base_patterns.creational.builder;

public class FictionBookBuilder extends FamousBookBuilder{
    @Override
    void buildName() {
        book.setName("Famous fiction book");
    }

    @Override
    void buildPublishingHouse() {
        book.setPublishingHouse(PublishingHouse.AST);
    }

    @Override
    void buildPrice() {
        book.setPrice(300);
    }
}
