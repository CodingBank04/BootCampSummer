package Methods;

public class PyramidClasswork {
    public static void printPyramid(){
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

    public static void main(String[] args) {
        printPyramid();
        PyramidClasswork.printPyramid();
    }
}

