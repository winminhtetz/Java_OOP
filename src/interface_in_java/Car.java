package interface_in_java;

public class Car implements Vehicle{
    int gear;
    int speed;
    @Override
    public void changeGear(int number) {
        gear += number; //gear = gear + number;
    }

    @Override
    public void speedUp(int number) {
        speed += number; //speed = speed + number;
    }

    @Override
    public void applyBreak(int number) {
        speed = speed - number;
    }

    public void showState(){
        System.out.println("gear : " + gear);
        System.out.println("speed : " + speed);
    }
}
