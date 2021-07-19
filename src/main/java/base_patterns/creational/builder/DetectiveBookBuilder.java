package main.java.base_patterns.creational.builder;

public class DetectiveBookBuilder extends FamousBookBuilder{
    @Override
    void buildName() {
        book.setName("Famous detective book");
    }

    @Override
    void buildPublishingHouse() {
        book.setPublishingHouse(PublishingHouse.EKSMO);
    }

    @Override
    void buildPrice() {
        book.setPrice(500);
    }
}
