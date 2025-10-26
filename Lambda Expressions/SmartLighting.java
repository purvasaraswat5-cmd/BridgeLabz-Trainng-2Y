interface LightController {
    void activate();
}

public class SmartLighting {
    public static void main(String[] args) {
        LightController motionTrigger = () -> System.out.println("Lights ON due to motion detection.");
        LightController timeTrigger = () -> System.out.println("Lights ON at sunset.");
        LightController voiceTrigger = () -> System.out.println("Lights ON by voice command.");
        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
