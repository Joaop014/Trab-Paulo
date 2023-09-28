package padroes_criacionais.factory_method;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.printf("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.printf("Click!");
    }
}
