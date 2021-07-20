package main.java.base_patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> twits);
}
