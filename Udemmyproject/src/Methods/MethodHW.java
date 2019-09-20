package Methods;

public class MethodHW {
    public static double celsiusToFahrenheit(double celsius){
        //Write a Java Method to convert Celsius to Fahrenheit o(C× 9/5 + 32)
        double fahrenheit=celsius*9/5+32;
        return fahrenheit;
    }
    //Write a Java Method to calculate BMI weight (lb) / [height (in)]2 x 703
    public static double calculateBMI(double weight, double height){
        double bmi=(weight)/Math.pow(height,2)*73;
        return bmi;
    }

public static void main(String[] args) {
        int celsius=30;
        double unitConversion=MethodHW.celsiusToFahrenheit(celsius);
        System.out.println( "Fahrenheit=" + unitConversion);

        double mass=MethodHW.calculateBMI(10,20);
        System.out.printf("Your BMI is %.2f", mass);
    }}


