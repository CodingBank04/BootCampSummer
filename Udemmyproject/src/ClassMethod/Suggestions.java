package ClassMethod;

public class Suggestions {

    public static void foodSuggestion(){

        double rand= Math.random()*3 +1;

           if((int) rand==1){
               System.out.println("drink soup");

            }
           else if((int)rand==2){
               System.out.println("eat hamburger");

        }
           else{
               System.out.println("Enjod salad");
           }



    }
    public static void clothSuggestion(){

        double rand= Math.random()*3 +1;

        if((int) rand==1){
            System.out.println("red shirt");

        }
        else if((int)rand==2){
            System.out.println("blue jean");

        }
        else{
            System.out.println("white hat");
        }


}}
