package ke.co.mutia.springdemo;

public class Dog implements  Animal {



    private FoodService foodService;

    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    public Dog(){
        System.out.println("Constructing Dog.");
    }



    //public Dog(FoodService foodService){
    //    this.foodService = foodService;
    //}

    @Override
    public String communicate() {
        return "Bark: wooh wooh";
    }

    @Override
    public String getMeal() {
        return foodService.getTodaysFood();
    }
}
