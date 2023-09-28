package padroes_estruturais.decorator;

public class vaiculoBasico implements Veiculo{
    @Override
    public void montar() {
        System.out.printf("Veículo básico");
    }
}
