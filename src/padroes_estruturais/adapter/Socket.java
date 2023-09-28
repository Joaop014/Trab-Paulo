package padroes_estruturais.adapter;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
