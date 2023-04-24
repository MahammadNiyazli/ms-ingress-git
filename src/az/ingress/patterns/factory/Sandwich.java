package az.ingress.patterns.factory;

public class Sandwich implements Food {
    @Override
    public void prepare() {
        System.err.println("Sandwich prepared");
    }
}
