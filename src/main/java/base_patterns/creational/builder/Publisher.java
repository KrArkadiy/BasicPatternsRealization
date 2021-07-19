package main.java.base_patterns.creational.builder;

public class Publisher {
    FamousBookBuilder builder;

    public void setBuilder(FamousBookBuilder builder){
        this.builder = builder;
    }

    Book buildBook(){
        builder.createFamousBook();
        builder.buildName();
        builder.buildPrice();
        builder.buildPublishingHouse();

        Book book = builder.getBook();

        return book;
    }
}
