
public class Clock{
    
    static int hour;
    static int minute;
    static int alarmHour;
    static int alarmMinute;
    
    public Clock(){
        hour=0;
        minute=0;
    }
    public Clock(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    
    public static void setClock(int godzina,int minuta){
        hour=godzina;
        minute=minuta;
    }
    
    public static void setClock(){
        hour=0;
        minute=0;
    }
    
    public static void  displayTime(){
        String godzina="";
        String min="";
        
        if (hour<10){
            godzina="0"+String.valueOf(hour);
        }
        else{
            godzina=String.valueOf(hour);
        }
        if (minute<10){
            min="0"+String.valueOf(minute);
        }
        else{
            min=String.valueOf(minute);
        }
        System.out.println(godzina+":"+min);
    }
    
    public static void addOneMinute(){
        if (minute==59){
            hour+=1;
            minute=0;
            if (hour==24){
                hour=0;
            }
        }
        else{
            minute+=1;
        }
        if (alarmHour==hour){
            if (alarmMinute==minute){
                runAlarm();
            }
        }
    }
    
    public static void setAlarm(int godzina, int minuta){
        alarmHour=godzina;
        alarmMinute=minuta;
    }
    
    public static void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    
    public static void main(String[] args){
        Clock c1 = new Clock(12, 47);
        
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
    }
}
