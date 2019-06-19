package ke.co.mutia.springdemo;

public class MeatService implements  FoodService {
    @Override
    public String getTodaysFood() {
        return "Lucky today, you having 5kg of rabbit meat";
    }
}
