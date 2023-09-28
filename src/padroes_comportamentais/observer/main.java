package padroes_comportamentais.observer;

public class main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
}
