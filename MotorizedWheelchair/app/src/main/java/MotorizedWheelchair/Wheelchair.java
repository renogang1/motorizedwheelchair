package MotorizedWheelchair;

public class Wheelchair {
    public boolean isOn = false;
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Wheelchair turned on");
        } else {
            System.out.println("Wheelchair is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Wheelchair turned off");
        } else {
            System.out.println("Wheelchair is already off");
        }
    }

    public void moveForward() {
        if (isOn) {
            System.out.println("Wheelchair moving forward");
        } else {
            System.out.println("Turn on the wheelchair first");
        }
    }

    public void moveBackward() {
        if (isOn) {
            System.out.println("Wheelchair moving backward");
        } else {
            System.out.println("Turn on the wheelchair first");
        }
    }
}
