package padroes_criacionais.singleton;

public class Singleton {

    private static Singleton unicaInstancia = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return unicaInstancia;
    }

}
