package MyStudy;

public class Store {
        // instance fields
        String productType;

        // constructor method
        public Store(String product) {
            productType = product;
        }

        // main method
        public static void main(String[] args) {
            Store lemonadeStand=new Store("lemonade");
            System.out.println(lemonadeStand.productType);

        }
    }

   // public Store(){
    //System.out.println("I am inside the constructor method.");

    /*As with other variable declarations, we specify the type: Car, and name: ferrari.
    Variables that reference an instance have a type of the class name.

    We invoke the constructor method: Car(), and use the keyword new to indicate that we’re creating an instance.
    Omitting new causes an error.

    This is the first time we’ve called a method that we’ve also defined. main() is
    run automatically and we did not define the println() method.
*/
    /*public static void main(String[] args) {
        System.out.println("Start of the main method.");

        Store lemonadeStand = new Store();
        System.out.println(lemonadeStand);



    }
}
*/