package de.seuhd.observer;

import java.util.ArrayList;

public class ConcreteSubject extends Subject {

    public ConcreteSubject() {
        observerList = new ArrayList<>();
    }
    public void setValue(int value) {
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        notifyObservers();
    }
}