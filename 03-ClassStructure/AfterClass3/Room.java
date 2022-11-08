
public class Room{
    
    static int number;
    static int beds;
    boolean occupied;
    String guestName;
    
    public Room(int number){
        this.number=number;
        beds=2;
    }
    
    public Room(int number, int beds){
        this.number=number;
        this.beds=beds;
    }
    
    public static void checkin(String guestName){
        this.guestName=guestName;
    }
    
    public static void ckeckout(){
        
    }
    
    public static void isOccupied(){
        this.occupied=!occupied;
    }
    
    public static void displayStatus(){
        System.out.println("Room number: "+number+", "+"Number of beds: "+beds
        +", "+"Is occupied: "+occupied+", "+"Guest name: "+guestName);
    }
    
    public static void displayListOfRooms(){
        for (int i=0;i<6;i++){
            displayStatus(rooms[i]);
        }
    }
    
    public static void displayListOfRooms(int lozka){
        for (int i=0;i<6;i++){
            if (beds==lozka){
                displayStatus(rooms[i]);
            }
        }
    }
    
    public static void CreatingRooms(String[] args){
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4, 3);
        Room r5 = new Room(5, 3);
        Room r6 = new Room(6, 1);
        
        Room[] rooms={r1,r2,r3,r4,r5,r6};
        
    }
}