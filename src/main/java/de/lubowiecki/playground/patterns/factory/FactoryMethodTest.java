package de.lubowiecki.playground.patterns.factory;

public class FactoryMethodTest {

    public static void main(String[] args) {

        // Referenztyp: RoboterFactory
        // Objekttyp: RoboterFactory
        // statische Methoden werden auf dem Referenztyp ausgeführt
        // Instanz-Methoden werden auf dem Objekttyp ausgeführt
        RobotFactory factory = new RobotFactory();

        // Referenztyp: RoboterFactory
        // Objekttyp: HaushaltRoboterFactory
        factory = new HaushaltRoboterFactory();

        Robot r1 = factory.create("R2-D2");
        System.out.println(r1.getName());
        System.out.println(r1.getXPos() + "," + r1.getYPos());
        System.out.println(r1.getSpezialFunktion());

        System.out.println();

        Robot r2 = factory.create("C3-PO", BotType.INDUSTRIE);
        System.out.println(r2.getName());
        System.out.println(r2.getXPos() + "," + r2.getYPos());
        System.out.println(r2.getSpezialFunktion());
    }
}
