package MyStudy;


public class StoreInventory {
        // instance fields
        String productType;
        int inventoryCount;
        double inventoryPrice;

        // constructor method
        public StoreInventory(String product, int count, double price) {
            productType = product;
            inventoryCount=count;
            inventoryPrice=price;
        }

        // main method
        public static void main(String[] args) {

            StoreInventory cookieShop=new StoreInventory("cookies",12,3.75);
            System.out.println(cookieShop.inventoryCount);

        }
    }
