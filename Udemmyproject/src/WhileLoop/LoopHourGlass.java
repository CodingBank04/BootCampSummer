package WhileLoop;

public class LoopHourGlass {
    public static void main(String[] args) {

        int row=14;
        int rowNum =(row +1)/2;

        for (int i=1; i<=rowNum;i++){

            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int q= i;q<=rowNum;q++){
                System.out.print(q+" ");
            }
            System.out.println();
        }
        for (int i=rowNum-1;i>=1;i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int q = i; q <= rowNum; q++) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }
}