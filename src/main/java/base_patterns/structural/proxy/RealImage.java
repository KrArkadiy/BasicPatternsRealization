package main.java.base_patterns.structural.proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("displaying " + fileName);

    }

    public void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
