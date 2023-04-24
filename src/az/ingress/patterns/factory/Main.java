package az.ingress.patterns.factory;

import static az.ingress.patterns.factory.FoodType.*;

public class Main {
    public static void main(String[] args) {
        Food food = FoodFactory.createFood(SANDWICH);
        food.prepare();
    }
}
