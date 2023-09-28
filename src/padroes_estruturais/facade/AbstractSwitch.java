package padroes_estruturais.facade;

public abstract class AbstractSwitch {

    private Estado estado;

    private Ventoinha ventoinha;

    public AbstractSwitch(Ventoinha ventoinha) {
        this.ventoinha = ventoinha;
    }

    public void ligar(){
        this.estado = Estado.ON;
        System.out.println();
    }

    public void desligar() {
        this.estado = Estado.OFF;
    }

    public void ligarVentoinha(){
        ventoinha.ligarVentoinhas();
    }


    public void desligarVentoinha(){
        ventoinha.desligarVentoinhas();
    }

    public Estado getEstado() {
        return estado;
    }

    public Ventoinha getVentoinha() {
        return ventoinha;
    }
}
