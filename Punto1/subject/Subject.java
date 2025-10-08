package Punto1.subject;

import Punto1.observer.Observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(String course, int type);

}
