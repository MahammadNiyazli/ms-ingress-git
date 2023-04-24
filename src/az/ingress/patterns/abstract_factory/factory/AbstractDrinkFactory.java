package az.ingress.patterns.abstract_factory.factory;

import az.ingress.patterns.abstract_factory.DrinkFactoryEnum;
import az.ingress.patterns.abstract_factory.vodka.Vodka;
import az.ingress.patterns.abstract_factory.wine.Wine;

public abstract class AbstractDrinkFactory {
    public abstract Vodka createVodka();
    public abstract Wine createWine();

    public static AbstractDrinkFactory drinkFactory(DrinkFactoryEnum drinkFactoryEnum){
        return switch (drinkFactoryEnum){
            case AGSU -> new AgsuDrinkFactory();
            case GOYGOL -> new GoygolDrinkFactory();
        };
    }
}
