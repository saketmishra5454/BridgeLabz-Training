package smart_home_lighting_automation;

public class SmartHomeLighting {

    public static void main(String[] args) {

        // Lambda for motion detection
        LightAction motionSensor = () -> {
            System.out.println("Motion detected: Lights turned ON (White Light)");
        };
        // Lambda for night time
        LightAction nightMode = () -> {
            System.out.println("Night Mode: Dim Yellow Lights Activated");
        };
        // Lambda for voice command
        LightAction voiceCommand = () -> {
            System.out.println("Voice Command: Blue Mood Lights Turned ON");
        };

        // Simulating different triggers
        System.out.println("=== Smart Home Lighting System ===");

        System.out.println("Trigger: Motion Sensor");
        motionSensor.activate();

        System.out.println();

        System.out.println("Trigger: Night Time");
        nightMode.activate();

        System.out.println();
        System.out.println("Trigger: Voice Command");
        voiceCommand.activate();
    }
}

