
public class Lamps
                                                                                                                               {
    
    // Class attributes
    String isOn;
    
    // Class methods
    public void switchOn() {
        isOn="on";
    }

    public void switchOff() {
        isOn="off";
    }
    
    public void lampStatus() {
        System.out.println("Lamp is " + isOn + ".");
    }
}
