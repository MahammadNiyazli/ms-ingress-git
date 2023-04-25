package az.ingress.patterns.factory;

public class FoodFactory {
    public static Food createFood(FoodType foodType){
        return switch (foodType){
            case BURGER -> new Burger();
            case SANDWICH -> new Sandwich();
        };
    }
}
