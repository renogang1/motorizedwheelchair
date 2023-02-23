package MotorizedWheelchair;

public class Main {
    
    public static void main(String[] args) {
        Wheelchair wheelchair = new Wheelchair();
        wheelchair.turnOn();
        wheelchair.moveForward();
        wheelchair.moveBackward();
        wheelchair.turnOff();
        wheelchair.moveForward();
    }
}
