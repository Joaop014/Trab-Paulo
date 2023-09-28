package padroes_comportamentais.strategy;

public class Multiplicar implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
