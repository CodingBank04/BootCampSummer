package SelfStudy;

public class MenuRestaruant {
    public static void displayMenu(){
        System.out.println(("<<<<<<<<FOOD CENTER>>>>>>>"));
        System.out.println("=============================");
        System.out.println("************MENU*************");
        System.out.print(" SOUPS  \n1 : Lentil \t [$3.99]  \n2 : Tomato\t [$4.99] \t\n3 : Fish\t [$8.99]\n\t" );
        System.out.print(" \nMEALS  \n1 : Rice \t [$3.99]  \n2 : Chicken\t [$5.99] \t\n3 : Beef\t [$7.99]\n" );
        System.out.print(" \nSALADS  \n1 : Ceaser \t [$2.99]  \n2 : Waldorf\t [$3.99] " );

    }


    public static void displayReceipt(int itemSoup, int itemMeal, int itemSalad){
        System.out.println();
        System.out.println("<<<<<<<<<<RECEIPT>>>>>>>>>>>\n");

        double itemPrice=0;
        if(itemSoup==1){
            System.out.println("You've ordered a Lentil Soup : $2.99");
            itemPrice=itemPrice+2.99;
        }
        else if(itemSoup==2){
            System.out.println("You've ordered a  Tomato Soup : $3.99");
            itemPrice=itemPrice+3.99;
        }
        else {
            System.out.println("You've ordered a Fish Soup : $8.99");
            itemPrice=itemPrice+8.99;
        }
        if(itemMeal==1){
            System.out.println("You've ordered a Rice : $2.99");
            itemPrice=itemPrice+2.99;
        }
        else if (itemMeal==2){
            System.out.println("You've ordered a Chicken : $4.99");
            itemPrice=itemPrice+4.99;
        }
        else {
            System.out.println("You've ordered a Beef : $8.99");
           itemPrice=itemPrice+8.99;
        }
        if(itemSalad==1){
            System.out.println(" You've ordered a Ceasar  : $2.99");
            itemPrice=itemPrice + 2.99;
        }
        else {
            System.out.println("You've ordered a Waldorf : $3.99");
            itemPrice=itemPrice+3.99;
        }
        double tax =7/100;
        System.out.println("Subtotal is: $" + itemPrice );

        System.out.println("Your total amount is: $" + itemPrice + itemPrice*tax );

        System.out.println("Enjoy your meal!");

    }
}




