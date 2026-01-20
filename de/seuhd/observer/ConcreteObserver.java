package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    private int observedValue;
    private int id;
    private Subject observedSubjectReference;

    public ConcreteObserver(Subject subject) {
        observedSubjectReference = subject;
        observedValue = subject.value;

        subject.attach(this);
        id = subject.observerList.size();
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Observer " + id + " received update from subject: New value is " + subject.value);
        observedValue = subject.value;
    }

    public void detach() {
        observedSubjectReference.detach(this);
    }
}
