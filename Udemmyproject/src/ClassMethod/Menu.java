package ClassMethod;

public class Menu {
    public static void soups() {
        String results = "";

        double rand = Math.random() * 3 + 1;

        if ((int) rand == 1) {
            results = ("lentil $3.99");

        } else if ((int) rand == 2) {
            results = "lentil $4.99";


        } else {
            results = "lentil $8.99";

        }
    }





    public static void meals(){
        String results="";

        double rand= Math.random()*3 +1;

        if((int) rand==1){
            results="rice $3.99";

        }
        else if((int)rand==2){
            results="chicken $5.99";


        }
        else{
            results="beef $7.99";

        }
}
    public static void salads(){
        String results="";

        double rand= Math.random()*3 +1;

        if((int) rand==1){
            results="ceaser $2.99";


        }
        else{
            results="waldord $3.99";

        }

}

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.soups();
        menu.meals();
        menu.salads();


    }
}
