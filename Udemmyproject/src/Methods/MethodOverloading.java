package Methods;

public class MethodOverloading {
    public static void calculatingScore(String name, int score) {
        System.out.println(name + " got "+ score +" from given subject.");

    }

    public static void addition(String firstname,String lastname){
        System.out.println(firstname+ " "+lastname);
    }
    public static void addition(int a, int b){
        System.out.println("Addition= "+(a+b));

    }
    public static void addition(int a, int b, int c){


        System.out.println("Addition= "+(a+b+c));
    }

    public static void main(String[] args) {
        addition(3,2,4);
        addition(2,4);
        addition("John", "heather");
        calculatingScore("John",20);
    }
}
