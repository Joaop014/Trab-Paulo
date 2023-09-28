package padroes_comportamentais.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Subject {

    private List<padroes_comportamentais.observer.Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notificarTodosObservers();
    }

    public void adicionar(padroes_comportamentais.observer.Observer observer){
        observers.add(observer);
    }

    public void notificarTodosObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
