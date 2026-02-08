// DeviceControlInterface.java

// Interface
interface SmartDevice {

    void turnOn();

    void turnOff();
}

// Light Class
class Light implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

// AC Class
class AC implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

// TV Class
class TV implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Main Class
public class DeviceControlInterface {

    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        // Turn ON devices
        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("---------------");

        // Turn OFF devices
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}