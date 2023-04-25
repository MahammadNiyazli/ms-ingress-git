package az.ingress.patterns.abstract_factory.factory;

import az.ingress.patterns.abstract_factory.vodka.AppleVodka;
import az.ingress.patterns.abstract_factory.vodka.Vodka;
import az.ingress.patterns.abstract_factory.wine.WhiteGrapeWine;
import az.ingress.patterns.abstract_factory.wine.Wine;

public class AgsuDrinkFactory extends AbstractDrinkFactory{
    @Override
    public Vodka createVodka() {
        return new AppleVodka();
    }

    @Override
    public Wine createWine() {
        return new WhiteGrapeWine();
    }
}
