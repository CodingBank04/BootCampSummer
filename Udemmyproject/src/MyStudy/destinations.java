package MyStudy;
import java.util.Scanner;
public class destinations {
    public static void main(String[] args) {
        Scanner dest = new Scanner(System.in);
        System.out.print("Where do you like to go (Houston H  or Seatle S)");
        String destinations = dest.next();

        if(destinations.equalsIgnoreCase("h")) {
            System.out.print("NYC(N)? Tampa(FL)? Sacremento(SC)?");
            String city = dest.next();
            if (city.equalsIgnoreCase("N")) {
                System.out.println("Total Distance is 1500 mile");
            } else if (city.equalsIgnoreCase("FL")) {
                System.out.println("Total Distance is 1000 mile");

            } else if (city.equalsIgnoreCase("SC")) {
                System.out.println("Total Distance is 1000 mile");
            } else {
                System.out.println("Invalid Entry");
            }
        }
        else if(destinations.equalsIgnoreCase("S")) {
                System.out.print("NYC(N)? Tampa(FL)? Seattlle(S)?");
                String city1 = dest.next();
                if (city1.equalsIgnoreCase("N")) {
                    System.out.println("Total Distance is 3500 mile");
                }
                else if (city1.equalsIgnoreCase("SC")) {
                    System.out.println("Total Distance is 4000 mile");
                }
                 else if (city1.equalsIgnoreCase("S")) {
                    System.out.println("Total Distance is 500 mile");
                }
                 else {
                    System.out.println("Invalid Entry");
                }
                }
         else{
                    System.out.println("Invalid");
                }
            }}








