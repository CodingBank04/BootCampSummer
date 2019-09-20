package WhileLoop;

public class PyramidNew {
    public static void main(String[] args) {

        int limitspaces =11;
        int limitstars=1;
        for(int i=1; i<11; i++){

            for(int j=1; j<limitspaces; j++){
                System.out.print("  ");

            }
            for (int k=1;k<=limitstars;k++){
                System.out.print(("* "));

            }
            System.out.println();
            limitspaces--;
            limitstars=limitstars+2;

        }
    }
}