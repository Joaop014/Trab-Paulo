package padroes_comportamentais.iterator;

import java.util.List;

public class CelularIteratorImpl implements CelularIterator {

    private Marca marca;
    private List<Celular> celularList;
    private int posicao;

    public CelularIteratorImpl(Marca marca, List<Celular> celularList) {
        this.marca = marca;
        this.celularList = celularList;
    }

    @Override
    public boolean hasNext() {
        while (posicao < celularList.size()) {
            Celular c = celularList.get(posicao);
            if (c.getMarca().equals(marca) || marca.equals(Marca.ALL)) {
                return true;
            } else {
                posicao++;
            }
        }
        return false;
    }

    @Override
    public Celular next() {
        Celular c = celularList.get(posicao);
        posicao++;
        return c;
    }
}
