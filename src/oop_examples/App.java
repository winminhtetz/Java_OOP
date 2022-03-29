package oop_examples;

public class App {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Mi mi6X = new Mi("10", camera);

        System.out.println(mi6X.androidVersion);
        mi6X.powerOn();
        mi6X.camera.openCamera();
        mi6X.camera.takePhoto();
        mi6X.camera.closeCamera();
        mi6X.powerOff();

    }
}
