package Arrays;

public class TenByTenArray {
    public static void main(String[] args) {
        System.out.println();

        int[][] numbers = new int[10][10];
        int counter = 1;
        int rowTotal=0;
        int columnTotal=0;
        int [] divisible = new int [100]; int d=0;
​
        for (int i = 0; i <numbers.length; i++) {
            for(int j=0; j<numbers[i].length; j++) {
                numbers[i][j] = counter; counter++;
                System.out.printf("%-3d ",numbers[i][j]);
                rowTotal=rowTotal+numbers[i][j];
                if(numbers[i][j]%4==0) {divisible[d]=numbers[i][j]; d++;}
            }
            System.out.print(" = "+rowTotal);
            System.out.println(); rowTotal=0;
        }
        System.out.println("=======================================");
        for(int i=0; i<numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                columnTotal=columnTotal+numbers[k][i];
            }
            System.out.printf("%-3d ", columnTotal);
            columnTotal = 0;
        }
        System.out.println("\n\nNumbers divisible by 4 : ");
        for (int divnum:divisible
        ) { if(divnum!=0){
            System.out.print(divnum+" "); }
        }
    }
}
