package padroes_estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new CarroComDirecaoHidraulica(new vaiculoBasico());
        carro.montar();
        Veiculo carro2 = new CarroComArCondicionado(new vaiculoBasico());
        carro2.montar();
    }
}
