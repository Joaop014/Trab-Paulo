package padroes_comportamentais.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
