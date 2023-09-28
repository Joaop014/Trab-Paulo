package padroes_criacionais.abstract_factory.model;

public class Gato implements Animal{
    @Override
    public void fazerBarulho() {
        System.out.printf("Meow");
    }
}
