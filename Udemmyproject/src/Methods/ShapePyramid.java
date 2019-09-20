package Methods;

public class ShapePyramid {
    public static void printPyramid(int lines,String symbol){
        for(int i=1 ; i<=lines ; i++){
            for(int j=11 ; j>i ; j-- ){
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    public static void printUpSideDownPyramid(){
        //lines
        int limit =19;
        for(int i=1 ; i<11 ; i++){
            //spaces
            for(int j=1 ; j< i ; j++){
                System.out.print("  ");
            }
            //stars
            for(int k =limit  ; k > 0 ; k--){
                System.out.print(" *");
            }
            limit = limit-2;
            System.out.println();
        }
    }
}

