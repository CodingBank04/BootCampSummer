package WhileLoop;

public class PyramidWhileCW {
    public static void main(String[] args) {
        int lines=0;

            while(lines<8){
                int spaces=7;

            while(spaces>=lines){
                System.out.print("-");
                spaces--;
            }
            int stars=1;
            while(stars<(2*lines)+2){
                System.out.print("^");
                stars++;
            }
                System.out.println();
                lines++;

            }


        }
    }
