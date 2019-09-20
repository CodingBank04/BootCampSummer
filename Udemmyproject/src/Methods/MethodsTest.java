package Methods;

public class MethodsTest {
    public static void main(String[] args) {
        //without static from prevoous page
        //MethodsAllTogether instance=new MethodsAllTogether();
        //MethodsAllTogether.printNumbers();

        //int number=MethodsAllTogether.balance;
        //System.out.println(number);

        //System.out.println(FourOperations.addTwoNumbers(3,5));

        //AsciiPractices.listASCII();
        //MethodsAllTogether.printMultipicationTable();
        //MethodsAllTogether.displayOddNumbers();

        //MethodsAllTogether oddnumbers = new MethodsAllTogether();
        //oddnumbers.printOddNumbers(4,19);

        //MethodsAllTogether.printOddNumbers(4,19);
       // MethodHW unitconversion = new MethodHW();
        //unitconversion.celsiusToFahrenheit(20);
        int celsius=30;
        double unitConversion=MethodHW.celsiusToFahrenheit(celsius);
        System.out.println(unitConversion);


    }}