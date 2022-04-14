package abstraction_in_java;

public class AbstractionExample {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone();
        samsung.powerOn();
        samsung.powerOff();
        samsung.printInfo();

        System.out.println();

        MiPhone mi = new MiPhone();
        mi.powerOn();
        mi.powerOff();
        mi.printInfo();

        System.out.println();

        //you can also write like this
        MobilePhone mobilePhone1 = new SamsungPhone();
        mobilePhone1.powerOn();
        mobilePhone1.powerOff();
        mobilePhone1.printInfo();

        System.out.println();

        MobilePhone mobilePhone2 = new MiPhone();
        mobilePhone2.powerOn();
        mobilePhone2.powerOff();
        mobilePhone2.printInfo();

        System.out.println();

    }

}
