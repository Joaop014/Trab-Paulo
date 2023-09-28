package padroes_estruturais.facade;

public class ComputadorFacade {
    public static void LigarComputador(Computador computador){
        computador.getProcessador().ligarVentoinha();
        computador.getProcessador().ligar();
        computador.getRam().ligarMemRam();
        computador.getPlacaDeVideo().ligarVentoinha();
        computador.getPlacaDeVideo().ligar();
        computador.getVentoinha().ligarVentoinhas();
        computador.ligar();
    }

    public static void desligarComputador(Computador computador){
        computador.getProcessador().desligarVentoinha();
        computador.getProcessador().desligar();
        computador.getRam().desligarMemRam();
        computador.getPlacaDeVideo().desligarVentoinha();
        computador.getPlacaDeVideo().desligar();
        computador.getVentoinha().desligarVentoinhas();
        computador.desligar();
    }
}
