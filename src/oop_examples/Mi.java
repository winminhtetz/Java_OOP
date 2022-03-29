package oop_examples;

public class Mi extends AndroidPhone{

    Camera camera;

    Mi(String androidVersion, Camera camera){
        super.androidVersion = androidVersion;
        this.camera = camera;
    }

    @Override
    public void powerOn() {
        System.out.println("Mi phone is on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Mi phone is off.");
    }
}
