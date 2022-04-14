package abstraction_in_java;

public class MiPhone extends MobilePhone{
    @Override
    public void powerOn() {
        System.out.println("MI Phone is power on.");
    }

    @Override
    public void powerOff() {
        System.out.println("MI Phone is power off.");
    }
}
