package az.ingress.patterns.abstract_factory.wine;

public class BlackGrapeWine implements Wine{
    @Override
    public void prepare() {
        System.err.println("Black grape Wine prepared");
    }
}
