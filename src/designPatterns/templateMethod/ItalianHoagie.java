package designPatterns.templateMethod;

public class ItalianHoagie extends Hoagie {

    String type = "Italian Hoagie";

    @Override
    void addMeat() {
        System.out.println("Adding the meat to " + type);
    }

    @Override
    void addCheese() {
        System.out.println("Adding the cheese to " + type);
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the vegetables to " + type);
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the condiments to " + type);
    }
}
