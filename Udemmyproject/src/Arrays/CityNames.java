package Arrays;

public class CityNames {
    public static void main(String[] args) {
        String[] cities ={ "New York City , Los Angeles, Ann Arbor, Chicago, Albuquergue, Salt Lake City"};
        System.out.println("IN ORDER\t\t Reverse Order\n ************************");
        for(int i = 0; i < cities.length; i++)

            System.out.printf("%-18s", cities[i]);
           // System.out.printf("%-18s", cities[(i-5)* -1]);

        System.out.println();

    }

}
