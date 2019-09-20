package SelfStudy;

import java.sql.SQLOutput;

public class MenuRestaruantTotal {
    public static void displayMenu(){
        System.out.println(("<<<<<<<<FOOD CENTER>>>>>>>"));
        System.out.println("=============================");
        System.out.println("************MENU*************");
        System.out.print(" SOUPS  \n1 : Lentil \t [$3.99]  \n2 : Tomato\t [$4.99] \t\n3 : Fish\t [$8.99]\n\t" );
        System.out.print(" \nMEALS  \n1 : Rice \t [$3.99]  \n2 : Chicken\t [$5.99] \t\n3 : Beef\t [$7.99]\n" );
        System.out.print(" \nSALADS  \n1 : Ceaser \t [$2.99]  \n2 : Waldorf\t [$3.99] " );

        System.out.println("\n<<<<<<<<<<<<<<RECEIPT>>>>>>>>>>>>>>>>>>>>>");


    }


    public static double displayReceipt(double itemFood){

        double itemPrice=0;

        if(itemFood==1){
            System.out.println("You've ordered a Lentil Soup   : $2.99");
            itemPrice=itemPrice+2.99;
        }
        if(itemFood==2){
            System.out.println(" You've ordered a  Tomato Soup : $3.99");
            itemPrice=itemPrice+3.99;
        }
         if (itemFood==3){
            System.out.println("You've ordered a Fish Soup     : $8.99");
            itemPrice=itemPrice+8.99;
        }
        if(itemFood==4){
            System.out.println("You've ordered a Rice          : $2.99");
            itemPrice=itemPrice+2.99;
        }
        if (itemFood==5){
            System.out.println("You've ordered a Chicken       : $4.99");
            itemPrice=itemPrice+4.99;
        }
        if (itemFood==6){
            System.out.println("You've ordered a Beef          : $8.99");
            itemPrice=itemPrice+8.99;
        }
        if(itemFood==7){
            System.out.println("You've ordered a Ceasar        : $2.99");
            itemPrice=itemPrice + 2.99;
        }
        if (itemFood==5) {
            System.out.println("You've ordered a Waldorf       : $3.99");
            itemPrice=itemPrice+3.99;
        }
        return itemPrice;
    }
}





