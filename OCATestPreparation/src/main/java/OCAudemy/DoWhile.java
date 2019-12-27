package OCAudemy;

public class DoWhile {
    public static void main(String[] args) {
        int j=11;
        do {
            System.out.println("LOGLANDI");
            System.out.println(j);
            j+=2;

        }while (j<10);
        System.out.println("Do WHILE IS ENDING ");
    }

    public static class Switch {


        public static void main(String[] args) {
            char grade ='G';

            switch (grade){

                case 'A':
                    System.out.println("Excellent  : Passed");
                    break;
                case 'B':
                    System.out.println("Great passed");
                    break;
                case 'C':
                    System.out.println("Good passed");
                    break;
                case 'D':
                    System.out.println("Satisfactory passed");
                    break;
                case'F':
                    System.out.println(" Failed");
                    break;
                default:
                    System.out.println("Invalid grade");
            }
        }
    }
}

