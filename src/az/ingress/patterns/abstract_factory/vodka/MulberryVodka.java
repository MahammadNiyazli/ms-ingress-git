package az.ingress.patterns.abstract_factory.vodka;

public class MulberryVodka implements Vodka{

    @Override
    public void prepareVodka() {
        System.err.println("prepare Mulberry vodka");
    }
}
