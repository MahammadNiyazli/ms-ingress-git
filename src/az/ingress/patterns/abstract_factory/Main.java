package az.ingress.patterns.abstract_factory;

import az.ingress.patterns.abstract_factory.factory.AbstractDrinkFactory;
import az.ingress.patterns.abstract_factory.vodka.Vodka;

public class Main {
    public static void main(String[] args) {
        AbstractDrinkFactory drinkFactory = AbstractDrinkFactory.drinkFactory(DrinkFactoryEnum.AGSU);
        Vodka vodka = drinkFactory.createVodka();
        vodka.prepareVodka();
    }
}
