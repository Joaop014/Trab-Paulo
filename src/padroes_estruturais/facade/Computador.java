package padroes_estruturais.facade;

public class Computador {

    private PlacaDeVideo placaDeVideo;
    private Processador processador;
    private RAM ram;
    private Ventoinha ventoinha;

    public Computador(PlacaDeVideo placaDeVideo, Processador processador, RAM ram, Ventoinha ventoinha) {
        this.placaDeVideo = placaDeVideo;
        this.processador = processador;
        this.ram = ram;
        this.ventoinha = ventoinha;
    }


    public void ligar() {
        if (placaDeVideo.getEstado() == Estado.ON &&
                processador.getEstado() == Estado.ON &&
                ram.getEstado() == Estado.ON &&
                ventoinha.getEstado() == Estado.ON) {
            System.out.println("Computador ligado!!!");
        }else {
            System.out.println("Faltou ligar alguma coisa!");
        }
    }

    public void desligar(){
        if (placaDeVideo.getEstado() == Estado.OFF &&
                processador.getEstado() == Estado.OFF &&
                ram.getEstado() == Estado.OFF &&
                ventoinha.getEstado() == Estado.OFF) {
            System.out.println("Computador desligado!!!");
        }else {
            System.out.println("Faltou ligar alguma coisa!");
        }
    }

    public PlacaDeVideo getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public RAM getRam() {
        return ram;
    }

    public Ventoinha getVentoinha() {
        return ventoinha;
    }
}
