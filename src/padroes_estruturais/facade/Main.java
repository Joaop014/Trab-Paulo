package padroes_estruturais.facade;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador(new PlacaDeVideo(new Ventoinha(2)),
                new Processador(new Ventoinha(1)),
                new RAM(2),
                new Ventoinha(4));

        //ligando o computador sem facade
        computador.getVentoinha().ligarVentoinhas();
        computador.getRam().ligarMemRam();
        computador.getPlacaDeVideo().ligarVentoinha();
        computador.getPlacaDeVideo().ligar();
        computador.getProcessador().ligarVentoinha();
        computador.getProcessador().ligar();
        computador.ligar();

        //desligando o computador sem facade
        computador.getVentoinha().desligarVentoinhas();
        computador.getRam().desligarMemRam();
        computador.getPlacaDeVideo().desligarVentoinha();
        computador.getPlacaDeVideo().desligar();
        computador.getProcessador().desligarVentoinha();
        computador.getProcessador().desligar();
        computador.desligar();

        //ligando o computador usando Facade
        ComputadorFacade.LigarComputador(computador);
        //desligando o computador usando Facade
        ComputadorFacade.desligarComputador(computador);


    }
}
