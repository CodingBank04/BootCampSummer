package WhileLoop;

public class HourGlassWhileCW {
    public static void main(String[] args) {
        int lines=1;
        while(lines<8){

            int spaces=1;
            while(spaces<lines){
                System.out.print("-");
                spaces++;
        }
            int numbers=lines;
            while(numbers<8){
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println();
            lines++;
    }
}}
