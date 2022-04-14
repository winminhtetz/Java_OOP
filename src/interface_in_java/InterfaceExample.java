package interface_in_java;

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("Bicycle");
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(1);
        bicycle.speedUp(2);
        bicycle.applyBreak(1);
        bicycle.showState();

        System.out.println();

        System.out.println("Car");
        Car car = new Car();
        car.changeGear(4);
        car.speedUp(3);
        car.applyBreak(1);
        car.showState();

    }

}
