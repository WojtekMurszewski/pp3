
public class InternetDevice{
    
    //atributes
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevice(String n, boolean c){
        name=n;
        connected=c;
    }
    
    public void displayStatus(){
        System.out.println(name + " " + connected);
    }
    
    public static void main(String[] args){
        InternetDevice i1 = new InternetDevice("computer", true);
        InternetDevice i2 = new InternetDevice("laptop", true);
        InternetDevice i3 = new InternetDevice("tablet", true);
        InternetDevice i4 = new InternetDevice("smartphone", false);
        InternetDevice i5 = new InternetDevice("TV", false);
        
        i1.displayStatus();
        i2.displayStatus();
        i3.displayStatus();
        i4.displayStatus();
        i5.displayStatus();
        
        if (i1.connected==true){
            connectedDevices+=1;
        }
        if (i2.connected==true){
            connectedDevices+=1;
        }
        if (i3.connected==true){
            connectedDevices+=1;
        }
        if (i4.connected==true){
            connectedDevices+=1;
        }
        if (i5.connected==true){
            connectedDevices+=1;
        }
        System.out.println(connectedDevices);
        
    }
}
