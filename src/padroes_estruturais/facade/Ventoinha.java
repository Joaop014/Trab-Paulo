package padroes_estruturais.facade;

public class Ventoinha {
    private Estado estado;
    private int qntVentoinhas;

    public Ventoinha(int qntVentoinhas) {
        this.qntVentoinhas = qntVentoinhas;
    }

    public int getQntVentoinhas() {
        return qntVentoinhas;
    }

    public void ligarVentoinhas(){
        this.estado = Estado.ON;
    }

    public void desligarVentoinhas() {
        this.estado = Estado.OFF;
    }

    public Estado getEstado() {
        return estado;
    }
}
