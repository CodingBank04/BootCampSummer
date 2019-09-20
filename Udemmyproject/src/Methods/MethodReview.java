package Methods;

public class MethodReview {
    public static void main(String[] args) {
        //System.out.println("Mehmet");
        //printMyName();
        //printMynameParameter("Mehmet(void with parameter");
        //System.out.println(printMyNameString());
        System.out.println(printMyNameStringParameter("john"));
        String myName= "john";
        System.out.println(printMyNameStringParameter(myName));
    }
    //void method without parameter
    public static void printMyName(){
        System.out.println("Mehmet(void without parameter");
    }
    // void method with parameter
    public static void printMynameParameter(String name){
        System.out.println(name);

    }
    //String method without parameter;
    public static String printMyNameString(){
        String returnName="Mehmet(string print without parameter";
        return returnName;

    }
    public static String printMyNameStringParameter(String name){
        return name;
    }



}
