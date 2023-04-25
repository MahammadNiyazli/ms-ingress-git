package az.ingress.patterns.abstract_factory.factory;

import az.ingress.patterns.abstract_factory.wine.BlackGrapeWine;
import az.ingress.patterns.abstract_factory.vodka.MulberryVodka;
import az.ingress.patterns.abstract_factory.vodka.Vodka;
import az.ingress.patterns.abstract_factory.wine.Wine;

public class GoygolDrinkFactory extends AbstractDrinkFactory{
    @Override
    public Vodka createVodka() {
        return new MulberryVodka();
    }

    @Override
    public Wine createWine() {
        return new BlackGrapeWine();
    }
}
