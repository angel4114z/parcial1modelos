package Punto1.subject;

import Punto1.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class EducacionContinua implements Subject{

    private List<Observer> observers = new ArrayList<>();
    
    public void addCourse(String course){
        notifyObserver(course, 1);
    }

    public void removeCourse(String course){
        notifyObserver(course, 2);
    }

    public void editCourse(String course){
        notifyObserver(course, 3);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);    
    }

    @Override
    public void notifyObserver(String course, int type) {
        for(Observer observer : observers){
            observer.update(course, type);
        }
    }
    
}
