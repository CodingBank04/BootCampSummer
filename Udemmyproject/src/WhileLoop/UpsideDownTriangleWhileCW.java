package WhileLoop;

public class UpsideDownTriangleWhileCW {
    public static void main(String[] args) {


        int limitInner=6;

        int outer=6;
        while(outer<6){

            int spaces=1;
            while(spaces<limitInner) {

                System.out.print(" ");
                spaces++;

            }
            int inner=1;

            while(inner<outer){
            System.out.print(" * ");
            inner++;



                }

            limitInner--;
            System.out.println();
            outer++;

        }
}}
