package padroes_comportamentais.iterator;

public interface CelularCollection {
    void adcionarCelular(Celular c);
    void removerCelular(Celular c);
     CelularIterator iterator(Marca marca);
}
