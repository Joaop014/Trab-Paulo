package padroes_comportamentais.iterator;

public class Main {

    public static void main(String[] args) {
        CelularCollection celularCollection = gerarCelulares();
        CelularIterator celularIterator = celularCollection.iterator(Marca.ALL);
        while (celularIterator.hasNext()){
            Celular c = celularIterator.next();
            System.out.println(c.toString());
        }
        //Motorola Iterator
        System.out.println("Motorola Iterator");
        CelularIterator motoloraIterator = celularCollection.iterator(Marca.MOTOLORA);
        while (motoloraIterator.hasNext()){
            Celular next = motoloraIterator.next();

            System.out.println(next);
        }

    }

    private static CelularCollection gerarCelulares(){
        CelularCollection celularCollection = new CelularCollectionImpl();
        celularCollection.adcionarCelular(new Celular(2800.00, Marca.XIAOMI));
        celularCollection.adcionarCelular(new Celular(2600.00, Marca.MOTOLORA));
        celularCollection.adcionarCelular(new Celular(2400.00, Marca.SAMSUNG));
        celularCollection.adcionarCelular(new Celular(4000.00, Marca.APPLE));
        celularCollection.adcionarCelular(new Celular(4000.00, Marca.APPLE));
        celularCollection.adcionarCelular(new Celular(2400.00, Marca.SAMSUNG));
        celularCollection.adcionarCelular(new Celular(2100.00, Marca.XIAOMI));
        celularCollection.adcionarCelular(new Celular(1200.00, Marca.MOTOLORA));
        celularCollection.adcionarCelular(new Celular(2100.00, Marca.MOTOLORA));
        celularCollection.adcionarCelular(new Celular(2700.00, Marca.SAMSUNG));
        return celularCollection;
    }


}
