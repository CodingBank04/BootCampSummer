package OCAudemy;

public class Conditions {
    public static void main(String[] args) {


        int num1 = 20;
        int num2 = 25;
        int num3 = 2;

        int enbuyuk = num1;

        if (enbuyuk < num2){
            enbuyuk=num2;

        }
        if (enbuyuk<num3){
            enbuyuk=num3;

        }
        System.out.println("enbuyuk" +  enbuyuk );
    }
}