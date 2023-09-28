package padroes_comportamentais.iterator;

import java.util.ArrayList;
import java.util.List;

public class CelularCollectionImpl implements CelularCollection{
    private List<Celular> celularList;

    public CelularCollectionImpl(){
        celularList = new ArrayList<>();
    }


    @Override
    public void adcionarCelular(Celular c) {
        celularList.add(c);
    }

    @Override
    public void removerCelular(Celular c) {
        celularList.remove(c);
    }

    @Override
    public CelularIterator iterator(Marca marca) {
        return new CelularIteratorImpl(marca, celularList);
    }
}
