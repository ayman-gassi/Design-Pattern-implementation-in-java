
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl(lightOn, lightOff);
        remote.pressOnButton();
        remote.pressOffButton();
    }
}