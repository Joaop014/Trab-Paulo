package padroes_estruturais.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return converter(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return converter(v, 40);
    }

    private Volt converter(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
