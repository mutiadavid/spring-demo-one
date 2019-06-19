package ke.co.mutia.springdemo;

public class Human implements Animal {
    @Override
    public String communicate() {
        return "Talk: lets gossip about this spring framework.";
    }
}
