package ke.co.mutia.springdemo;

public class Dog implements  Animal {
    @Override
    public String communicate() {
        return "Bark: wooh wooh";
    }
}
