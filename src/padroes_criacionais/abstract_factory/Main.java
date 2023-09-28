package padroes_criacionais.abstract_factory;

import padroes_criacionais.abstract_factory.model.Cachorro;
import padroes_criacionais.abstract_factory.model.Gato;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.fazerBarulho();
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
    }

}
