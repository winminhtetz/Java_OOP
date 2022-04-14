package abstraction_in_java;

public class SamsungPhone extends MobilePhone{
    @Override
    public void powerOn() {
        System.out.println("Samsung Phone is power on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung Phone is power off.");
    }
}
