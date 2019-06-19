package ke.co.mutia.springdemo;

public class Dog implements  Animal {

    private final FoodService foodService;
    public Dog(FoodService foodService){
        this.foodService = foodService;
    }

    @Override
    public String communicate() {
        return "Bark: wooh wooh";
    }

    @Override
    public String getMeal() {
        return foodService.getTodaysFood();
    }
}
