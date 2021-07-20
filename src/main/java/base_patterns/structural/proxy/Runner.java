package main.java.base_patterns.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        Image image = new ProxyImage("File.jpg");

        image.display();
        System.out.println();

        image.display();
    }
}
