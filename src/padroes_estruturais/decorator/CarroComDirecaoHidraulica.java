package padroes_estruturais.decorator;

public class CarroComDirecaoHidraulica extends VeiculoDecorator{
    public CarroComDirecaoHidraulica(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(" Adicionando direção hidraulica");
    }
}
