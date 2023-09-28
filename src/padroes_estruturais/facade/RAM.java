package padroes_estruturais.facade;

public class RAM {

    private int qntRAM;
    private Estado estado;

    public RAM(int qntRAM) {
        this.qntRAM = qntRAM;
    }

    public void ligarMemRam(){
        this.estado = Estado.ON;
    }

    public void desligarMemRam(){
        this.estado = Estado.OFF;
    }

    public Estado getEstado() {
        return estado;
    }
}
