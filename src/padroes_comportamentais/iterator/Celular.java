package padroes_comportamentais.iterator;

public class Celular {

    private double price;
    private Marca marca;

    public Celular(double price, Marca marca) {
        this.price = price;
        this.marca = marca;
    }

    public double getPrice() {
        return price;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "price=" + price +
                ", marca=" + marca +
                '}';
    }
}
