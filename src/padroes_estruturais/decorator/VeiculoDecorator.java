package padroes_estruturais.decorator;

public class VeiculoDecorator implements Veiculo{

    private Veiculo veiculo;

    public VeiculoDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void montar() {
        this.veiculo.montar();
    }
}
