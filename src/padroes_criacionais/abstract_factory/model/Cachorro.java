package padroes_criacionais.abstract_factory.model;

public class Cachorro implements Animal{
    @Override
    public void fazerBarulho() {
        System.out.printf("Au Au!");
    }
}
