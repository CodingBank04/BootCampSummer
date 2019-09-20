package ClassMethod;

public class Loans {
    public int calcualteMortage(int month, int montlyPayment){

        //int restOfThePayment=montlyPayment*(360-month);
        //return montlyPayment*(360-month);

        int result =montlyPayment*(360-month);
        return result;

    }
    public double calculateCarInsurance(int carPrice, int months){
        double insurance= (carPrice/months)*0.9-months;
        return insurance;

    }


}
