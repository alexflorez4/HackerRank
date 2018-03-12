package designPatterns.factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        /*
        BAD DESIGN!
        EnemyShip theEnemy = null;

        Scanner scanner =  new Scanner(System.in);
        String enemyOption = "";

        System.out.println("What type of ship? (U / R)");
        if(scanner.hasNextLine()){
            enemyOption = scanner.nextLine();
        }

        if(enemyOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        }else if(enemyOption.equals("R")){
            theEnemy = new RocketEnemyShip();
        }*/

        //Using Factory method:
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        System.out.println("What type of ship? (U / R / B)");
        Scanner scanner =  new Scanner(System.in);

        if(scanner.hasNextLine()){
            String typeOfShip = scanner.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
            System.out.println(theEnemy.getClass());
            if(theEnemy instanceof RocketEnemyShip){
                System.out.println("Rocket ship");
            }
        }else {
            System.out.println("No ship created.");
        }

        
    }

    private static void doStuffEnemy(EnemyShip ufoShip) {

        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.enemyShipShoots();
    }
}
