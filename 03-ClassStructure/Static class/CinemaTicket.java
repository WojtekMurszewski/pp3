
public class CinemaTicket{
    
    static String cinemaName = "Kino Krakow";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public CinemaTicket(String t, int r, int s){
        filmTitle = t;
        row = r;
        seat = s;
        if (r<=2){
            price = 10;
        }
        else{
            price = 25;
        }
    }
    public void displayTicketData(){
        System.out.println("Cinema name: "+ cinemaName);
        System.out.println("Film title: "+ filmTitle);
        System.out.println("Row: "+ row);
        System.out.println("Seat: "+ seat);
        System.out.println("Ticket price: "+ price);
    }
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 12);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, 8);
        
        t1.displayTicketData();
        t2.displayTicketData();
    }
}
