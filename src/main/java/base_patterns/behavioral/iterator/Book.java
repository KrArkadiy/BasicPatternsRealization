package main.java.base_patterns.behavioral.iterator;

import main.java.base_patterns.behavioral.interpreter.OrContext;

public class Book implements Collection {
    private String name;
    private int[] editions;

    public Book(String name, int[] editions) {
        this.name = name;
        this.editions = editions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEditions() {
        return editions;
    }

    public void setEditions(int[] editions) {
        this.editions = editions;
    }

    @Override
    public Iterator getIterator() {
        return new EditionIterator();
    }

    private class EditionIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < editions.length) {
                return true;
            } else return false;
        }

        @Override
        public Object next() {
            return editions[index++];
        }
    }
}
