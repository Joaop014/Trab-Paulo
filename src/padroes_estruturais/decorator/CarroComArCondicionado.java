package padroes_estruturais.decorator;

public class CarroComArCondicionado extends VeiculoDecorator{

    private Veiculo veiculo;

    public CarroComArCondicionado(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(" Adicionando Ar condicionado!");
    }
}
