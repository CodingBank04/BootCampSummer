package SelfStudy;

public class PrintingTest {
    public static void main(String[] args) {
        Printingg.printMyName("john");
        System.out.println();

        Printingg.printOneToHundred();

        double cube1=Retuning.calculateVolumeCube(3);
        double cube2=Retuning.calculateVolumeCube(7);
        double cube3=Retuning.calculateVolumeCube(8);

        double total= cube1+cube2+cube3;
        System.out.println("Your total is " + total);


    }
}
