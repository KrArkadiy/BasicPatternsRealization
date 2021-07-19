package main.java.base_patterns.creational.prototype;

public class Book implements Copyable{
    private int edition;
    private String bookName;
    private String publishingHouse;

    public Book(int edition, String bookName, String publishingHouse){
        this.edition = edition;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public Object copy() {
        Book bookCopy = new Book(edition, bookName, publishingHouse);
        return bookCopy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "edition=" + edition +
                ", bookName='" + bookName + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
