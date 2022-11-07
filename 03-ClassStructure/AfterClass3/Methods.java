
public class Methods{
    
    public static void CelsiusToKelvin(int value){
        System.out.println(value+273.15);
    }
    
    public static void CelsiusToFahrenheit(int value){
        System.out.println(value*1.8+32);
    }
    
    public static void KelvinToCelsius(int value){
        System.out.println(value-273.15);
    }
    
    public static void KelvinToFahrenheit(int value){
        System.out.println((value-273)*1.8+32);
    }
    
    public static void FahrenheitToCelsius(int value){
        System.out.println((value-32)*5/9);
    }
    
    public static void FahrenheitToKelvin(int value){
        System.out.println((value-32)*5/9+273.15);
    }
    
    public static void Display(){
        System.out.println("25 Celsius to Kelvin: "); CelsiusToKelvin(25);
        System.out.println("25 Celsius to Fahrenheit: "); CelsiusToFahrenheit(25);
        System.out.println("100 Fahrenheit to Kelvin: "); FahrenheitToKelvin(100);
        System.out.println("100 Fahrenheit to Celsius: ");FahrenheitToCelsius(100);
        System.out.println("0 Kelvin to Celsius: ");KelvinToCelsius(0);
        System.out.println("0 Kelvin to Fahrenheit: ");KelvinToFahrenheit(0);
    }
}
