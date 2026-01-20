package de.seuhd.observer;

import java.util.List;

public abstract class Subject {
    public List<Observer> observerList;
    public int value;

    void attach(Observer observer) {
        observerList.add(observer);
    }

    void detach(Observer observer) {
        observerList.remove(observer);
    }

    protected void notifyObservers() {
        System.out.println("sending update to observers ...");
        for (Observer obs: observerList) {
            obs.update(this);
        }
    }
}
