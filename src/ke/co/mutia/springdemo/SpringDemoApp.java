package ke.co.mutia.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = context.getBean("animal",Animal.class);

        System.out.println(animal.communicate());

        System.out.println("Lunch: "+animal.getMeal());

        Dog dog = context.getBean("animal",Dog.class);

        context.close();
    }

}
