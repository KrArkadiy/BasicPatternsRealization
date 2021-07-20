package main.java.base_patterns.behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        int[] editions = {1995, 2000, 2010, 2014};

        Book book = new Book("ExmpleBook", editions);

        Iterator iterator = book.getIterator();

        System.out.println("Book: " + book.getName());
        System.out.println("Edition: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }

    }
}
