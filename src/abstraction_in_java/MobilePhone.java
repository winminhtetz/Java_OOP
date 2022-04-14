package abstraction_in_java;

public abstract class MobilePhone {

    //abstract method : method without body
    public abstract void powerOn();
    public abstract void powerOff();

    //concrete method : method with body
    public void printInfo(){
        System.out.println("This is mobile phone.");
    }

}
