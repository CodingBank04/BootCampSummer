package OCAudemy;

public class MultiArrays {
    public static void main(String[] args) {


        String[][] cities = new String[3][3];
        cities[0][0] = "istanbul";
        cities[0][1] = "ankara";
        cities[0][2] = "manisa";
        cities[1][0] = "urfa";
        cities[1][1] = "istanbul";
        cities[1][2] = "gaziatnep";
        cities[2][0] = "yozgat";
        cities[2][1] = "kars";
        cities[2][2] = "agri";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }

        }
    }
}



