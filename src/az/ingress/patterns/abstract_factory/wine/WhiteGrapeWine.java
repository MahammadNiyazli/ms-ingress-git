package az.ingress.patterns.abstract_factory.wine;

public class WhiteGrapeWine implements Wine{
    @Override
    public void prepare() {
        System.err.println("White grape Wine prepared");
    }
}
