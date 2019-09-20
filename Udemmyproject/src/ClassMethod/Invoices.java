package ClassMethod;

public class Invoices {
    // method to evaluate electric consuption

    public String evauluateElectric(int consuption){
        String result="";
        if (consuption>500 && consuption<1000){
            result = "Good Job";

        }
        else if(consuption>=1000 && consuption<1500){
            result="Not Bad";

        }
        else if (consuption>=1500){
            result ="Start to Save Energy";
        }
        else {
            System.out.println("Consuption is out of scope");
        }
        return result;
    }
    // Method for Internet Bill
    public String evalutateInternet(int speed){
        String result ="";
        if (speed>300){
            result="Good Speed";

        }
        else if(speed>100){
            result="Super speed";

        }
        else {
            result="speed out of scope";
        }
        return result;
    }
}
