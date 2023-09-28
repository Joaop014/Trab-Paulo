package padroes_estruturais.adapter;

public class Main {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        System.out.println("voltagem =" + socketAdapter.get3Volt());
        System.out.println("voltagem =" +socketAdapter.get12Volt());
        System.out.println("voltagem =" +socketAdapter.get120Volt());
    }

}
