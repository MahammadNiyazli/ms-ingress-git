package az.ingress.patterns.abstract_factory.vodka;

public class AppleVodka implements Vodka{

    @Override
    public void prepareVodka() {
        System.err.println("prepare Apple vodka");
    }
}
