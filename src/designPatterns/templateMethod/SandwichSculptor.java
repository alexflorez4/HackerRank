package designPatterns.templateMethod;

public class SandwichSculptor {

    public static void main(String[] args) {
        Hoagie customer12Hoagie = new ItalianHoagie();
        customer12Hoagie.makeSandwich();

        Hoagie customer13Hogie = new VeggieHoagie();
        customer13Hogie.makeSandwich();
    }
}
