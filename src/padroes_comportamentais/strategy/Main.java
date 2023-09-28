package padroes_comportamentais.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adição");
        Context adicao = new Context(new Adicionar());
        System.out.println(adicao.executarCalculo(4, 2));
        System.out.println("Subtração");
        Context subtracao = new Context(new Subtrair());
        System.out.println(subtracao.executarCalculo(4, 2));
        System.out.println("Multiplicação");
        Context multiplicacao = new Context(new Multiplicar());
        System.out.println(multiplicacao.executarCalculo(4, 2));
    }
}

