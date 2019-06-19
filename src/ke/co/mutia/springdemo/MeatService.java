package ke.co.mutia.springdemo;

public class MeatService implements  FoodService {
    @Override
    public String getTodaysFood() {
        return "5kg of rabbit meat";
    }
}
