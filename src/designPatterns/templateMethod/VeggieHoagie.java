package designPatterns.templateMethod;

public class VeggieHoagie extends Hoagie {

    String type = "Veggie Hoagie";

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {
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
