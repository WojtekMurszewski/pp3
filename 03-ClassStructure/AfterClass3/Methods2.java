
public class Methods2{
    
    public static void itemsInRange(int x, int y){
        System.out.println(y-x+1);
    }
    
    
    public static void sumInRange(int x, int y){
        int wynik=0;
        for (int i = x; i<y+1; i++){
            wynik+=i;
        }
        System.out.println(wynik);
    }
    
    public static void arithmeticMeanInRange(int x, int y){
        float ile=y-x+1;
        float suma=0;
        for (int i = x; i<y+1; i++){
            suma+=i;
        }
        float wynik=suma/ile;
        System.out.println(wynik);
    }
}
