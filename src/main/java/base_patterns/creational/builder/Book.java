package main.java.base_patterns.creational.builder;

public class Book {
    private String name;
    private int price;
    private PublishingHouse publishingHouse;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", publishingHouse=" + publishingHouse +
                '}';
    }
}
