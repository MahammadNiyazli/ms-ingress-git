package az.ingress.patterns.factory;

public class Burger implements Food {
    @Override
    public void prepare() {
        System.err.println("Burger prepared");
    }
}
